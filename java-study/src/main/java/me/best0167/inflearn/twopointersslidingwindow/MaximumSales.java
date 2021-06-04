package me.best0167.inflearn.twopointersslidingwindow;

public class MaximumSales {
    public static int solution(int n, int m, int[] array) {
        int answer = 0;
        int sum = 0;

        for(int i = 0; i < m; i++) {
            sum += array[i];
        }

        answer = sum;

        for(int i = m; i < n; i++) {
            sum += array[i] - array[i - m];
            answer = Math.max(answer, sum);
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 10;
        int m = 3;
        int[] array = {12, 15, 11, 20, 25, 10, 20, 19, 13, 15};

        System.out.println(solution(n, m ,array));
    }

}
