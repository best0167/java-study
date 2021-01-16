package me.best0167;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StringDescend {
    public static String solution(String s) {
        String answer = "";

        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        StringBuffer sb = new StringBuffer(String.valueOf(ch));

        answer = sb.reverse().toString();

        return answer;

        /*
        StringBuilder answer = new StringBuilder();

        char[] ch = new char[s.length()];

        for(int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }

        Arrays.sort(ch);

        for(int i = ch.length - 1; i >= 0; i--) {
            answer.append(ch[i]);
        }

        return answer.toString();

         */
    }

    public static void main(String[] args) {
        String s = "Zbcdefg";

        System.out.println(solution(s));
    }
}
