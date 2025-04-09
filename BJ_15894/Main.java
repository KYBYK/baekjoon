package BJ_15894;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        long lastLineBoxNum = Long.parseLong(bf.readLine());

        System.out.println(lastLineBoxNum * 4);
    }
}
