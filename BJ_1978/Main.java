package BJ_1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(bf.readLine());

        StringTokenizer st = new StringTokenizer(bf.readLine());

        int primeNumberCnt = 0;

        for(int i = 0; i < testCase; i++) {
            int inputNumber = Integer.parseInt(st.nextToken());

            if(inputNumber != 1 && isPrimeNumber(inputNumber)) {
                primeNumberCnt++;
            }
        }

        System.out.println(primeNumberCnt);

        bf.close();
    }

    public static boolean isPrimeNumber(int num) {
        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                return false;
            }
        }

        return true;
    }
}