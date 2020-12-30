package me.best0167;

public class OddLetter {
    public static String solution(String s) {
        String answer = "";

        int index = 0;
        StringBuilder sb = new StringBuilder();

        // 공백 처리를 안해서 테스트 케이스에서 실패처리 전적이 있음
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                sb.append(' ');
                index = 0;
            } else {
                if (index % 2 == 0) {
                    sb.append(s.toUpperCase().charAt(i));
                    index++;
                } else {
                    sb.append(s.toLowerCase().charAt(i));
                    index--;
                }
            }
            answer = sb.toString();
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "try hello world";
        System.out.println(solution(s));
    }
}
