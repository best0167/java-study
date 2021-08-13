package me.best0167.inflearn.stackqueue;

import java.util.Arrays;

public class MusicVideo {
    public static int solution(int n, int m, int[] array) {
        int answer = 0;

        int lt = Arrays.stream(array).max().getAsInt();
        int rt = Arrays.stream(array).sum();
        while(lt <= rt){
            int mid = (lt + rt) / 2;
            if(count(array, mid) <= m){
                answer = mid;
                rt = mid - 1;
            }
            else {
                lt = mid + 1;
            }
        }
        return answer;
    }

    public static int count(int[] array, int capacity){
        int cnt = 1, sum = 0;
        for(int x : array){
            if(sum + x > capacity){
                cnt++;
                sum=x;
            }
            else {
                sum+=x;
            }
        }
        return cnt;
    }



    public static void main(String[] args) {
        int n = 9;
        int m = 3;
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(solution(n, m, array));

    }
}
