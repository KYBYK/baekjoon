package level10.BJ_3009;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        final int INPUT = 3;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int[] xPoints = new int[INPUT];
        int[] yPoints = new int[INPUT];

        for(int i = 0; i < INPUT; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());

            xPoints[i] = Integer.parseInt(st.nextToken());
            yPoints[i] = Integer.parseInt(st.nextToken());
        }

        int xPoint = findLastPoint(xPoints);
        int yPoint = findLastPoint(yPoints);

        StringBuilder sb = new StringBuilder();
        sb.append(xPoint).append(" ").append(yPoint);

        System.out.println(sb);

        bf.close();
        
    }

    public static int findLastPoint(int[] points) {
        int result = -1;

        if(points[0] == points[1]) {
            result = points[2];
        } else if(points[0] == points[2]) {
            result = points[1];
        } else {
            result = points[0];
        }

        return result;
    }
}
