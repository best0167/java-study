package me.best0167.inflearn.array;

public class EratosthenesSieve {
    public static int solution(int n) {
        int answer = 0;

        int[] ch = new int[n + 1];
        for(int i = 2; i <= n; i++) {
            if(ch[i] == 0) {
                answer++;
                for (int j = i; i * j <= n; j = j + 1) {
                    ch[i * j] = 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 20;

        System.out.println(solution(n));
    }
}
