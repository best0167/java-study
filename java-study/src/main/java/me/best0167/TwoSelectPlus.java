package me.best0167;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TwoSelectPlus {

    public static int solution(int[] numbers) {
        return IntStream.of(numbers).sum();

    }

    public static void main(String[] args) {

        int[] numbers = {2, 1, 3, 4, 1};
        System.out.println(Arrays.toString(numbers));

        int[] numbers1 = {5, 0, 2, 7};
        System.out.println(Arrays.toString(numbers1));
    }
}
