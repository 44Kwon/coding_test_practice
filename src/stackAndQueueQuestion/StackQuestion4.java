package stackAndQueueQuestion;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


//후위식 연산. stack이용해야함
public class StackQuestion4 {
    public int solution(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(c - 48);
            } else {
                int rt = stack.pop();
                int lt = stack.pop();
                switch (c) {
                    case '+' : stack.push(lt + rt);
                        break;
                    case '-' :stack.push(lt - rt);
                        break;
                    case '*' :stack.push(lt * rt);
                        break;
                    case '/' :stack.push(lt / rt);
                        break;
                    default:
                        break;
                }
            }
        }
        return stack.peek();
    }

    public static void main(String[] args) {
        StackQuestion4 T = new StackQuestion4();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
//        int[][] numArr1 = new int[num1][num1];
//        for (int i = 0; i < num1; i++) {
//            for (int j = 0; j < num1; j++) {
//                numArr1[i][j] = kb.nextInt();
//            }
//        }
//        int num2 = kb.nextInt();
//        int[] numArr2 = new int[num2];
//        for (int i = 0; i < num2; i++) {
//            numArr2[i] = kb.nextInt();
//        }


        System.out.println(T.solution(s));

//        for (int i : T.solution(num1, num2, numArr)) {
//            System.out.print(i + " ");
//        }
    }
}