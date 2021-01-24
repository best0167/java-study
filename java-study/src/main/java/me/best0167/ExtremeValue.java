package me.best0167;

import java.util.Arrays;

public class ExtremeValue {
    public static String solution(String s) {
        String answer = "";

        String[] letter = s.split(" ");

        int[] nums = Arrays.stream(letter).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));



        return answer;
    }

    public static void main(String[] args) {
        String s = "1 2 3 4";
        System.out.println(s);

        String s1 = "-1 -2 -3 -4";
        System.out.println(s1);

        String s2 = "-1 -1";
        System.out.println(s2);


    }
}
