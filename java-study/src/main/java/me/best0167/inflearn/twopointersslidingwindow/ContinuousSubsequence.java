package me.best0167.inflearn.twopointersslidingwindow;

public class ContinuousSubsequence {
    public static int solution(int n, int m, int[] array) {
        int answer = 0;
        int sum = 0;
        int lt = 0;

        for (int rt = 0; rt < n; rt++) {
            sum += array[rt];
            if(sum == m) {
                answer++;
            }
            while (sum >= m) {
                sum -= array[lt++];
                if(sum == m) {
                    answer++;
                }
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        int n = 8;
        int m = 6;
        int[] array = {1, 2, 1, 3, 1, 1, 1, 2};

        System.out.println(solution(n, m, array));
    }

}
