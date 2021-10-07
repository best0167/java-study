package me.best0167.programmerschallenge.season3.october;

public class ProgrammersTest1 {
    public static int solution(int n) {
        int answer = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(solution(n));

        int n1 = 12;
        System.out.println(solution(n1));
    }
}

