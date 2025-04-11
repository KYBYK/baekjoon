package level8.BJ_1193;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    
    public static void main(String[] args) throws IOException{
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(bfr.readLine());

        int a = 1;
        int b = 1;

        boolean moveRight = true;

        for(int i = 1; i < X; i++) {
            if(moveRight) {
                if(a == 1) {
                    b++;
                    moveRight = false;
                } else {
                    a--;
                    b++;
                }
            }
            else {
                if(b == 1) {
                    a++;
                    moveRight = true;
                } else {
                    b--;
                    a++;
                }
            }
        }

        System.out.println(a + "/" + b);
    }
}