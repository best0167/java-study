package me.best0167.inflearn.sortingandsearching;

import java.util.Arrays;

public class DoubleCheck {
    public static String solution(int n, int[] array) {
        String answer="U";

        Arrays.sort(array);
        for(int i = 0; i < n-1; i++){
            if(array[i] == array[i+1]){
                answer = "D";
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 8;
        int[] array = {20, 25, 52, 30, 39, 33, 43, 33};

        System.out.println(solution(n, array));
    }
}
