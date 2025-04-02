package BJ_2720;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int oneLineDot = (1 << N) + 1;
        int totalDot = oneLineDot * oneLineDot;

        System.out.println(totalDot);
    }
}
