package BJ_2720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        int taseCase = Integer.parseInt(bfr.readLine());

        StringBuilder stb = new StringBuilder();

        for (int i = 1; i <= taseCase; i++) {
            int changeMoney = Integer.parseInt(bfr.readLine());

            int quarters = changeMoney / 25;
            changeMoney %= 25;

            int dimes = changeMoney / 10;
            changeMoney %= 10;

            int nickels = changeMoney / 5;
            changeMoney %= 5;

            int pennies = changeMoney / 1;

            stb.append(quarters).append(" ")
                    .append(dimes).append(" ")
                    .append(nickels).append(" ")
                    .append(pennies).append("\n");
        }

        System.out.print(stb.toString());

        bfr.close();      
    }
}