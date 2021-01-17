package me.best0167;

import java.util.*;

public class TwoSelectPlus {

    public static int[] solution(int[] numbers) {
        int[] answer = {};

        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        answer = set.stream().mapToInt(Integer::intValue).sorted().toArray();

        /*List<Integer> list = new ArrayList<>();

        for(int i = 0; i < numbers.length; i++) {
            for(int j = i+1; j < numbers.length; j++) {
                list.add(numbers[i] + numbers[j]);
            }
        }

        HashSet<Integer> hashSet = new HashSet<>(list);
        List<Integer> nums = new ArrayList<>(hashSet);

        Collections.sort(nums);
        answer = new int[nums.size()];

        for(int i = 0; i < nums.size(); i++) {
            answer[i] = nums.get(i);
        }*/

        return answer;

    }

    public static void main(String[] args) {

        int[] numbers = {2, 1, 3, 4, 1};
        System.out.println(Arrays.toString(solution(numbers)));

        int[] numbers1 = {5, 0, 2, 7};
        System.out.println(Arrays.toString(solution(numbers1)));
    }
}





// 이렇게 쓰면 똑같은 위치의 숫자를 두 번 더하게 된다.
//        for (int number : numbers) {
//            for (int i : numbers) {
//                list.add(number + i);
//            }
//        }