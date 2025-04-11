package level9.BJ_5086;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
    
        StringBuilder stb = new StringBuilder();

        while (true) {
            StringTokenizer stt = new StringTokenizer(bfr.readLine());

            int A = Integer.parseInt(stt.nextToken());
            int B = Integer.parseInt(stt.nextToken());

            if(A == 0 && B == 0) {
                break;
            }

            stb.append(calculateRelation(A, B)).append("\n");
        }

        System.out.println(stb.toString());

        bfr.close();
    }

    public static String calculateRelation(int A, int B) {
        if(A % B == 0) {
            return "factor";
        }
        if(B % A == 0) {
            return "multiple";
        }

        return "neither";
    }
}
