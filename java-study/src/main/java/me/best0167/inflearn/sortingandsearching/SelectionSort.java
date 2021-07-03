package me.best0167.inflearn.sortingandsearching;

import java.util.Arrays;

public class SelectionSort {
    public static int[] solution(int n, int[] array) {

        for(int i=0; i<n-1; i++){
            int idx=i;
            for(int j = i+1; j < n; j++){
                if(array[j] < array[idx]) {
                    idx=j;
                }
            }
            int tmp = array[i];
            array[i] = array[idx];
            array[idx] = tmp;
        }

        return array;

    }

    public static void main(String[] args) {
        int n = 6;
        int[] array = {13, 5, 11, 7, 23, 15};

        System.out.println(Arrays.toString(solution(n, array)));
    }
}
