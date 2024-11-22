package stringQuestion;

import java.util.Scanner;


public class String7 {
    public String solution(String s) {
        //StringBuilder 사용
//        String answer = "NO";
//        String tmp = new StringBuilder(s).reverse().toString();
//        if (s.equalsIgnoreCase(tmp)) answer = "YES";
//        return answer;

        s = s.toLowerCase();
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return "NO";
            }
        }

        return "YES";
    }

    public static void main(String[] args) {
        String7 T = new String7();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}