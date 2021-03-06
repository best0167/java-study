package me.best0167;

import java.util.Arrays;

public class GreatestLeastCommonMultiple {
    public static int[] solution(int n, int m) {
        int[] answer = new int[2];

        answer[0] = gcd(n, m);

        if(answer[0] == 1) {
            answer[1] = n * m;
        } else {
            answer[1] = m * (n / answer[0]);
        }

        return answer;

        /*int a = n;
        int b = m;

        while (a > 0) {
            if (b % a != 0) {
                int temp = a;
                a = b % a;
                b = temp;

            } else {
                break;
            }
        }

        if(answer[0] == 1) {
            answer[1] = n * m;
        } else {
            answer[1] = m * (n / a);
        }

        return answer;*/
    }

    public static int gcd(int n, int m) {
        if (m == 0) {
            return n;
        }

        return gcd(m, n % m);
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 12;
        System.out.println(Arrays.toString(solution(n, m)));

        int n1 = 2;
        int m1 = 5;
        System.out.println(Arrays.toString(solution(n1, m1)));

        int n2 = 19332;
        int m2 = 78696;
        System.out.println(Arrays.toString(solution(n2, m2)));
    }
}
