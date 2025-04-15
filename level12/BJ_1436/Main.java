package level12.BJ_1436;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(bf.readLine());
        int count = 0;
        int num = 665;
        
        while(count != N) {
            num++;
            if(Integer.toString(num).contains("666")) {
                count++;
            }
        }

        System.out.println(num);
    }
}
