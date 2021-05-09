package me.best0167.kakao.intern;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class test1 {
    public static int solution(String s) {
        int answer = 0;

        StringBuilder letter = new StringBuilder();

        List<String> list = new ArrayList<>();

        for (char x : s.toCharArray()) {
            if (!Character.isDigit(x)) {
                letter.append(x);

                if(letter.toString().startsWith("zero")) {
                    list.add("0");
                    letter = new StringBuilder();
                }
                if(letter.toString().startsWith("one")) {
                    list.add("1");
                    letter = new StringBuilder();
                }
                if(letter.toString().startsWith("two")) {
                    list.add("2");
                    letter = new StringBuilder();
                }
                if(letter.toString().startsWith("three")) {
                    list.add("3");
                    letter = new StringBuilder();
                }
                if(letter.toString().startsWith("four")) {
                    list.add("4");
                    letter = new StringBuilder();
                }
                if(letter.toString().startsWith("five")) {
                    list.add("5");
                    letter = new StringBuilder();
                }
                if(letter.toString().startsWith("six")) {
                    list.add("6");
                    letter = new StringBuilder();
                }
                if(letter.toString().startsWith("seven")) {
                    list.add("7");
                    letter = new StringBuilder();
                }
                if(letter.toString().startsWith("eight")) {
                    list.add("8");
                    letter = new StringBuilder();
                }
                if(letter.toString().startsWith("nine")) {
                    list.add("9");
                    letter = new StringBuilder();
                }

            } else {
                list.add(String.valueOf(x));
            }

        }


        StringBuilder a = new StringBuilder();

        for (String value : list) {
            a.append(value);
        }

        answer = Integer.parseInt(a.toString());

        return answer;

    }

    public static void main(String[] args) {
        String s = "one4seveneight";
        System.out.println(solution(s));
    }
}
