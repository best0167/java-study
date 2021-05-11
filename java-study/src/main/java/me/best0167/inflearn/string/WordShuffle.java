package me.best0167.inflearn.string;

import java.util.ArrayList;
import java.util.List;

public class WordShuffle {

    public static String solution(int n, String[] s) {
        List<String> answer = new ArrayList<>();

        for(String x : s) {
            char[] c = x.toCharArray();
            int lt = 0, rt = x.length()-1;

            while(lt < rt) {
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(c);
            answer.add(tmp);
        }
        return answer.toString();


        /*for (String x : s) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }

        return answer.toString();*/
    }

    public static void main(String[] args) {
        int n = 3;
        String[] s = {"good", "Time", "Big"};
        System.out.println(solution(n, s));
    }
}
