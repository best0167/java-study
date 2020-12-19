package me.best0167;

import java.util.Stack;

public class CrainDoll {



    public int solution(int[][] board, int[] moves) {

        int count = 0;
        Stack<Integer> bucket = new Stack<>();
        for (int move : moves) {
            int index = getDollIndex(board, move - 1);
            // 인형을 잡은거임
            if (index > -1) {
                // 인형을 뽑았으니까 board에서 인형 제거
                int doll = board[index][move - 1];
                board[index][move - 1] = 0;
                // 내가 잡은 인형이 이전에 잡은 인형이랑 같은 종류의 인형이가...?
                if (!bucket.isEmpty() && bucket.peek() == doll) {
                    bucket.pop();
                    count += 2;
                } else {
                    bucket.push(doll);
                }
            }
        }
        return count;
    }


     public static int getDollIndex(int[][] board, int j) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][j] > 0) {
                    return i;
                }
            }
            return -1;
        }

    public static void main(String[] args) {

        int[][] boards = {{0, 0, 0, 0, 0},
                    {0, 0, 1, 0, 3},
                    {0, 2, 5, 0, 1},
                    {4, 2, 4, 4, 2},
                    {3, 5, 1, 3, 1}};
        int[] moves = {3, 5, 1, 3, 1};


    }


     /*   public int solution(int[][] board, int[] moves) {

            int count = 0;
            Stack<Integer> bucket = new Stack<>();
            for (int move : moves) {
                int index = getDollIndex(board, move - 1);
                // 인형을 잡은거임
                if (index > -1) {
                    // 인형을 뽑았으니까 board에서 인형 제거
                    int doll = board[index][move - 1];
                    board[index][move - 1] = 0;
                    // 내가 잡은 인형이 이전에 잡은 인형이랑 같은 종류의 인형이가...?
                    if (!bucket.isEmpty() && bucket.peek() == doll) {
                        bucket.pop();
                        count += 2;
                    } else {
                        bucket.push(doll);
                    }
                }
            }
            return count;
        }

        int getDollIndex(int[][] board, int j) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][j] > 0) {
                    return i;
                }
            }
            return -1;
        }
    }

}*/




    /*
board    [0, 0, 0, 0, 0]
    [0, 0, 1, 0, 3]
    [0, 2, 5, 0, 1]
    [4, 2, 4, 4, 2]
    [3, 5, 1, 3, 1]

moves [3, 5, 1, 3, 1]

return 4
*/



}
