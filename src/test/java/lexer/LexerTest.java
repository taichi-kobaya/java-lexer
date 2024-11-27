package lexer;

import org.junit.jupiter.api.Test;
import lexer.Token;

import static org.junit.jupiter.api.Assertions.*;

class LexerTest {
    @Test
    void testReadNumber() {
        Lexer lexer = new Lexer();
        Token token = lexer.read("123");
        assertTrue(token instanceof Token.NumberToken);
        assertEquals(123, ((Token.NumberToken) token).getNumber());
    }
}
