package level12.BJ_2798;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        
        int cardCount = Integer.parseInt(st.nextToken());
        int sumLimit = Integer.parseInt(st.nextToken());

        int[] cardValues = parseCardValues(cardCount, bf.readLine());

        int bestSum = findBestSumForCards(cardValues, sumLimit);

        System.out.println(bestSum);

        bf.close();
    }

    public static int[] parseCardValues(int cardCount, String str) {
        StringTokenizer st = new StringTokenizer(str);

        int[] cardValues = new int[cardCount];
        for(int i = 0; i < cardValues.length; i++) {
            cardValues[i] = Integer.parseInt(st.nextToken());
        }

        return cardValues;
    }

    public static int findBestSumForCards(int[] cardValues, int sumLimit) {
        int bestSum = -1;

        for(int i = 0; i < cardValues.length; i++) {
            for(int j = i+1; j < cardValues.length; j++) {
                for(int k = j+1; k < cardValues.length; k++) {
                    int currentSum = cardValues[i] + cardValues[j] + cardValues[k];

                    if (currentSum == sumLimit) {
                        return sumLimit;
                    }
    
                    if (currentSum < sumLimit && currentSum > bestSum) {
                        bestSum = currentSum;
                    }
                }
            }
        }

        return bestSum;
    }
}
