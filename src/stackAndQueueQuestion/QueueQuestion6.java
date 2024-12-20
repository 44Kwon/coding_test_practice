package stackAndQueueQuestion;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


public class QueueQuestion6 {
    public int solution(int n1, int n2) {
        //queue 문제
        //1~n까지 일단 큐에 담는다.
        //(선입선출 이용)큐에서 값을 빼면서 다시 넣는다. n2번째는 값을 뺴기만 하고 넣지 않는다.
        //반복하면서 큐 사이즈가 1개일떄까지 돌린다.
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i <= n1; i++) {
            queue.offer(i);
        }

        while (queue.size() > 1) {
            for (int i = 0; i < n2; i++) {
                if(i == n2-1) queue.poll();
                else queue.offer(queue.poll());
            }
        }

        return queue.peek();
    }

    public static void main(String[] args) {
        QueueQuestion6 T = new QueueQuestion6();
        Scanner kb = new Scanner(System.in);
        int num1 = kb.nextInt();
        int num2 = kb.nextInt();
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


        System.out.println(T.solution(num1,num2));

//        for (int i : T.solution(num1, num2, numArr)) {
//            System.out.print(i + " ");
//        }
    }
}