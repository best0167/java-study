package me.best0167;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class DartGame {
    public static int solution(String dartResult) {
        int answer = 0;

        int[] arr = new int[3];

        int num = Character.getNumericValue(dartResult.charAt(0));
        int count = 0;

        for(int i = 1; i < dartResult.length(); i++) {
            char ch = dartResult.charAt(i);

            if(ch == 'S') {
                arr[count] = ((int) Math.pow(num, 1));
                num = 0;
                count++;
            } else if(ch == 'D') {
                arr[count] = ((int) Math.pow(num, 2));
                num = 0;
                count++;
            } else if(ch == 'T') {
                arr[count] = ((int) Math.pow(num, 3));
                num = 0;
                count++;
            } else if(ch == '#') {
                arr[count-1] *= -1;
            } else if(ch == '*') {
                if(count == 1) {
                    arr[count - 1] *= 2;
                } else {
                    for (int j = count - 2; j < count; j++) {
                        arr[j] *= 2;
                    }
                }
            } else {
                if(num != 1) {
                    num = Character.getNumericValue(dartResult.charAt(i));
                } else {
                    num = 10;
                }
            }
        }

        for(int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }

        return answer;
    }


    public static void main(String[] args) {
        String dartResult = "1S2D*3T";
        System.out.println(solution(dartResult));

        String dartResult1 = "1D2S#10S";
        System.out.println(solution(dartResult1));

        String dartResult2 = "1D2S0T";
        System.out.println(solution(dartResult2));

        String dartResult3 = "1S*2T*3S";
        System.out.println(solution(dartResult3));

        String dartResult4 = "1D#2S*3S";
        System.out.println(solution(dartResult4));

        String dartResult5 = "1T2D3D#";
        System.out.println(solution(dartResult5));

        String dartResult6 = "1D2S3T*";
        System.out.println(solution(dartResult6));

    }
}
