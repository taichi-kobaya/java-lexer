package lexer;

import lexer.Token;

public class Lexer {
    public Token read(String input) {
        if (input.matches("\\d+")) {
            return new Token.NumberToken(1, Integer.parseInt(input));
        }
        return Token.EOF;
    }
}
