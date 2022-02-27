package de.xxcleanxx.pvpskylib.common.strings.SyntaxToken;

import java.util.ArrayList;
import java.util.List;

public class StringToken extends TokenBase {
    private List<TokenBase> _tokens;

    public StringToken(int position, String string) {
        super(TokenType.STRING, position);
    }

    public List<TokenBase> getTokens() {
        if (this._tokens == null) this.setTokens(new ArrayList<>());

        return this._tokens;
    }

    public void setTokens(List<TokenBase> tokens) {
        this._tokens = tokens;
    }

    public void addToken(TokenBase token) {
        if (token == null) throw new IllegalArgumentException("Token cannot be null!");


        this.getTokens().add(token);
    }

    public void removeToken(int index) {
        this.getTokens().remove(index);
    }
}