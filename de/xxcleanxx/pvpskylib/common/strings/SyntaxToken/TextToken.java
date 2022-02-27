<<<<<<< HEAD
package de.xxcleanxx.pvpskylib.common.strings.SyntaxToken;

public class TextToken extends TokenBase {
    private String _text;

    public TextToken(int position, String text) {
        super(TokenType.TEXT, position);
        this.setText(text);
    }

    public String getText() {
        return this._text;
    }

    public void setText(String text) {
        this._text = text;
    }
=======
package de.xxcleanxx.pvpskylib.common.strings.SyntaxToken;

public class TextToken extends TokenBase {
    private String _text;

    public TextToken(int position, String text) {
        super(TokenType.TEXT, position);
        this.setText(text);
    }

    public String getText() {
        return this._text;
    }

    public void setText(String text) {
        this._text = text;
    }
>>>>>>> aa12e26b5d4dc7afcdfc3c4b3383140b8b60bc35
}