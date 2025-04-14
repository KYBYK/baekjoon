package level10.BJ_14215;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int[] sticks = new int[3];
        sticks[0] = Integer.parseInt(st.nextToken());
        sticks[1] = Integer.parseInt(st.nextToken());
        sticks[2] = Integer.parseInt(st.nextToken());

        if(isTriangle(sticks)) {
            System.out.println(sticks[0] + sticks[1] + sticks[2]);
        } else {
            System.out.println((sticks[0] + sticks[1]) * 2 - 1);
        }

        bf.close();
    }

    public static boolean isTriangle(int[] sticks) {
        Arrays.sort(sticks);
        return sticks[0] + sticks[1] > sticks[2];
    }
}
