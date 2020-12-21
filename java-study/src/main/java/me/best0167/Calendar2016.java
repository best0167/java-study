package me.best0167;

public class Calendar2016 {
    public static String solution(int a, int b) {
        String answer = "";
        int c = 0;
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] weekday = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        if(a <= 12) {
            for (int i = 0; i < a - 1; i++) {
                c += (month[i]);
            }
            c = (c + b) % 7;

            if(c - 1 < 0) {
                answer = weekday[c + 6];
            } else {
                answer = weekday[c - 1];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 24;
        System.out.println(solution(a,b));
    }
}
