package stringQuestion;

import java.util.Scanner;

//indexOf가 효율적인 문제
public class String6 {
    public String solution(String s) {
        //indexOf를 사용하여 풀기 => 인덱스와 indexOf로 나온값이 같으면 첫번째겠구나!
        String answer= "";
        for (int i = 0; i < s.length(); i++) {
            if (i == s.indexOf(s.charAt(i))) {
                answer += s.charAt(i);
            }
        }

        return answer;

//        char[] charArray = s.toCharArray();
//        for (int i = 0; i < charArray.length; i++) {
//            if (charArray[i] == ' ') continue;
//            for (int j = i + 1; j < charArray.length; j++) {
//                if (charArray[i] == charArray[j]) {
//                    charArray[j] = ' ';
//                }
//            }
//        }
//        return String.valueOf(charArray).replace(" ", "");
    }

    public static void main(String[] args) {
        String6 T = new String6();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}