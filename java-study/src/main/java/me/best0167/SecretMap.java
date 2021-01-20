package me.best0167;

import java.util.Arrays;

public class SecretMap {
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        Arrays.fill(answer, "");

        int count = 0;

        for (int i = 0; i < n; i++) {
            while((arr1[i] > 0) || (arr2[i] > 0)) {
                if(arr1[i] % 2 == 0 && arr2[i] % 2 == 0) {
                    answer[i] = " " + answer[i];
                    count++;;
                } else if(arr1[i] % 2 != 0 || arr2[i] % 2 != 0) {
                    answer[i] = "#" + answer[i];
                    count++;
                }
                arr1[i] /= 2;
                arr2[i] /= 2;
            }

            while (count < n) {
                answer[i] = " " + answer[i];
                count++;
            }
            count = 0;
        }

        return answer;
    }


    public static void main(String[] args) {

        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        System.out.println(Arrays.toString(solution(n, arr1, arr2)));


        int n1 = 6;
        int[] arr3 = {46, 33, 33 ,22, 31, 50};
        int[] arr4 = {27 ,56, 19, 14, 14, 10};
        System.out.println(Arrays.toString(solution(n1, arr3, arr4)));

    }
}
