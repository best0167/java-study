package me.best0167;


import java.util.*;

public class FailRate {
    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];

        Double[] percent = new Double[N];
        Arrays.fill(percent, 0.0);

        Map<Integer, Integer> map = new HashMap<>();
        int count = stages.length;

        for (int per : stages) map.put(per, map.getOrDefault(per, 0) + 1);

        for (Map.Entry<Integer, Integer> key : map.entrySet()) {
            if (key.getValue() == 0) {
                percent[key.getKey() - 1] = 0.0;
            } else if (key.getKey() == N + 1) {
                break;
            } else {
                percent[key.getKey() - 1] = (double) key.getValue() / count;
                count -= key.getValue();
            }
        }

        List<Double> list = Arrays.asList(percent);

        List<Integer> index = new ArrayList<>(list.size());
        for (int i = 0; i < list.size(); i++) {
            index.add(i);
        }
        index.sort(Comparator.comparing(list::get).reversed());
        /*
        index.sort(Comparator.comparing((Integer index1) -> {
            return list.get(index1);
        }).reversed());
         */

        System.out.println(index);

        int size = 0;
        for(int i : index) {
            answer[size++] = i+1;
        }

        return answer;
    }



    public static void main(String[] args) {
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};

        System.out.println(Arrays.toString(solution(N, stages)));

        int N1 = 4;
        int[] stages1 = {4, 4, 4, 4};

        System.out.println(Arrays.toString(solution(N1, stages1)));

    }

}
