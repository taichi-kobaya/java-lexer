package lexer;

public abstract class Token {
    public static final Token EOF = new EOFToken();

    public static class EOFToken extends Token {}

    public static class NumberToken extends Token {
        private final int value;
        public NumberToken(int line, int value) {
            this.value = value;
        }
        public int getNumber() { return value; }
    }
}
