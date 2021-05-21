package me.best0167.inflearn.array;

import java.util.Arrays;

public class RockPaperScissors {
    public static String solution(int n, int[] a, int[] b) {
        StringBuilder answer = new StringBuilder();

        for(int i = 0; i < n; i++) {
            if (a[i] == b[i]) {
                answer.append("D");
            } else if (a[i] == 1 && b[i] == 3) {
                answer.append("A");
            } else if (a[i] == 2 && b[i] == 1) {
                answer.append("A");
            } else if (a[i] == 3 && b[i] == 2) {
                answer.append("A");
            } else {
                answer.append("B");
            }

        }

        return answer.toString();
    }

    public static void main(String[] args) {
        int n = 5;
        int[] a = {2, 3, 3, 1, 3};
        int[] b = {1, 1, 2, 2, 3};

        for(char x : solution(n, a, b).toCharArray()) {
            System.out.println(x);
        }

    }

}
