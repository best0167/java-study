package me.best0167;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class StringSort {
    public static String[] solution(String[] strings, int n) {

        String[] answer = new String[strings.length];

        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                char c1 = s1.charAt(n);
                char c2 = s2.charAt(n);

                if(c1 == c2) {
                    return s1.compareTo(s2);
                } else {
                    return c1 - c2;
                }
            }
        });

        answer = strings;

        /*for(int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].charAt(n) + strings[i];
        }

        Arrays.sort(strings);

        String[] answer = new String[strings.length];

        for(int i = 0; i < strings.length; i++) {
            answer[i] = strings[i].substring(1);
        }
        */
        return answer;
    }

    public static void main(String[] args) {
        String[] strings = {"sun", "bed", "car"};
        int n = 1;
        System.out.println(Arrays.toString(solution(strings, n)));

        String[] strings1 = {"abce", "abcd", "cdx"};
        int n1 = 2;
        System.out.println(Arrays.toString(solution(strings1, n1)));

    }
}
