package me.best0167;

public class KeyPadChoice {


    public static String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();

        int left = 10;
        int right = 12;

        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7) {
                answer.append("L");
                left = number;
            } else if (number == 3 || number == 6 || number == 9) {
                answer.append("R");
                right = number;
            } else {
                if (number == 0) {
                    number = 11;
                }
                int leftNum = Math.abs((number - left)) / 3 + Math.abs((number - left)) % 3;
                int rightNum = Math.abs((number - right)) / 3 + Math.abs((number - right)) % 3;

                if (leftNum > rightNum || (leftNum == rightNum && "right".equals(hand))) {  // hand.equals("right") 로 사용하면 실무에서 null이 들어갔을때 try-catch문을 써야 처리된다.
                                                                                            // "right".equals(hand)) 로 사용하면 null을 자동으로 처리하여 쓸 필요가 없다.
                    answer.append("R");
                    right = number;
                } else {
                    answer.append("L");
                    left = number;
                }
            }

        }
        return answer.toString();

    }


    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        System.out.println(solution(numbers, hand));

        int[] numbers1 = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String hand1 = "left";
        System.out.println(solution(numbers1, hand1));

        int[] numbers2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String hand2 = "left";
        System.out.println(solution(numbers2, hand2));
    }
}


/*  public static String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();

        int left = 10;
        int right = 12;
        int leftnum = 0;
        int rightnum = 0;


        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7) {
                answer.append("L");
                left = number;
            } else if (number == 3 || number == 6 || number == 9) {
                answer.append("R");
                right = number;
            } else {
                if (number == 0) {
                    leftnum = Math.abs((11 - left)) / 3 + Math.abs((11 - left)) % 3;
                    rightnum = Math.abs((11 - right)) / 3 + Math.abs((11 - right)) % 3;
                    if (leftnum > rightnum) {
                        answer.append("R");
                        right = 11;
                    } else if (leftnum < rightnum) {
                        answer.append("L");
                        left = 11;
                    } else if (leftnum == rightnum) {
                        if (hand.equals("left")) {
                            answer.append("L");
                            left = 11;
                        } else {
                            answer.append("R");
                            right = 11;
                        }
                    }
                } else {
                    leftnum = Math.abs((number - left)) / 3 + Math.abs((number - left)) % 3;
                    rightnum = Math.abs((number - right)) / 3 + Math.abs((number - right)) % 3;

                    if (leftnum > rightnum) {
                        answer.append("R");
                        right = number;
                    } else if (leftnum < rightnum) {
                        answer.append("L");
                        left = number;
                    } else if (leftnum == rightnum) {
                        if (hand.equals("left")) {
                            answer.append("L");
                            left = number;
                        } else {
                            answer.append("R");
                            right = number;
                        }
                    }

                }
            }


        }
        return answer.toString(); */