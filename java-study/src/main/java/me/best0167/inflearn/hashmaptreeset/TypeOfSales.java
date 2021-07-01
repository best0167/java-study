package me.best0167.inflearn.hashmaptreeset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TypeOfSales {
    public static List<Integer> solution(int n, int m, int[] array) {
        List<Integer> answer = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < m - 1; i++){
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
        }
        int lt=0;
        for(int rt = m-1; rt < n; rt++){
            map.put(array[rt], map.getOrDefault(array[rt], 0) + 1);
            answer.add(map.size());

            map.put(array[lt], map.get(array[lt])-1);

            if(map.get(array[lt])==0) {
                map.remove(array[lt]);
            }
            lt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 7;
        int m = 4;
        int[] array = {20, 12, 20, 10, 23, 17, 10};

        System.out.println(solution(n, m ,array));
    }
}
