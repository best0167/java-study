package me.best0167;

import java.util.*;

public class IntegerDescend {
    public static long solution(long n) {
        long answer = 0;
        int count = 0;

        List<Long> list = new ArrayList<>();

        while (n > 0) {
            list.add(n % 10);
            n /= 10;
            count++;
        }
        Collections.sort(list);

        for(int i = 0; i < count; i++) {
            answer += list.get(i) * Math.pow(10, i);
        }

        /* long a = n;

        while (a !=0) {
            a /= 10;
            count++;
        }

        List<Long> list = new ArrayList<>();

        for(int i = 0; i < count; i++) {
            list.add(n % 10);
            n /= 10;
        }
        Collections.sort(list);

        for(int i = 0; i < count; i++) {
           answer += list.get(i) * Math.pow(10, i);
        }*/
        return answer;
    }

    public static void main(String[] args) {
        long n = 118372;

        System.out.println(solution(n));
    }

}
