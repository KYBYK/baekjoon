package level12.BJ_2231;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        int digitSum = findMinDigitSum(N);

        System.out.println(digitSum);
    }

    public static int findMinDigitSum(int N) {
        final int NOT_FIND_DIGIT_SUM = 0;
        int digits = countDigits(N);
        int targetMinNum = N - (digits * 9);

        for(int i = targetMinNum; i < N; i++) {
            int checkNum = i;
            int sum = 0;

            while (checkNum > 0) {
				sum += checkNum % 10;
				checkNum /= 10;
            }

            if(sum + i == N) {
                return i;
            }
        }

        return NOT_FIND_DIGIT_SUM;
    }

    public static int countDigits(int N) {
        return Integer.toString(N).length();
    }
}
