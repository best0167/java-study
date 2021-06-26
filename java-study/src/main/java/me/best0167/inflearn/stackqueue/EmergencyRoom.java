package me.best0167.inflearn.stackqueue;

import java.util.LinkedList;
import java.util.Queue;

class Person{
    int id;
    int priority;
    public Person(int id, int priority){
        this.id = id;
        this.priority = priority;
    }
}

public class EmergencyRoom {
    public static int solution(int n, int m, int[] array){
        int answer = 0;
        Queue<Person> Q = new LinkedList<>();
        for(int i = 0; i < n; i++){
            Q.offer(new Person(i, array[i]));
        }
        while(!Q.isEmpty()){
            Person tmp = Q.poll();
            for(Person x : Q){
                if(x.priority > tmp.priority){
                    Q.offer(tmp);
                    tmp=null;
                    break;
                }
            }
            if(tmp != null){
                answer++;
                if(tmp.id == m) {
                    return answer;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 5;
        int m = 2;
        int[] array = {60, 50, 70, 80, 90};
        System.out.println(solution(n, m, array));

        int n1 = 6;
        int m1 = 3;
        int[] array1 = {70, 60, 90, 60, 60, 60};
        System.out.println(solution(n1, m1, array1));
    }

}
