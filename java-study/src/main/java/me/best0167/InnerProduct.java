package me.best0167;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class InnerProduct {
    public static int solution(int[] a, int[] b) {
        int answer = 0;
        int[] array = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            array[i] = a[i] * b[i];
        }

        answer = IntStream.of(array).sum();
        return answer;


        /*int answer = 0;
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < a.length; i++) {
            list.add(a[i] * b[i]);
        }

        answer = list.stream().mapToInt(Integer::intValue).sum();

        return answer;*/
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {-3, -1, 0, 2};
        System.out.println(solution(a, b));

        int[] a1 = {-1,0,1};
        int[] b1 = {1,0,-1};
        System.out.println(solution(a1, b1));
    }

}
