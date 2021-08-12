package me.best0167.inflearn.stackqueue;

import java.util.Arrays;

public class BinarySearch {
    public static int solution(int n, int m, int[] array) {
        int answer = 0;

        Arrays.sort(array);
        int lt = 0, rt = n-1;

        while(lt <= rt){
            int mid = (lt + rt)/2;
            if(array[mid] == m){
                answer = mid + 1;
                break;
            }
            if(array[mid] > m) {
                rt = mid - 1;
            }
            else {
                lt = mid + 1;
            }
        }

        return answer;

    }

    public static void main(String[] args) {
        int n = 8;
        int m = 32;
        int[] array = {23, 87, 65, 12, 57, 32, 99, 81};

        System.out.println((solution(n, m, array)));
    }
}
