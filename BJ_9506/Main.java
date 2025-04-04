package BJ_9506;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int inputNumber;

        while ((inputNumber = Integer.parseInt(br.readLine())) != -1) {
            sb.append(getPerfectNumberResult(inputNumber)).append("\n");
        }

        System.out.print(sb);

        br.close();
    }

    public static String getPerfectNumberResult(int n) {
        StringBuilder sb = new StringBuilder();
        int divisorSum = 1;
        List<Integer> divisors = new ArrayList<>();
        
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                divisorSum += i;
                divisors.add(i);
            }
        }

        if (divisorSum == n) {
            sb.append(n).append(" = 1");
            for (int divisor : divisors) {
                sb.append(" + ").append(divisor);
            }
        } else {
            sb.append(n).append(" is NOT perfect.");
        }

        return sb.toString();
    }
}
