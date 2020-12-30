package me.best0167;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DifferentNumber {
    public static int[] solution(int []arr) {
        int[] answer;

        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i-1]) {
                list.add(arr[i]);
            }
        }

        answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        System.out.println(Arrays.toString(solution(arr)));

        int[] arr1 = {4,4,4,3,3};
        System.out.println(Arrays.toString(solution(arr1)));
    }
}
