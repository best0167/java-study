package me.best0167.inflearn.string;

import java.util.Arrays;

public class ShortestCharacterDistance {
    public static int[] solution(String s, char t) {
        int[] answer = new int[s.length()];
        int p = 1000;
        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                p = 0;
            } else {
                p++;
            }
            answer[i] = p;
            // System.out.println(Arrays.toString(answer));
        }

        p = 1000;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == t) {
                p = 0;
            } else {
                p++;
                answer[i] = Math.min(answer[i], p);
                // System.out.println(Arrays.toString(answer));
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String s = "teachermode";
        char t = 'e';
        System.out.println(Arrays.toString(solution(s, t)));
    }
}
