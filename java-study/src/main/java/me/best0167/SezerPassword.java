package me.best0167;

public class SezerPassword {

    public static String solution(String s, int n) {

        StringBuilder answer = new StringBuilder();

        char[] uppercase = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
                            'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] lowercase = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
                            'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        //System.out.println(uppercase[8 + 10]);


        for(int i = 0; i < s.length(); i++) {
            char word = s.charAt(i);

            if(word >= uppercase[0] && word <= uppercase[25]) {
                if(word + n > 'Z') {
                    answer.append((char) (word + n - 26));
                } else {
                    answer.append((char) (word + n));
                }
            } else if(word >= lowercase[0] && word <= lowercase[25]){
                if(word + n > 'z') {
                    answer.append((char) (word + n - 26));
                } else {
                    answer.append((char) (word + n));
                }
            } else if(word == ' ') {
                answer.append(word);
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("AB", 1));
        System.out.println(solution("Cc E", 3));
        System.out.println(solution("K o M", 16));
        System.out.println(solution("m a G", 14));
    }
}
