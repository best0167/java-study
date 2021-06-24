package me.best0167.inflearn.stackqueue;

import java.util.LinkedList;
import java.util.Queue;

public class PrincessSave {
    public static int solution(int n, int m){
        int answer = 0;
        Queue<Integer> Q = new LinkedList<>();

        for(int i = 1; i <= n; i++) {
            Q.offer(i);
        }
        while(!Q.isEmpty()){
            for(int i = 1; i < m; i++) {
                Q.offer(Q.poll());
            }
            Q.poll();
            if(Q.size()==1) {
                answer = Q.poll();
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 8;
        int m = 3;

        System.out.println(solution(n, m));
    }
}
