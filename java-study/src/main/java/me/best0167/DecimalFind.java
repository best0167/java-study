package me.best0167;

import java.util.ArrayList;

public class DecimalFind {
    public static int solution(int n) {
        int answer = 0;

        //에라토스테네스의 체
        boolean[] primeList = new boolean[n+1];
        if (n <= 1) {
            return 0;
        }
        for(int i = 2; i < primeList.length; i++) {
            primeList[i] = true;
        }

        // 2부터 ~i*i < n
        // 각각의 배수들을 지워간다.
        for (int i = 2; (i * i) <= n; i++) {
            if (primeList[i]) {
                for (int j = i * i; j <= n; j += i) {
                    primeList[j] = false;
                    // i*i 미만은 이미 처리되었으므로 j의 시작값은 i*i로 최적화할 수 있다.
                }
            }
        }
        for(int i = 0; i <= n; i++) {
            if(primeList[i]) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(solution(n));

        int n1 = 5;
        System.out.println(solution(n1));
    }
}





// 효율성 테스트 실패
        /*for(int i = 2; i <= n; i++) {
            int a = 0;
            for(int j = 2; j <= i; j++) {
                if(i % j == 0) {
                    a++;
                }
            }
            if(a == 1) {
                answer++;
            }
        }
        return answer;
    } */

/* 효율성 테스트 실패
/*ArrayList<Boolean> primeList = new ArrayList<>(n + 1);
    ArrayList<Boolean> primeList = new ArrayList<>(n + 1);

        if (n <= 1) {
                return 0;
                }

                primeList.add(false);
                primeList.add(false);

                // 2 ~ n까지 소수로 설정
                for (int i = 2; i <= n; i++) {
                primeList.add(i, true);
                }

                // 2부터 ~i*i < n
                // 각각의 배수들을 지워간다.
                for (int i = 2; (i * i) <= n; i++) {
                if (primeList.get(i)) {
                for (int j = i * i; j <= n; j += i) {
                primeList.set(j, false);
                }
                }
                }
                for(int i = 0; i <= n; i++) {
                if(primeList.get(i)) {
                answer++;
                }
                }
                return answer;
                }*/
