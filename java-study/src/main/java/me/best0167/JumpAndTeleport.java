package me.best0167;

import java.util.ArrayList;
import java.util.List;

public class JumpAndTeleport {
    public static int solution(int n) {
        int ans = 0;

        while (n > 0) {
            if (n % 2 != 0) {
                ans++;
                n /= 2;
            } else {
                n /= 2;
            }
        }


        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(solution(n));

        int n1 = 6;
        System.out.println(solution(n1));

        int n2 = 5000;
        System.out.println(solution(n2));
    }
}
