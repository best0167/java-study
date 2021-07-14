package me.best0167.inflearn.sortingandsearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MisChief {
    public static List<Integer> solution(int n, int[] array) {
        List<Integer> answer = new ArrayList<>();

        int[] tmp = array.clone();
        Arrays.sort(tmp);
        for(int i=0; i<n; i++){
            if(array[i] != tmp[i]) {
                answer.add(i+1);
            }
        }
        return answer;

    }

    public static void main(String[] args) {
        int n = 9;
        int[] array = {120, 125, 152, 130, 135, 135, 143, 127, 160};
        System.out.println(solution(n, array));
    }
}
