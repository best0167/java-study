package me.best0167.programmerschallenge;

public class MinimumRectangle {
    public static int solution(int[][] sizes) {
        int answer = 0;

        int maxW = 1;
        int maxH = 1;

        for (int[] size : sizes) {
            int w = size[0];
            int h = size[1];

            maxW = Math.max(maxW, Math.max(w, h));
            maxH = Math.max(maxH, Math.min(w, h));
        }

        answer = maxW * maxH;

        return answer;
    }

    public static void main(String[] args) {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(solution(sizes));

        int[][] sizes1 = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
        System.out.println(solution(sizes1));


        int[][] sizes2 = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};
        System.out.println(solution(sizes2));
    }
}
