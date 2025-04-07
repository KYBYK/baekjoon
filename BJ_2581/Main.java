package BJ_2581;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int M = Integer.parseInt(bf.readLine());
        int N = Integer.parseInt(bf.readLine());
        
        int primeNumberSum = 0;
        int minPrimeNumber = Integer.MAX_VALUE;

        for(int i = M; i <= N; i++) {
            if(isPrimeNumber(i)) {
                primeNumberSum += i;
                if(i < minPrimeNumber) {
                    minPrimeNumber = i;
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        if(primeNumberSum == 0) {
            sb.append("-1");
        } else {
            sb.append(primeNumberSum).append("\n").append(minPrimeNumber);
        }

        System.out.println(sb);
    }

    public static boolean isPrimeNumber(int num) {
        if(num < 2) {return false;}

        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
