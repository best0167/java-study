package me.best0167;

public class Collatz {
    public static int solution(long num) {
        int answer = 0;
        int count = 0;


        while (num > 1 ) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = (num * 3) + 1;
            }
            count++;
            if(count > 500) {
                count = -1;
                break;
            }
        }

        answer = count;
        return answer;
    }

    public static void main(String[] args) {
        int num = 6;
        System.out.println(solution(num));

        int num1 = 16;
        System.out.println(solution(num1));

        int num2 = 626331;
        System.out.println(solution(num2));
    }

}
