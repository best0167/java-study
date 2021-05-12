package me.best0167.inflearn.string;

public class NumberOnlyExtract {
    public static int solution(String s) {
        int answer = 0;

        StringBuilder number = new StringBuilder();

        for (char x : s.toCharArray()) {
            if (Character.isDigit(x)) {
                number.append(x);
            }
        }

        answer = Integer.parseInt(number.toString());

        /*for(char x : s.toCharArray()) {
            if(x >=48 && x <=57) {
                answer = answer * 10 + (x - 48);
            }
        }*/

        /*s = s.replaceAll("[^0-9]", "");

        answer = Integer.parseInt(s);*/

        return answer;
    }

    public static void main(String[] args) {
        String s = "g0en2T0s8eSoft";
        System.out.println(solution(s));
    }
}
