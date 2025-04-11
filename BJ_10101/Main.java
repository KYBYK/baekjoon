package BJ_10101;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int angles[] = new int[3];

        angles[0] = Integer.parseInt(bf.readLine());
        angles[1] = Integer.parseInt(bf.readLine());
        angles[2] = Integer.parseInt(bf.readLine());

        String type = determineTriangleType(angles);
        
        System.out.println(type);

        bf.close();
    }

    public static String determineTriangleType(int[] angles) {
        StringBuffer sb = new StringBuffer();

        if(!isTriangle(angles)) { return "Error"; }

        if(angles[0] == angles[1]) {
            if(angles[0] == angles[2]) {
                sb.append("Equilateral");
            } else {
                sb.append("Isosceles");
            }
        } else {
            if(angles[1] == angles[2]) {
                sb.append("Isosceles");
            } else {
                sb.append("Scalene");
            }
        }

        return sb.toString();
    }

    public static boolean isTriangle(int[] angles) {
        return isValidTriangleSum(angles);
    }

    public static boolean isValidTriangleSum(int[] angles) {
        return (angles[0] + angles[1] + angles[2] == 180);
    }
}
