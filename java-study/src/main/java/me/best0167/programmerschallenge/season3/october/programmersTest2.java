package me.best0167.programmerschallenge.season3.october;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class programmersTest2 {
    public static int[] solution(int n, long left, long right) {

        int l = (int) left;
        int r = (int) right;

        int[] answer = new int[r - l + 1];


        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    list.add(j + 1);
                } else if (i < n - 1 && i >= j) {
                    list.add(i + 1);
                } else if (i < n - 1 && i < j) {
                    list.add(j + 1);
                }  else {
                    list.add(n);
                }
            }
        }
        int size = 0;

        for (int i = l; i <= r; i++) {
            answer[size++] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {

        int n = 3;
        int left = 2;
        int right = 5;
        System.out.println(Arrays.toString(solution(n, left, right)));


        int n1 = 4;
        int left1 = 7;
        int right1 = 14;
        System.out.println(Arrays.toString(solution(n1, left1, right1)));
    }

}
