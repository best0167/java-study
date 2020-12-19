package me.best0167;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class EndingConnection {

    public static int[] solution(int n, String[] words) {
        Set<String> usedWords = new HashSet<>();
        char lastChar = '\0';

        for (int turn = 0; turn < words.length; turn++) {
            String word = words[turn];
            if (turn > 0) {
                // 게임이 끝난 경우 처리만 할거임
                // 현재 말한 단어의 첫글자가 지난번 단어의 마지막 글자(lastChar)랑 같지 않으면 끝(game over)
                // 말한 적 있는 단어를 다시 말했을 때도 게임 끝(game over)
                if (word.charAt(0) != lastChar || usedWords.contains(word)) {
                    return new int[] {turn % n + 1, turn / n + 1};
                }
            }
            lastChar = word.charAt(word.length() - 1);
            usedWords.add(word);
        }
        return new int[] {0, 0};
    }

    public static void main(String[] args) {

        int n = 3;
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};

        System.out.println(Arrays.toString(solution(n, words)));

    }
}
