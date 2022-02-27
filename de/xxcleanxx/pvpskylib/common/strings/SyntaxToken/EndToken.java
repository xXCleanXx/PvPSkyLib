package de.xxcleanxx.pvpskylib.common.strings.SyntaxToken;

public class EndToken extends TokenBase {
    private char _endChar;

    public EndToken(int position, char endChar) {
        super(TokenType.END, position);
        this.setEndChar(endChar);
    }

    public EndToken(int position) {
        this(position, '"');
    }

    public char getEndChar() {
        return this._endChar;
    }

    public void setEndChar(char endChar) {
        this._endChar = endChar;
    }
}