package me.best0167.inflearn.sortingandsearching;

import java.util.Arrays;

public class LeastRecentlyUsed {
    public static int[] solution(int n, int m, int[] array) {
        int[] answer = new int[n];

        for(int x : array){
            int pos = -1;
            for(int i = 0; i < n; i++) {
                if(x == answer[i]) {
                    pos = i;
                }
            }
            if(pos == -1){
                for(int i = n-1; i >= 1; i--){
                    answer[i] = answer[i-1];
                }
            }
            else{
                for(int i = pos; i >= 1; i--){
                    answer[i] = answer[i-1];
                }
            }
            answer[0] = x;
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 5;
        int m = 9;
        int[] array = {1, 2, 3, 2, 6, 2, 3, 5, 7};

        System.out.println(Arrays.toString(solution(n, m, array)));
    }
}
