package level8.BJ_11005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stt = new StringTokenizer(bfr.readLine());

        int decimal = Integer.parseInt(stt.nextToken());
        int base = Integer.parseInt(stt.nextToken());

        String result = decimalToBbase(decimal, base);
        
        System.out.println(result);

        bfr.close();
    }

    public static String decimalToBbase(int decimal, int base) {
        StringBuilder stb = new StringBuilder();

        while(decimal > 0) {
            int remainder = decimal % base;
            char result = (remainder < 10) ? (char)(remainder + '0') : (char)(remainder - 10 + 'A');
            stb.insert(0, result);
            decimal /= base;
        }

        return stb.toString();
    }

}
