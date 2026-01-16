package calculator.step2;

import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean run = true;

        while (run) {

            Calculator cal = new Calculator();

            boolean inputnum1 = true;
            boolean inputnum2 = true;
            boolean inputop = true;
            int num1 = 0;
            int num2 = 0;
            char op = 0;

            while (inputnum1) {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                if (sc.hasNextInt()) {
                    num1 = sc.nextInt();
                    inputnum1 = false;
                } else {
                    sc.next();
                    System.out.println("양의 정수(0포함)를 입력하세요!");
                }
            }

            while (inputop) {
                System.out.print("사칙연산 기호를 입력하세요(+, -, x, /): ");
                op = sc.next().charAt(0);
                if (op == '+' || op == '-' || op == 'x' || op == '/') {
                    inputop = false;
                } else {
                    sc.next();
                    System.out.println("잘못된 기호입니다.(+, -, x, /) 중 하나를 입력하세요!");
                }
            }

            while (inputnum2) {
                System.out.print("두 번째 숫자를 입력하세요: ");
                if (sc.hasNextInt()) {
                    num2 = sc.nextInt();
                    inputnum2 = false;
                } else {
                    sc.next();
                    System.out.println("양의 정수(0포함)를 입력하세요!");
                }
            }

            cal.calculate(num1, num2, op);
            sc.nextLine();
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String quit = sc.next();
            if (!Objects.equals(quit, "exit")) {
                continue;
            } else {
                System.out.println("계산을 종료합니다.");
                run = false;
            }
        }
    }
}
