package de.xxcleanxx.pvpskylib.common.strings;

import de.xxcleanxx.pvpskylib.common.strings.SyntaxToken.*;

import java.util.ArrayList;
import java.util.List;

public class Parser {
    public String[] parse(String[] strings) {
        List<TokenBase> tokens = new ArrayList<>();
        String string = StringsCore.concat(strings);
        char[] chars = string.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        boolean opened = false;
        int textStart = -1;

        for (int i = 0; i < chars.length; i++) {
             if (chars[i] == '"') {
                 if (!opened) {
                     tokens.add(new StartToken(i));

                     opened = true;
                 } else {
                     tokens.add(new EndToken(i));

                     opened = false;
                 }
             }
        }

        for(int i = 0; i < chars.length; i++) {

            if (chars[i] == '"') {
                if (!opened) {
                    tokens.add(new StartToken(i));

                    opened = true;
                } else {
                    if (textStart > -1) {
                        tokens.add(new TextToken(textStart, stringBuilder.toString()));
                        textStart = -1;
                        stringBuilder = new StringBuilder();
                    }

                    tokens.add(new EndToken(i));

                    opened = false;
                }
            } else if (chars[i] == '\\') {
                if (i + 1 < chars.length) {
                    tokens.add(new EscapeToken(i, chars[i + 1]));
                    i++;
                }
            } else {
                if (!opened) {
                    continue;
                }

                if (textStart == -1) {
                    textStart = i;
                }

                stringBuilder.append(chars[i]);
            }
        }

        return getTextFromTokens(tokens.toArray(new TokenBase[0]));
    }

    public static String[] getTextFromTokens(TokenBase[] tokens) {
        List<String> strings = new ArrayList<>();

        for (TokenBase item : tokens) {
            if (item.getTokenType() == TokenType.TEXT) {
                strings.add(((TextToken)item).getText());
            }
        }

        return strings.toArray(new String[0]);
    }
}