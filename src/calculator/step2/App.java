package calculator.step2;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();

        boolean run = true;

        while (run) {

            boolean inputNum1 = true;
            boolean inputNum2 = true;
            boolean inputOp = true;
            int num1 = 0;
            int num2 = 0;
            char op = 0;

            while (inputNum1) {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                if (sc.hasNextInt()) {
                    num1 = sc.nextInt();
                    inputNum1 = false;
                } else {
                    sc.next();
                    System.out.println("양의 정수(0포함)를 입력하세요!");
                }
            }

            while (inputOp) {
                System.out.print("사칙연산 기호를 입력하세요(+, -, x, /): ");
                op = sc.next().charAt(0);
                if (op == '+' || op == '-' || op == 'x' || op == '/') {
                    inputOp = false;
                } else {
                    sc.next();
                    System.out.println("잘못된 기호입니다.(+, -, x, /) 중 하나를 입력하세요!");
                }
            }

            while (inputNum2) {
                System.out.print("두 번째 숫자를 입력하세요: ");
                if (sc.hasNextInt()) {
                    num2 = sc.nextInt();
                    inputNum2 = false;
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
        System.out.println("저장된 결과를 조회하시겠습니까?");
        System.out.println("예: y, 아니오: any key");
        String confirmView = sc.next();
        if (confirmView.equals("y")) {
            System.out.println("저장된 결과: " + Calculator.getResult());
        }
    }
}
