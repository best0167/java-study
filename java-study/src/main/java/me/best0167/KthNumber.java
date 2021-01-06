package me.best0167;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KthNumber {
    public static int[] solution(int[] array, int[][] commands) {

        int[] answer = new int[commands.length];

        for(int i = 0; i < commands.length; i++) {
            int[] temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2] - 1];
        }

/*
        for(int i = 0; i < commands.length; i++) {
            int count = commands[i][1] - commands[i][0] + 1;
            int[] arr = new int[count];

            if (count >= 0) System.arraycopy(array, commands[i][0] - 1, arr, 0, count);
            Arrays.sort(arr);

            answer[i] = arr[commands[i][2] - 1];
        }
*/

        /* for(int i = 0; i < commands.length; i++)
            if ((commands[i][0] != commands[i][1])) {

                int count = commands[i][1] - commands[i][0] + 1;
                int[] arr = new int[count];

                if (count >= 0) System.arraycopy(array, commands[i][0] - 1, arr, 0, count);
                Arrays.sort(arr);

                answer[i] = arr[commands[i][2] - 1];
            } else {
                answer[i] = array[commands[i][0] - 1];
            }

         */

        return answer;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};


        System.out.println(Arrays.toString(solution(array, commands)));
    }
}
