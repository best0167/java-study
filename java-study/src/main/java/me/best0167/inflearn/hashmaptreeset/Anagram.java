package me.best0167.inflearn.hashmaptreeset;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public static String solution(String s1, String s2) {
        String answer = "YES";

        Map<Character, Integer> map = new HashMap<>();
        for(char x : s1.toCharArray()){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for(char x : s2.toCharArray()){
            if(!map.containsKey(x) || map.get(x) == 0) {
                answer = "NO";
            }
            map.put(x, map.get(x) - 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        String s1 = "AbaAeCe";
        String s2 = "baeeACA";

        System.out.println(solution(s1, s2));

        String s3 = "abaCC";
        String s4 = "Caaab";

        System.out.println(solution(s3, s4));
    }

}
