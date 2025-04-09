package BJ_1085;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int minX = (w - x < x) ? w - x : x;
        int minY = (h - y < y) ? h - y : y;

        int minDistance = (minX < minY) ? minX : minY;

        System.out.println(minDistance);
    }
}
