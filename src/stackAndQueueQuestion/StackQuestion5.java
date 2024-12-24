package stackAndQueueQuestion;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


//잘 모르겠음 (쇠막대기 레이저 문제). 꼭 다시 풀어보기
public class StackQuestion5 {
    public int solution(String s) {
        int answer = 0;
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push('(');
            } else {
                if (s.charAt(i-1) == '(') {
                    stack.pop();
                    answer += stack.size();
                } else {
                    stack.pop();
                    answer += 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        StackQuestion5 T = new StackQuestion5();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();

        System.out.println(T.solution(s));

//        for (int i : T.solution(num1, num2, numArr)) {
//            System.out.print(i + " ");
//        }
    }
}