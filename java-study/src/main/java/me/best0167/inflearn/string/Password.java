package me.best0167.inflearn.string;

public class Password {
    public static String solution(int n, String s) {
        StringBuilder answer = new StringBuilder();
        int share = s.length() / n;

        for(int i = 0; i < n; i++) {
            String tmp = s.substring(0, share).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            System.out.println(tmp + " " + num);
            answer.append((char) num);

            s = s.substring(share);

        }

        return answer.toString();
    }

    public static void main(String[] args) {
        int n = 4;
        String s = "#****###**#####**#####**##** ";

        System.out.println(solution(n, s));
    }

}
