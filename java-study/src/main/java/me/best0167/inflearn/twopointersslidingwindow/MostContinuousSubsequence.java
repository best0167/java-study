package me.best0167.inflearn.twopointersslidingwindow;

public class MostContinuousSubsequence {
    public static int solution(int n, int m, int[] array) {
        int answer=0, cnt=0, lt=0;
        for(int rt=0; rt<n; rt++){
            if(array[rt]==0) {
                cnt++;
            }
            while(cnt>m){
                if(array[lt]==0) {
                    cnt--;
                }
                lt++;
            }
            answer = Math.max(answer, rt - lt +1);
        }


        return answer;
    }

    public static void main(String[] args) {
        int n = 14;
        int m = 2;
        int[] array = {1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1};

        System.out.println(solution(n, m, array));
    }

}
