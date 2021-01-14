package me.best0167;

import java.util.*;

public class Tuple {

    public static int[] solution(String s) {
        int[] answer = {};

        s = s.substring(1, s.length() - 2);

        String[] arr = s.split("},");
        int count = arr.length;

        answer = new int[count];


        /*String[] array_final = arr(count-1);*/

        Arrays.sort(arr, Comparator.comparingInt(String::length));
        //Arrays.sort(arr, (a, b) -> Integer.compare(a.length(), b.length()));
        /*Arrays.sort(arr, new java.util.Comparator<String>() {

            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        });*/
        //System.out.println(Arrays.toString(arr));
        /*System.out.println((arr[count-1]));*/

        /*String[] number = (arr[count - 1].substring(1)).split(",");*/

        answer[0] = Integer.parseInt(arr[0].substring(1, arr[0].length()));

        Map<String, Integer> map = new HashMap<>();
        map.put(String.valueOf(answer[0]), 1);

        String[] s1 = new String[count];

        for(int i = 1; i < arr.length; i++) {
            s1 = arr[i].substring(1).split(",");
            //System.out.println(Arrays.toString(s1));
            for (String key : s1) map.put(key, map.getOrDefault(key, 0) + 1);

            for (Map.Entry<String, Integer> key : map.entrySet()) {
                if (key.getValue() == 1) {
                    answer[i] = Integer.parseInt(key.getKey());
                }
            }
            map.put(String.valueOf(answer[i]), 1);
        }
        
        return answer;
    }


    public static void main(String[] args) {
/*
        String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
        System.out.println(Arrays.toString(solution(s)));
 */
        String s1 = "{{1,2,3},{2,1},{1,2,4,3},{2}}";
        System.out.println(Arrays.toString(solution(s1)));

/*
     String s2 = "{{20,111},{111}}";
        System.out.println(Arrays.toString(solution(s2)));


        String s3 = "{{123}}";
        System.out.println(Arrays.toString(solution(s3)));

        String s4 = "{{4,2,3},{3},{2,3,4,1},{2,3}}";
        System.out.println(Arrays.toString(solution(s4)));  */
    }
}
