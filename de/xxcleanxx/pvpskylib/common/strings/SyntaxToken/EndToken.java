<<<<<<< HEAD
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
=======
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
>>>>>>> aa12e26b5d4dc7afcdfc3c4b3383140b8b60bc35
}