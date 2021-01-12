package me.best0167;

public class StringToInt {
    public static int solution(String s) {
        int answer = 0;

        answer = Integer.parseInt(s);
        /*
        boolean sign = true;

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '-') {
                sign = false;
            } else if (ch != '+') {
                answer = answer * 10 + (ch - '0');
            }
        }

        return sign ? answer : (-1 * answer);
*/
        return answer;
    }

    public static void main(String[] args) {
        String s = "1234";
        System.out.println(solution(s));

        String s1 = "-1234";
        System.out.println(solution(s1));
    }
}
