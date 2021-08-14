package me.best0167.inflearn.stackqueue;

import java.util.Arrays;

public class SetUpAStable {
    public static int solution(int n, int m, int[] array) {
        int answer = 0;

        Arrays.sort(array);
        int lt = 1;
        int rt = array[n-1];
        while (lt <= rt){
            int mid = (lt + rt) / 2;
            if(count(array, mid) >= m){
                answer = mid;
                lt = mid + 1;
            }
            else {
                rt = mid - 1;
            }
        }
        return answer;
    }

    private static int count(int[] array, int dist) {
        int cnt = 1;
        int ep = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] - ep >= dist) {
                cnt++;
                ep = array[i];
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int n = 5;
        int m = 3;
        int[] array = {1, 2, 8, 4, 9};
        System.out.println(solution(m, n, array));
    }
}
