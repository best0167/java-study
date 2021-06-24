package me.best0167.inflearn.stackqueue;

import java.util.LinkedList;
import java.util.Queue;

public class CurriculumDesign {
    public static String solution(String subject, String plan){
        String answer = "YES";
        Queue<Character> Q = new LinkedList<>();
        for(char x : subject.toCharArray()) {
            Q.offer(x);
        }

        for(char x : plan.toCharArray()){
            if(Q.contains(x)){
                if(x!=Q.poll()) {
                    return "NO";
                }
            }
        }

        if(!Q.isEmpty()) {
            return "NO";
        }

        return answer;
    }

    public static void main(String[] args) {
        String subject = "CBA";
        String plan = "CBDAGE";

        System.out.println(solution(subject, plan));
    }
}
