package BJ_2501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int result = findKthFactor(N, K);
        
        System.out.println(result);

        br.close();
    }

    public static int findKthFactor(int N, int K) {
        int count = 0;

        for(int i = 1; i <= N ; i++) {
            if(N % i == 0) {
                if(++count == K) {
                    return i;
                }
            }
        }

        return 0;
    }
}
