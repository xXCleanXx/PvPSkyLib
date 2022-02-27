package de.xxcleanxx.pvpskylib.common.strings.SyntaxToken;

public class EscapeToken extends TokenBase {
    private char _escapeChar;
    private char _escapedChar;

    public EscapeToken(int position, char escapeChar, char escapedChar) {
        super(TokenType.ESCAPE, position);
        this.setEscapeChar(escapeChar);
        this.setEscapedChar(escapedChar);
    }

    public EscapeToken(int position, char escapedChar) {
        this(position, '\\', escapedChar);
    }

    public char getEscapeChar() {
        return this._escapeChar;
    }

    public void setEscapeChar(char escapeChar) {
        this._escapeChar = escapeChar;
    }

    public char getEscapedChar() {
        return this._escapedChar;
    }

    public void setEscapedChar(char escapedChar) {
        this._escapedChar = escapedChar;
    }
}