package me.best0167.inflearn.string;

public class CharacterConvert {

    public static String solution(String s) {

        StringBuilder answer = new StringBuilder();

        for (char x : s.toCharArray()) {
            if (x >= 65 && x < 90) {
                answer.append((char) (x + 32));
            } else {
                answer.append((char) (x - 32));
            }
        }

        /*for (char x : s.toCharArray()) {
            if (Character.isLowerCase(x)) {
                answer.append(Character.toUpperCase(x));
            } else {
                answer.append(Character.toLowerCase(x));
            }
        }*/

        return answer.toString();
    }

    public static void main(String[] args) {
        String s = "StuDY";
        System.out.println(solution(s));
    }

}
