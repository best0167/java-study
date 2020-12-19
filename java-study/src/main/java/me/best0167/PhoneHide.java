package me.best0167;

public class PhoneHide {

    public static String solution(String phone_number) {
        StringBuilder answer = new StringBuilder();

        for(int i = 0; i < phone_number.length()-4; i++) {
            answer.append("*");
        }

        for(int i = phone_number.length()-4; i < phone_number.length(); i++) {
            answer.append(phone_number.charAt(i));
        }
        return answer.toString();
    }

    public static void main(String[] args) {

        String phone_number = "01033334444";
        System.out.println(solution(phone_number));

        String phone_number1 = "027778888";
        System.out.println(solution(phone_number1));
    }

}
