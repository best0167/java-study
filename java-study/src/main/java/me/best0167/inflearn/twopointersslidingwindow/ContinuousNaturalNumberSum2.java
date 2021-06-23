package me.best0167.inflearn.twopointersslidingwindow;

public class ContinuousNaturalNumberSum2 {
    public static int solution(int n) {
        int answer = 0;
        int cnt = 1;

        n--;
        while (n > 0) {
            cnt++;
            n -= cnt;
            if(n % cnt == 0) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 15;
        System.out.println(solution(n));
    }
}
