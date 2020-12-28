package me.best0167;

public class MiddleLetter {
    public static String solution(String s) {
        String answer = "";

        if(s.length() % 2 == 0) {
            char middle_1 = s.charAt(s.length() / 2 - 1);
            char middle = s.charAt(s.length() / 2);
            answer += String.valueOf(middle_1);
            answer += String.valueOf(middle);
        } else {
            char middle = s.charAt(s.length() / 2);
            answer = String.valueOf(middle);
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
