package level12.BJ_19532;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        
        // ax + by = c
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        
        // dx + ey = f
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        for(int i = -999; i <= 999; i++) {
            for(int j = -999; j <= 999; j++) {
                if(a*i + b*j == c && d*i + e*j == f) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}
