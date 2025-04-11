package BJ_9063;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int coordsCnt = Integer.parseInt(bf.readLine());

        if(coordsCnt == 1) {
            System.out.println("0");
            return;
        }

        int[] xCoords = new int[coordsCnt];
        int[] yCoords = new int[coordsCnt];

        for(int i = 0; i < coordsCnt; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            xCoords[i] = Integer.parseInt(st.nextToken());
            yCoords[i] = Integer.parseInt(st.nextToken());
        }

        int width = calculateSideLength(xCoords);
        int height = calculateSideLength(yCoords);

        System.out.println(width * height);

        bf.close();
    }

    public static int calculateSideLength(int[] coords) {
        int minCoord = coords[0];
        int maxCoord = coords[0];

        for (int coord : coords) {
            if (coord < minCoord) {
                minCoord = coord;
            }
            if (coord > maxCoord) {
                maxCoord = coord;
            }
        }

        return maxCoord - minCoord;
    }
}
