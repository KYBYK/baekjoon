package level8.BJ_2869;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
 
    public static void main(String[] args) throws IOException{
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stt = new StringTokenizer(bfr.readLine());

        int dailyClimb = Integer.parseInt(stt.nextToken());
        int nightSlip = Integer.parseInt(stt.nextToken());
        int goalHeight = Integer.parseInt(stt.nextToken());

        int days = (int) Math.ceil((double)(goalHeight - nightSlip) / (dailyClimb - nightSlip));

        System.out.println(days);

        bfr.close();
    }
}
