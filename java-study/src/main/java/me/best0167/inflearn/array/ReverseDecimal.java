package me.best0167.inflearn.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseDecimal {

    private static boolean isPrime(int num) {
        if(num == 1) {
            return false;
        }
        for(int i = 2; i < num; i = i + 1) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> solution(int n, int[] array) {
        List<Integer> answer = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            int tmp = array[i];
            int res = 0;
            while (tmp > 0){
                int t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp / 10;
            }
            if(isPrime(res)) {
                answer.add(res);
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        int n = 9;
        int[] array = {32, 55, 62, 20, 250, 370, 200, 30, 100};
        System.out.println(solution(n, array));

    }
}
