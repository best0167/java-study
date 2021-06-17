package me.best0167.inflearn.stackqueue;

import java.util.Stack;

public class BracketLetterRemove {
    public static String solution(String str){
        String answer="";
        Stack<Character> stack=new Stack<>();

        for(char x : str.toCharArray()){
            if(x==')'){
                while(stack.pop()!='(');
            }
            else stack.push(x);
        }
        for(int i=0; i<stack.size(); i++) {
            answer += stack.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        String str = "(A(BC)D)EF(G(H)(IJ)K)LM(N)";
        System.out.println(solution(str));
    }
}
