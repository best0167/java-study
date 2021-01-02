package me.best0167;

public class Digit {
    public static int solution(int n) {
        int answer = 0;

        while (n != 0) {
            answer += n % 10;
            n /= 10;
        }
        /*int count = 0;
        int a = n;

        while (a != 0) {
            a /= 10;
            count++;
        }

        int[] array = new int[count];
        for(int i = 0; i < count; i++) {
            array[i] = n % 10;
            n /= 10;
        }

        for(int i = 0; i < count; i++) {
            answer += array[i];
        }*/

        return answer;
    }

    public static void main(String[] args) {
        int n = 123;
        System.out.println(solution(n));

        int n1 = 987;
        System.out.println(solution(n1));
    }
}
