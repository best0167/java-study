package me.best0167.inflearn.string;

public class CharacterFind {

    public static int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        for (char x : str.toCharArray()) {
            if (x == t) {
                answer++;
            }
        }

/*        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == t) {
                answer++;
            }
        }*/

        return answer;
    }

    public static void main(String[] args) {
        String str = "Computercooler";
        char t = 'c';

        System.out.println(solution(str, t));

    }

}
