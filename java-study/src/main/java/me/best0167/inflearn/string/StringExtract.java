package me.best0167.inflearn.string;

public class StringExtract {
    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();

        s += " ";
        int num = 1;

        for (int i = 0; i < s.length()-1; i++) {

            if (s.charAt(i) != s.charAt(i + 1)) {
                answer.append(s.charAt(i));
                if(num > 1) {
                    answer.append(num);
                }
                num = 1;
            } else {
                num++;
            }

        }


        return answer.toString();
    }

    public static void main(String[] args) {
        String s = "KKHSSSSSSSE";
        System.out.println(solution(s));

        String s1 = "KSTTTSEEKFKKKDJJGG";
        System.out.println(solution(s1));
    }
}
