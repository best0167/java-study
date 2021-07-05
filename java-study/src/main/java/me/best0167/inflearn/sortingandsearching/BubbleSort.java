package me.best0167.inflearn.sortingandsearching;

import java.util.Arrays;

public class BubbleSort {
    public static int[] solution(int n, int[] array) {
        int[] answer = new int[n];

        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if(array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }

        answer = array;

        return answer;
    }

    public static void main(String[] args) {
        int n = 6;
        int[] array = {13, 5, 11, 7, 23, 15};
        System.out.println(Arrays.toString(solution(n, array)));

    }


}
