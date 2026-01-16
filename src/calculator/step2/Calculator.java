package calculator.step2;

import javax.xml.transform.Result;
import java.util.ArrayList;
import java.util.List;

public class Calculator {
    List<Integer> results = new ArrayList<>();

    public void calculate(int num1, int num2, char op) {
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
                }
        }
        results.add(result);
    }
}
