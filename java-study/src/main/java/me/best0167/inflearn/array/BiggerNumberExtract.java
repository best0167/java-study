package me.best0167.inflearn.array;

import java.util.ArrayList;
import java.util.List;

import static me.best0167.GreedyPractice.n;

public class BiggerNumberExtract {
    public static List<Integer> solution(int n, int[] array) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if(array[i] >= n) {
                answer.add(array[i]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 6;
        int[] array = {7, 3, 9, 5, 6, 12};
        System.out.println(solution(n, array));
    }
}
