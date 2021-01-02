package me.best0167;

import java.util.*;

public class SmallNumberRemove {
    public static int[] solution(int[] arr) {
        int[] answer = {};

        if(arr.length <= 1) {
            answer = new int[]{-1};
            return answer;
        }

       int min = arr[0];
        for(int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }

        answer = new int[arr.length-1];
        int index = 0;

        for (int j : arr) {
            if (j == min) {
                continue;
            }
            answer[index++] = j;
        }
         for(int i = 0; i < arr.length; i++) {
            if(arr[i] == min) {
                continue;
            }
            answer[index++] = arr[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        System.out.println(Arrays.toString(solution(arr)));

        int[] arr1 = {10};
        System.out.println(Arrays.toString(solution(arr1)));

    }

}

