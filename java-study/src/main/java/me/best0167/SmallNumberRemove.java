package me.best0167;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SmallNumberRemove {
    public static int[] solution(int[] arr) {
        int[] answer = {};

        if(arr.length <= 1) {
            return new int[]{-1};
        } /* else {

            for(int i = 0; i < arr.length -1; i++) {

            }
        } */


        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        System.out.println(Arrays.toString(solution(arr)));

        int[] arr1 = {10};
        System.out.println(Arrays.toString(solution(arr1)));

    }

}
