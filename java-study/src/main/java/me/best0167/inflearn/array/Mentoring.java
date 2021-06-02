package me.best0167.inflearn.array;

public class Mentoring {
    public static int solution(int n, int m, int[][] array) {
        int answer = 0;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <=n; j++) {
                int cnt = 0;
                for(int k = 0; k < m; k++) {
                    int pi = 0, pj = 0;
                    for(int s = 0; s < n; s++) {
                        if (array[k][s] == i) {
                            pi = s;
                        }
                        if (array[k][s] == j) {
                            pj = s;
                        }
                    }
                    if(pi < pj) {
                        cnt++;
                    }
                    if(cnt == m) {
                        answer++;
                    }

                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 4;
        int m = 3;
        int[][] array = {{3, 4, 1, 2},
                        {4, 3, 2, 1},
                        {3, 1, 4, 2}};
        System.out.println(solution(n, m, array));
    }

}
