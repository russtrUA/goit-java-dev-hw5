package ua.goit;

import java.util.HashMap;
import java.util.Map;

public class FibonacciService {
    private static final Map<Integer, Long> memo = new HashMap<>();

    //Ітеративний метод. Часова складність: O(n). Просторова: O(1)
    public long fibonacciIterative(int input) {
        if (input <= 1) {
            return input;
        }
        long current = 1;
        long prev = 0;
        for (int i = 1; i < input; i++) {
            current += prev;
            prev = current - prev;
        }
        return current;
    }

    //Рекурсивний метод. Часова складність: O(2^n). Просторова: O(n)
    public long fibonacciRecursive(int input) {
        if (input <= 1) {
            return input;
        }
        return fibonacciRecursive(input - 1) + fibonacciRecursive(input - 2);
    }

    //За принципом динамічного програмування.Часова складність: O(n). Просторова: O(n)
    public long fibonacciMemo(int input) {
        if (input <= 1) {
            return input;
        }
        if (memo.containsKey(input)) {
            return memo.get(input);
        }
        long current = fibonacciMemo(input - 1) + fibonacciMemo(input - 2);
        memo.put(input, current);
        return current;
    }
}