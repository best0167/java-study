package me.best0167.inflearn.array;

public class ScoreCalculation {
    public static int solution(int n, int[] array) {
        int answer = 0;

        int tmp = 0;

        for(int i = 0; i < n; i++) {

            if(array[i] == 1) {
                tmp = tmp + 1;
                answer += tmp;
            } else {
                tmp = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 10;
        int[] array = {1, 0, 1, 1, 1, 0, 0, 1, 1, 0};

        System.out.println(solution(n, array));
    }
}
