package me.best0167.programmers.level2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PhoneList {
    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);

        Map<Integer, Integer> map = new HashMap<>();



        return answer;
    }

    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};
        System.out.println(solution(phone_book));

        String[] phone_book1 = {"123","456","789"};
        System.out.println(solution(phone_book1));

        String[] phone_book2 = {"12","123","1235","567","88"};
        System.out.println(solution(phone_book2));
    }
}
