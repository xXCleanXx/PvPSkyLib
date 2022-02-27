package de.xxcleanxx.pvpskylib.common.strings.SyntaxToken;

public class StartToken extends TokenBase {
    private char _startChar;

    public StartToken(int position, char startChar) {
        super(TokenType.START, position);
        this.setStartChar(startChar);
    }

    public StartToken(int position) {
        this(position, '"');
    }

    public char getStartChar() {
        return this._startChar;
    }

    public void setStartChar(char startChar) {
        this._startChar = startChar;
    }
}