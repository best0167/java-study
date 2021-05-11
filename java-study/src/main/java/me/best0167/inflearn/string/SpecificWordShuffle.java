package me.best0167.inflearn.string;

public class SpecificWordShuffle {
    public static String solution(String s) {
        String answer = "";

        char[] c = s.toCharArray();
        int lt = 0, rt = s.length() - 1;

        for (int i = 0; i < c.length; i++) {

            while (lt < rt) {
                if (!Character.isAlphabetic(c[lt])) {
                    lt++;
                }
                if (!Character.isAlphabetic(c[rt])) {
                    rt--;
                } else {

                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;

                }
            }
        }
        answer = String.valueOf(c);

        return answer;
    }

    public static void main(String[] args) {
        String s = "a#b!GE*T@S";
        System.out.println(solution(s));
    }
}
