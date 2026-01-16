package calculator.step3;

public enum OperatorType {

    SUM('+') {
        @Override
        public int apply(int a, int b) {
            return a + b;
        }
    },
    SUB('-') {
        @Override
        public int apply(int a, int b) {
            return a - b;
        }
    },
    MUL('x') {
        @Override
        public int apply(int a, int b) {
            return a * b;
        }
    },
    DIV('/') {
        @Override
        public int apply(int a, int b) {
            if (b == 0) {
                throw new IllegalArgumentException("분모에 0이 들어갈 수 없습니다.");
            }
            return a / b;
        }
    };

    // 기호를 생성
    private char symbol;

    OperatorType(char symbol) {
        this.symbol = symbol;
    }

    public abstract int apply(int a, int b);

    public char getSymbol() {
        return symbol;
    }

// 캐릭터로 된 사칙연산기호를 전달받으면 거기에 매칭되는 열거체(SUM, SUB ...) 로 바꿔주는 기능
    public static OperatorType convert(char op) {
        switch (op) {
            case '+' -> {
                return SUM;
            }
            case '-' -> {
                return SUB;
            }
            case 'x' -> {
                return MUL;
            }
            case '/' -> {
                return DIV;
            }
            default -> {
                return null;
            }
        }
    }
}
