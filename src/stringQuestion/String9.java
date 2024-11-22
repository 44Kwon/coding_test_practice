package stringQuestion;

import java.util.Scanner;


//다시풀어보기
public class String9 {
    public String solution(String s) {
        //방법 2가지
        // 1. answer = answer * 10 + (X-48)로 풀어보기
        // 2. Character.isDigit() 사용해서 풀어보기

        s = s.replaceAll("[^0-9]", "");

        return String.valueOf(Integer.parseInt(s));
    }

    public static void main(String[] args) {
        String9 T = new String9();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}