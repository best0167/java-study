package me.best0167.inflearn.hashmaptreeset;

import java.util.HashMap;

public class ClassLeader {
    public static char solution(int n, String s) {
        char answer=' ';
        HashMap<Character, Integer> map=new HashMap<>();
        for(char x : s.toCharArray()){
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        //System.out.println(map.containsKey('F'));
        //System.out.println(map.size());
        //System.out.println(map.remove('C'));

        int max=Integer.MIN_VALUE;
        for(char key : map.keySet()){
            //System.out.println(key+" "+map.get(key));
            if(map.get(key)>max){
                max=map.get(key);
                answer=key;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 15;
        String s = "BACBACCACCBDEDE";

        System.out.println(solution(n, s));
    }

}
