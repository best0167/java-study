package me.best0167;

import java.util.*;

public class UnfinishedPlayer {
    public static String solution(String[] participant, String[] completion) {
        String answer = "";

/*
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < participant.length ; i++) {
            map.compute(participant[i], (k, v) -> v != null ? null : 1);
            if (i < completion.length) {
                map.compute(completion[i], (k, v) -> v != null ? null : 1);
            }
        }
        answer = map.keySet().iterator().next();

 */
        Map<String, Integer> map = new HashMap<>();

        // getOrDefault를 넣어줘야 중복 체크가 된다.
        // key가 존재하면 value를 새로운 값으로 바꿔준다.
        // 이미 등록된 동명이인이 있다면 put.getOrDefault로 인해 2라는 값이 들어간다.
        for (String player : participant) map.put(player, map.getOrDefault(player, 0) + 1);
        for (String player : completion) map.put(player, map.get(player) - 1);

        for (Map.Entry<String, Integer> key : map.entrySet()) {
            if (key.getValue() != 0) {
                answer = key.getKey();
                break;
            }
        }

        /*
        // 효율성 면에선 좋은 답안이 아니다. keySet하고 또 get하는건 매우 비효율적인 코드(get할 때마다 계속 Map을 search하므로)
        // key, value를 같이 가져올 때는 항상 entrySet을 사용해야 한다. keySet() 메서드는 key의 값만 필요한 경우 사용.
        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                answer = key;
                // 값이 하나가 나오므로 굳이 마지막까지 탐색할 필요가 없다.
                break;
                //
            }
        } */




        /*List<String> list = new ArrayList<>();

        Arrays.sort(participant);
        Arrays.sort(completion);

        for(int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                list.add(participant[i]);
            }
        }

        if(list.size() == 0) {
            answer = participant[participant.length - 1];
        } else {
            answer = list.get(0);
        }*/

        return answer;
    }

    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        System.out.println(solution(participant, completion));

        String[] participant1 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion1 = {"josipa", "filipa", "marina", "nikola"};
        System.out.println(solution(participant1, completion1));

        String[] participant2 = {"mislav", "stanko", "mislav", "ana"};
        String[] completion2 = {"stanko", "ana", "mislav"};
        System.out.println(solution(participant2, completion2));
    }
}
