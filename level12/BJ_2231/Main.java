package level12.BJ_2231;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        int constructor = findConstructor(N);

        System.out.println(constructor);

        bf.close();
    }

    public static int findConstructor(int N) {
        final int NO_CONSTRUCTOR = 0;

        int minPossible = N - countDigits(N)*9;

        for (int i = minPossible; i < N; i++) {
            if (i + digitSum(i) == N) {
                return i;
            }
        }

        return NO_CONSTRUCTOR;
    }

    public static int countDigits(int N) {
        return Integer.toString(N).length();
    }

    public static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
