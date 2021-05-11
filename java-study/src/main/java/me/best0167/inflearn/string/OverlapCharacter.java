package me.best0167.inflearn.string;

public class OverlapCharacter {
    public static String solution(String s) {
        String answer = "";

        for(int i = 0; i < s.length(); i++) {
            /*System.out.println(s.charAt(i) + " " + i + " " + s.indexOf(s.charAt(i)));
            // s.charAt(i) 의 s.indexOf()를 감싸면 글자가 처음으로 있는 index 값을 반환*/
            if (s.indexOf(s.charAt(i)) == i) {
                answer += s.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String s = "ksekkset";
        System.out.println(solution(s));
    }
}
