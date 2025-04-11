package level10.BJ_5073;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        while (bf.ready()) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            
            int[] sides = new int[3];
            sides[0] = Integer.parseInt(st.nextToken());
            sides[1] = Integer.parseInt(st.nextToken());
            sides[2] = Integer.parseInt(st.nextToken());

            if (sides[0] == 0 && sides[1] == 0 && sides[2] == 0) {
                break;
            }

            String type = determineTriangleType(sides);

            System.out.println(type);
        }

        bf.close();
    }

    public static String determineTriangleType(int[] sides) {
        Arrays.sort(sides);

        if (sides[0] + sides[1] <= sides[2]) {
            return "Invalid";
        } else if (sides[0] == sides[1] && sides[1] == sides[2]) {
            return "Equilateral";
        } else if (sides[0] == sides[1] || sides[0] == sides[2] || sides[1] == sides[2]) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }
}
