package stringQuestion;

import java.util.Scanner;

//꼭 다시 풀어보기 어려움!!!
//생각 다시 해보기
public class String11 {
    public String solution(String s) {
        char[] charArray = s.toCharArray();
        String answer = "";
        int num = 1;
        for (int i = 1; i < charArray.length; i++) {
            if (charArray[i-1] == charArray[i]) {
                num++;
            } else {
                if (num == 1) {
                    answer += charArray[i-1];
                } else {
                    answer += charArray[i-1] + String.valueOf(num);
                }

                num = 1;
            }
        }

        if (num != 1) {
            answer += charArray[charArray.length-1] + String.valueOf(num);
        } else {
            answer += charArray[charArray.length-1];
        }

        return answer;
    }

    public static void main(String[] args) {
        String11 T = new String11();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));

    }
}