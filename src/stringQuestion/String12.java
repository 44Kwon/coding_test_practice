package stringQuestion;

import java.util.Scanner;


public class String12 {
    public String solution(int n, String s) {
        String answer = "";
        s = s.replace("#", "1").replace("*", "0");
        for (int i = 0; i < n; i++) {
            String tmp = s.substring(0, 7);
            answer += (char)Integer.parseInt(tmp, 2);
            s = s.substring(7);
        }

        return answer;
    }

    public static void main(String[] args) {
        String12 T = new String12();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        String str = kb.next();
        System.out.print(T.solution(num, str));

    }
}