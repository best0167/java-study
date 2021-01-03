package me.best0167;


public class JadenCaseMake {
    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();
        s = s.toLowerCase();

        if('a' <= s.charAt(0) && s.charAt(0) <= 'z') {
            answer.append(s.toUpperCase().charAt(0));
        } else {
            answer.append(s.charAt(0));
        }
        for(int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i) != ' ') {
                answer.append(s.charAt(i + 1));
            } else {
                answer.append(s.toUpperCase().charAt(i + 1));
            }
        }
            /*
            char[] ch = new char[s.length()];

            if('a' <= s.charAt(0) && s.charAt(0) <= 'z') {
                ch[0] = s.toUpperCase().charAt(0);
            } else {
                ch[0] = s.charAt(0);
            }

            for(int i = 0; i < s.length()-1; i++) {
                if(s.charAt(i) != ' ') {
                    ch[i+1] = s.charAt(i+1);
                } else {
                    ch[i+1] = s.toUpperCase().charAt(i+1);
                }
            }

            for(int i = 0; i < ch.length; i++) {
                answer.append(ch[i]);
            }*/

        return answer.toString();
    }

    public static void main(String[] args) {
        String s = "3people unFollowed me";
        System.out.println(solution(s));

        String s1 = "for the last week";
        System.out.println(solution(s1));
    }
}
