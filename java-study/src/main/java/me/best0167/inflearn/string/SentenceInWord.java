package me.best0167.inflearn.string;

public class SentenceInWord {

    public static String solution(String s) {
        String answer = "";

        int m = Integer.MIN_VALUE, pos;
        while ((pos = s.indexOf(' ')) != -1) {
            String tmp = s.substring(0, pos);
            int len = tmp.length();

            if(len > m) {
                m = len;
                answer = tmp;
            }

            s = s.substring(pos + 1);
        }

/*        int m = Integer.MIN_VALUE;
        String[] array = s.split(" ");
        for (String x : array) {
            // System.out.println(x);
            int len = x.length();
            if (len > m) {
                m = len;
                answer = x;
            }
        }*/

        return answer;
    }

    public static void main(String[] args) {
        String s = "it is time to study";
        System.out.println(solution(s));
    }
}
