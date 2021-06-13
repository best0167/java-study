package me.best0167.inflearn.hashmaptreeset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TypeOfSales {
    public static List<Integer> solution(int n, int m, int[] array) {
        List<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> HM = new HashMap<>();
        for(int i = 0; i < m - 1; i++){
            HM.put(array[i], HM.getOrDefault(array[i], 0)+1);
        }
        int lt=0;
        for(int rt = m-1; rt < n; rt++){
            HM.put(array[rt], HM.getOrDefault(array[rt], 0)+1);
            answer.add(HM.size());
            HM.put(array[lt], HM.get(array[lt])-1);
            if(HM.get(array[lt])==0) HM.remove(array[lt]);
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
