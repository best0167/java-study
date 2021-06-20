package me.best0167.inflearn.stackqueue;

import java.util.Stack;

public class PostFixNotation {
    public static int solution(String str) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) {
                stack.push(x - 48);
            } else {
                int rt = stack.pop();
                int lt = stack.pop();
                if (x == '+') {
                    stack.push(lt + rt);
                } else if (x == '-') {
                    stack.push(lt - rt);
                } else if (x == '*') {
                    stack.push(lt * rt);
                } else if (x == '/') {
                    stack.push(lt / rt);
                }
            }
            answer = stack.get(0);
        }
        return answer;
    }

    public static void main(String[] args) {
        String str = "352+*9-";
        System.out.println(solution(str));
    }


}
