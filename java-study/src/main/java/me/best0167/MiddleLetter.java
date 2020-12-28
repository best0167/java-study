package me.best0167;

public class MiddleLetter {
    public static String solution(String s) {
        String answer = "";

        if(s.length() % 2 == 0) {
            char charAt1 = s.charAt(s.length() / 2 - 1);
            char charAt2 = s.charAt(s.length() / 2);
            answer += String.valueOf(charAt1);
            answer += String.valueOf(charAt2);
        } else {
            char charAt = s.charAt(s.length() / 2);
            answer = String.valueOf(charAt);
        }

        return answer;
    }

    public static void main(String[] args) {
        String s = "abcde";
        System.out.println(solution(s));

        String s1 = "qwer";
        System.out.println(solution(s1));
    }
}
