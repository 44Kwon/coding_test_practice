package stackAndQueueQuestion;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


public class QueueQuestion7 {
    public String solution(String str1, String str2) {
        Deque<Character> queue = new ArrayDeque<>();
        for (char c : str2.toCharArray()) {
            queue.offer(c);
        }

        for (int i = 0; i < str1.length(); i++) {
            if (queue.contains(str1.charAt(i))) {
                while (queue.poll() != str1.charAt(i));
            } else {
                return "NO";
            }
        }

        return "YES";
    }

    public static void main(String[] args) {
        QueueQuestion7 T = new QueueQuestion7();
        Scanner kb = new Scanner(System.in);
        String str1 = kb.next();
        String str2 = kb.next();

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


        System.out.println(T.solution(str1,str2));

//        for (int i : T.solution(num1, num2, numArr)) {
//            System.out.print(i + " ");
//        }
    }
}