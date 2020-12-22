package me.best0167;

import java.util.ArrayList;
import java.util.Arrays;

public class DividedNumber {
    public static int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> array = new ArrayList<>();

        for (int value : arr) {
            if (value % divisor == 0) {
                array.add(value);
            }
        }

        if(array.isEmpty()) {
            array.add(-1);
        }
        answer = new int[array.size()];

        for(int i = 0; i < array.size(); i++) {
            answer[i] = array.get(i);
        }
        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;
        System.out.println(Arrays.toString(solution(arr, divisor)));

        int[] arr1 = {2, 36, 1, 3};
        int divisor1 = 1;
        System.out.println(Arrays.toString(solution(arr1, divisor1)));

        int[] arr2 = {3, 2, 6};
        int divisor2 = 10;
        System.out.println(Arrays.toString(solution(arr2, divisor2)));
    }
}
