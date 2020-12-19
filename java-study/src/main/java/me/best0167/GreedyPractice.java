package me.best0167;

import java.util.Arrays;

public class GreedyPractice {

    public static int n = 5;
    public static int[] lost = {2, 4};
    public static int[] reserve = {1, 3, 5};

    public static void main(String[] args) {

        int[] arr = new int[n];
        /*for(int i=0; i<n; i++) {
            arr[i] = 1;
        }*/
        //System.out.println(Arrays.toString(arr));

        Arrays.fill(arr,1);
        for(int i:lost) {
            arr[i-1]--;
        }
        //System.out.println(Arrays.toString(arr)); 1 0 1 0 1

        for(int j:reserve) {
            arr[j-1]++;
        }
        //System.out.println(Arrays.toString(arr)); 2 0 2 0 2
        for(int i=0; i<n; i++) {
            if(arr[i] >1) {
                if(i > 0 && arr[i-1] == 0) {
                    arr[i-1]++;
                    arr[i]--;
                } else if(i < n-1 && arr[i+1] == 0) {
                    arr[i+1]++;
                    arr[i]--;
                }
            }
        }
        int count = 0;
        for(int i:arr) {
            if(i >= 1) {
                count++;
            }
        }
        System.out.println(count);
        //return count;

    }
}
