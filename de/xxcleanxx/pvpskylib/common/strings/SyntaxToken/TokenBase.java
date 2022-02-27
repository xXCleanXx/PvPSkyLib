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
}