package level8.BJ_2745;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bfr.readLine());

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        int decimal = toDecimal (N,B);

        System.out.println(decimal);

        bfr.close();
    }

    public static int toDecimal(String N, int B) {
        int decimal = 0;
        int power = 1;

        for (int i = N.length() - 1; i >= 0; i--) {
            char ch = N.charAt(i);
            int value = (Character.isDigit(ch)) ? ch - '0' : ch - 'A' + 10;
            decimal += value * power;
            power *= B;
        }

        return decimal;
    }
}
