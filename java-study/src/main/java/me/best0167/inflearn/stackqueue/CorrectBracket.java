package me.best0167.inflearn.stackqueue;

import java.util.Stack;

public class CorrectBracket {
    public static String solution(String str){
        String answer="YES";
        Stack<Character> stack=new Stack<>();

        for(char x : str.toCharArray()){
            if(x=='(') {
                stack.push(x);
            }
            else{
                if(stack.isEmpty()) {
                    return "NO";
                }
                stack.pop();
            }
        }
        if(!stack.isEmpty()) {
            return "NO";
        }
        return answer;
    }

    public static void main(String[] args) {
        String str = "(()(()))(()";
        System.out.println(solution(str));
    }
}
