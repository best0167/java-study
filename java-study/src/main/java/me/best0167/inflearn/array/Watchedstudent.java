package me.best0167.inflearn.array;

import java.util.ArrayList;
import java.util.List;

public class Watchedstudent {
    public static int solution(int n, int[] array) {
        int answer = 1;
        int max = array[0];

        for (int i = 1; i < n; i++) {
            if (array[i] > max) {
                answer++;
                max = array[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 8;
        int[] array = {130, 135, 148, 140, 145, 150, 150, 153};
        System.out.println(solution(n, array));
    }
}
