package me.best0167.inflearn.string;

public class SentenceInWord {

    public static String solution(String s) {
        String answer = "";

        int m = Integer.MIN_VALUE, pos; // 가장 작은 수로 초기화. 큰 수를 찾기 위해

        while ((pos = s.indexOf(' ')) != -1) {
            System.out.println(pos);
            String tmp = s.substring(0, pos);
            System.out.println(tmp);
            int len = tmp.length();
            System.out.println(len);

            if (len > m) {
                m = len;
                answer = tmp;
            }

            s = s.substring(pos + 1);
            System.out.println(s);
        }

        if(s.length() > m) {
            answer = s;
            System.out.println(answer);
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
