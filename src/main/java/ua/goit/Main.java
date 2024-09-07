package ua.goit;

public class Main {
    public static void main(String[] args) {
        FibonacciService fibonacciService = new FibonacciService();
        System.out.println("fibonacciService.fibonacciIterative(21) = " + fibonacciService.fibonacciIterative(21));
        System.out.println("fibonacciService.fibonacciRecursive(21) = " + fibonacciService.fibonacciRecursive(21));
        System.out.println("fibonacciService.fibonacciMemo(21) = " + fibonacciService.fibonacciMemo(21));
    }
}