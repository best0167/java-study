package me.best0167.inflearn.twopointersslidingwindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElement {
    public static List<Integer> solution(int n, int m, int[] a, int[] b) {
        List<Integer> answer = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);

        int p1 = 0, p2 = 0;

        while (p1 < n && p2 < m) {
            if (a[p1] == b[p2]) {
                answer.add(a[p1++]);
                p2++;
            } else if (a[p1] < b[p2]) {
                p1++;
            } else {
                p2++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] a = {1, 3, 9, 5, 2};

        int m = 5;
        int[] b = {3, 2, 5, 7, 8};

        System.out.println(solution(n, m, a, b));
    }

}
