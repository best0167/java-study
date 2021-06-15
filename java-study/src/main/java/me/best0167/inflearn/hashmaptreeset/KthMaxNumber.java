package me.best0167.inflearn.hashmaptreeset;

import java.util.Collections;
import java.util.TreeSet;

public class KthMaxNumber {
    public static int solution(int n, int m, int[] array) {

        int answer = -1;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    Tset.add(array[i] + array[j] + array[l]);
                }
            }
        }
        int cnt = 0;
        //Tset.remove(143);
        //System.out.println(Tset.size());
        //System.out.println("first : "+ Tset.first());
        //System.out.println("last : "+ Tset.last());

        for (int x : Tset) {
            //System.out.println(x);
            cnt++;
            if (cnt == m) {
                return x;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 10;
        int m = 3;
        int[] array = {13, 15, 34, 23, 45, 65, 33, 11, 26, 42};

        System.out.println(solution(n, m, array));
    }
}
