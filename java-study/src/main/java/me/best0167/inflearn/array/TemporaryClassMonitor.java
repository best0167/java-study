package me.best0167.inflearn.array;

public class TemporaryClassMonitor {
    public static int solution(int n, int[][] array) {
        int answer = 0;

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 5;
        int[][] array = {{2, 3, 1, 7, 3},
                {4, 1, 9, 6, 8},
                {5, 5, 2, 4, 4},
                {6, 5, 2, 6, 7},
                {8, 4, 2, 2, 2}};
        System.out.println(solution(n, array));
    }
}
