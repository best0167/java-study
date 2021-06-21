package me.best0167.inflearn.stackqueue;

import java.util.Stack;

public class IronStick {
    public static int solution(String str){
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i)=='(') {
                stack.push('(');
            }
            else{
                stack.pop();
                if(str.charAt(i-1)=='(') {
                    answer+=stack.size();
                }
                else answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String str = "()(((()())(())()))(())";
        System.out.println(solution(str));

        String str1 = "(((()(()()))(())()))(()())";
        System.out.println(solution(str1));
    }
}
