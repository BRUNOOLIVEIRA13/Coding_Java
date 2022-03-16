package HackerRank.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1001RecursionAndDP {

    /**
     * Fib formula:
     *  fib[n] = fib[n-1] + fib[n-2];
     *         fib[0] = 0
     *         fib[1] = 1
     *         fib[2] = 1
     */

    // 1 - recursive sem DP
    static Integer fib1(int n) {
        if (n < 2) return n;
        return fib1(n - 1) + fib1(n - 2);
    }

    // 2 - DP bottom-up
    static Integer fib2(int n) {
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <=n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }

    // 3 - recursao usando DP
    static Integer fib3(int n, int[] arr) {
        if(n < 2) return arr[n] = n;

        if(arr[n] != 0) return arr[n];

        return arr[n] = fib3(n-1, arr) + fib3(n-2, arr);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            Integer n = Integer.parseInt(reader.readLine());
//            System.out.println(fib(n));
//            System.out.println(fib2(n));
            int[] arr = new int[n+1]; //armazenando os resultados
            System.out.println(fib3(n, arr));
        }
    }
}
