package me.best0167.inflearn.string;

public class EffectivePalindrome {
    public static String solution(String s) {
        String answer = "YES";

        s = s.toLowerCase().replaceAll("[^a-z]", "");
        System.out.println(s);
        String tmp = new StringBuilder(s).reverse().toString();
        System.out.println(tmp);

        if (!s.equals(tmp)) {
            answer = "NO";
        }

        return answer;
    }

    public static void main(String[] args) {
        String s = "found7, time: study; Yduts; emit, 7Dnuof";
        System.out.println(solution(s));
    }
}
