package calculator.step3;

import java.util.ArrayList;
import java.util.List;

public class AritnmeticCalculator {
    private static List<Integer> results = new ArrayList<>();

    public static List<Integer> getResult() {
        return new ArrayList<>(results);
    }

    public static void setResults(List<Integer> results) {
        AritnmeticCalculator.results = results;
    }

    public int calculate(OperatorType op, int num1, int num2) {
        int result = op.apply(num1, num2);
        results.add(result);
        return result;
    }

    // 가장 먼저 저장된 데이터 삭제
    public static void removeFirstResult() {
        results.remove(0);
    }
}
