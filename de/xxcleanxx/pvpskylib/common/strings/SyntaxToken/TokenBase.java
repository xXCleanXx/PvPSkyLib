<<<<<<< HEAD
package de.xxcleanxx.pvpskylib.common.strings.SyntaxToken;

public abstract class TokenBase {
    protected TokenType _tokenType;
    protected int _position;

    public TokenBase(TokenType tokenType, int position) {

    }

    public TokenType getTokenType() {
        return this._tokenType;
    }

    public void setTokenType(TokenType tokenType) {
        this._tokenType = tokenType;
    }

    public int getPosition() {
        return this._position;
    }

    public void setPosition(int position) {
        this._position = position;
    }
=======
package de.xxcleanxx.pvpskylib.common.strings.SyntaxToken;

public abstract class TokenBase {
    protected TokenType _tokenType;
    protected int _position;

    public TokenBase(TokenType tokenType, int position) {

    }

    public TokenType getTokenType() {
        return this._tokenType;
    }

    public void setTokenType(TokenType tokenType) {
        this._tokenType = tokenType;
    }

    public int getPosition() {
        return this._position;
    }

    public void setPosition(int position) {
        this._position = position;
    }
>>>>>>> aa12e26b5d4dc7afcdfc3c4b3383140b8b60bc35
}