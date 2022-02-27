<<<<<<< HEAD
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
=======
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
>>>>>>> aa12e26b5d4dc7afcdfc3c4b3383140b8b60bc35
}