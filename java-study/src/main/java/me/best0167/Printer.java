package me.best0167;

import java.util.*;

public class Printer {
    public static int solution(int[] priorities, int location) {
        int answer = 0;


       /* int front = -1;
        int rear = -1;

        Queue q = new LinkedList();

        for(int i = 0; i < priorities.length; i++) {
            q.offer(priorities[i]);
        }

        System.out.println(q);

        while(!q.isEmpty()) {
            Arrays.sort(priorities);
            int max = priorities[priorities.length - 1];

            if(q.peek() != max) {

            };
        }*/
        /*Arrays.sort(priorities);
        int max = priorities[priorities.length - 1];
        if(max != stack.pop()) {
            stack.
        }*/

        return answer;
    }

    public static void main(String[] args) {
        int[] priorities = {2, 1, 3, 2};
        int location = 2;
        System.out.println(solution(priorities, location));

        int[] priorities1 = {1, 1, 9, 1, 1, 1};
        int location1 = 0;
        System.out.println(solution(priorities1, location1));
    }
}
