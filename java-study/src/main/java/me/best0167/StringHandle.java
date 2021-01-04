package me.best0167;

public class StringHandle {

    public static boolean solution(String s) {
        String s1 = "^[0-9]+$";

        if (s.length() == 4 && s.matches("^[0-9]+$")) {
            return true;
        } else
            return s.length() == 6 && s.matches("^[0-9]+$");


        //return s.matches("^[0-9]+$");
    }

    public static void main(String[] args) {
        String s = "a234";
        System.out.println(solution(s));

        String s1 = "1234";
        System.out.println(solution(s1));
    }
}
