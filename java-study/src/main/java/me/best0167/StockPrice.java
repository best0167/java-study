package me.best0167;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StockPrice {

    public static int[] solution(int[] prices) {

        int count = prices.length;
        int[] answer = new int[5];

        for(int i = 0; i < count; i++) {
            if(prices[i] >= i) {
                answer[i] = count - i - 1;
            } else {
                answer[i] = 1;
            }
        }

        return answer;

    }

    public static void main(String[] args) {

        int[] prices = {1, 2, 3, 2, 3};

        System.out.println(Arrays.toString(prices));

    }
}
