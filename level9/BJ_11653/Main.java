package level9.BJ_11653;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        if(N != 1) {
            String result = calculatePrimeFactorsAndFormatResult(N);
            System.out.println(result);
        }
    }

    public static String calculatePrimeFactorsAndFormatResult(int number) {
        StringBuilder sb = new StringBuilder();

        for(int i = 2; i <= number; i++) {
            while(number % i == 0) {
                sb.append(i).append("\n");
                number /= i;
            }
        }

        return sb.toString();
    }
}
