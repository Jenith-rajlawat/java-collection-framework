package dynamic_programming;
//Dynamic Programming is a technique used for solving optimization problems by breaking them down into simpler subproblems and solving each subproblem only once, storing the solutions to subproblems to avoid redundant computations.

//Optimal Substructure:
//
//An optimal solution to the problem can be constructed from optimal solutions of its subproblems.
//Overlapping Subproblems:
//
//The problem can be broken down into subproblems, which are reused several times.
import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    private static Map<Integer, Integer> memo = new HashMap<>();

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        int result = fibonacci(n - 1) + fibonacci(n - 2);
        memo.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        int n = 6;
        int result = fibonacci(n);
        System.out.println("Fibonacci of " + n + ": " + result);
    }
}
