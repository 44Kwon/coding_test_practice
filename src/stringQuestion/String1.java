package stringQuestion;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class String1 {
    public int solution(String str, char t) {
        str = str.toLowerCase();
        t = Character.toLowerCase(t);
        int answer = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == t) {
//                answer++;
//            }
//        }
        // 향상된 for문 (String을 char 배열로 만듬)
        for (char x : str.toCharArray()) {
            if (x == t) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String1 T = new String1();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        System.out.print(T.solution(str,c));
    }
}