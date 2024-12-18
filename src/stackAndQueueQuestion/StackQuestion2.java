package stackAndQueueQuestion;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


public class StackQuestion2 {
    public String solution(String str) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : str.toCharArray()) {
            if (c == ')') {
                while (stack.pop() != '(');
            } else {
                stack.push(c);
            }
        }

        for (char c : stack.reversed()) {
            System.out.println(c);
        }

        StringBuilder sb = new StringBuilder();
        int length = stack.size();
        for (int i = 0; i < length; i++) {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        StackQuestion2 T = new StackQuestion2();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
//        int num2 = kb.nextInt();
//        int[] numArr = new int[num1];
//        for (int i = 0; i < num1; i++) {
//            numArr[i] = kb.nextInt();
//        }


        System.out.println(T.solution(str));

//        for (int i : T.solution(num1, num2, numArr)) {
//            System.out.print(i + " ");
//        }
    }
}