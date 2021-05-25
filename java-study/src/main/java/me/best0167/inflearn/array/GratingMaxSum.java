package me.best0167.inflearn.array;

public class GratingMaxSum {
    public static int solution(int n, int[][] array) {
        int answer = 0;

        int sum1, sum2;

        for(int i = 0; i < n; i++) {
            sum1 = sum2 = 0;
            for(int j = 0; j < n; j++) {
                sum1 += array[i][j];
                sum2 += array[j][i];

            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }
        sum1 = sum2 = 0;
        for(int i = 0; i < n; i++) {
            sum1 += array[i][i];
            sum2 += array[i][n - i - 1];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }

    public static void main(String[] args) {
        int n = 5;
        int[][] array = {{10, 13, 10, 12, 15},
                        {12, 39, 30, 23, 11},
                        {11, 25, 50, 53, 15},
                        {19, 27, 29, 37, 27},
                        {19, 13, 30, 13, 19}};
        System.out.println(solution(n, array));
    }
}
