package me.best0167;

import java.util.Arrays;

public class PYCount {
    public static boolean solution(String s) {
        boolean answer = true;

        char[] temp = s.toLowerCase().toCharArray();
        int a = 0;
        for(int i = 0; i < s.length(); i++) {
            if(temp[i] == 'p') {
                a++;
            } else if(temp[i] == 'y') {
                a--;
            }
        }
        if(a != 0) {
            answer = false;
        }
        return answer;


        /*int b = 0;

        for(int i = 0; i < s.length(); i++) {
            if(temp[i] == 'p') {
                a++;
            } else if(temp[i] == 'y') {
                b++;
            }
        }
        if(a != b) {
            answer = false;
        }
        return answer; */
    }

    public static void main(String[] args) {
        String s = "pPoooyY";
        System.out.println(solution(s));

        String s2 = "Pyy";
        System.out.println(solution(s2));
    }
}
