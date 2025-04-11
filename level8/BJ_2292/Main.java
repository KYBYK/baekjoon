package level8.BJ_2292;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        int count = 1; 
        int range = 2; 
        
        if (N > 1) {
            while (range <= N) {
                range = range + (6 * count);
                count++;
            }
        }

        System.out.println(count);

        scanner.close();
    } 
}