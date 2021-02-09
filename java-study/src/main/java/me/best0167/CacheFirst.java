package me.best0167;

public class CacheFirst {
    public static int solution(int cacheSize, String[] cities) {
        int answer = 0;

        return answer;
    }


    public static void main(String[] args) {

        int cacheSize = 3;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        System.out.println(solution(cacheSize, cities));

        int cacheSize1 = 3;
        String[] cities1 = {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"};
        System.out.println(solution(cacheSize1, cities1));

        int cacheSize2 = 2;
        String[] cities2 = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};
        System.out.println(solution(cacheSize2, cities2));

        int cacheSize3 = 5;
        String[] cities3 = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};
        System.out.println(solution(cacheSize3, cities3));

        int cacheSize4 = 2;
        String[] cities4 = {"Jeju", "Pangyo", "NewYork", "newyork"};
        System.out.println(solution(cacheSize4, cities4));

        int cacheSize5 = 0;
        String[] cities5 = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        System.out.println(solution(cacheSize5, cities5));

    }
}
