package me.best0167.inflearn.string;

import java.util.Arrays;

public class PalindromeString {
    public static String solution(String s) {
        String answer = "YES";
        String tmp = new StringBuilder(s).reverse().toString();

        if(!s.equalsIgnoreCase(tmp)) {
            answer = "NO";
        }

        return answer;

        /*s = s.toUpperCase();
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                return "NO";
            }
        }

        return answer;*/


        /*String answer = "";

        String comparison = "";

        char[] c = s.toCharArray();
        for(int i = 0; i < s.length(); i++) {
            int lt = 0, rt = s.length()-1;
            while (lt < rt) {
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }

        }
        comparison = String.valueOf(c).toLowerCase();

        if(s.toLowerCase().equals(comparison)) {
            answer += "YES";
        } else {
            answer += "NO";
        }

        return answer;*/
    }

    public static void main(String[] args) {
        String s = "gooG";
        System.out.println(solution(s));
    }
}
