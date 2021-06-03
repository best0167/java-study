package me.best0167.inflearn.twopointersslidingwindow;

import java.util.ArrayList;
import java.util.List;

public class DoubleArrangeMerge {
    public static List<Integer> solution(int n, int m, int[] a, int[] b) {
        List<Integer> answer = new ArrayList<>();

        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < m) {
            if(a[p1] < b[p2]) {
                answer.add(a[p1++]);
            } else {
                answer.add(b[p2++]);
            }
        }

        while (p1 < n) {
            answer.add(a[p1++]);
        }

        while (p2 < m) {
            answer.add(b[p2++]);
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 3;
        int[] a = {1, 3, 5};

        int m = 5;
        int[] b = {2, 3, 6, 7, 9};

        System.out.println(solution(n, m, a, b));
    }

}
