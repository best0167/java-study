package me.best0167;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeTest {

    public static int[] solution(int[] answers) {
        int[] answer = {};

        int[] n1 = {1, 2, 3, 4, 5};
        int[] n2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] n3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] count = new int[3];

        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == n1[i % 5]) {
                count[0]++;
            } if(answers[i] == n2[i % 8]) {
                count[1]++;
            } if(answers[i] == n3[i % 10]) {
                count[2]++;
            }
        }

        int max = Math.max(Math.max(count[0], count[1]), count[2]);

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < count.length; i++) {
            if (max == count[i]) {
                list.add(i+1);
            }
        }

        answer = new int[list.size()];

        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;

    }

    public static void main(String[] args) {
        int[] answers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(solution(answers)));

        int[] answers1 = {1, 3, 2, 4, 2};
        System.out.println(Arrays.toString(solution(answers1)));
    }
}
