package calculator.step1;

import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean run = true;

        while (run) {

            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요(+, -, x, /): ");
            char op = sc.next().charAt(0);

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            int result = 0;

            switch (op) {
                case '+':
                    result = num1 + num2;
                    System.out.println("결과: " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("결과: " + result);
                    break;
                case 'x':
                    result = num1 * num2;
                    System.out.println("결과: " + result);
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("분모에 0이 들어갈 수 없습니다.");
                        break;
                    } else {
                        result = num1 / num2;
                        System.out.println("결과: " + result);
                    } break;
            }
            sc.nextLine();
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String quit = sc.nextLine();
            if (!Objects.equals(quit, "exit")) {
                continue;
            } else {
                System.out.println("계산을 종료합니다.");
                run = false;
            }
        }
    }
}
