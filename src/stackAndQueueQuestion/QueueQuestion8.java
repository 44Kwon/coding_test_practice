package stackAndQueueQuestion;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


class Person {
    int id;
    int priority;

    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}

//Person 객체를 만들어서 비교하면서.... 풀어보기 큐문제 8번 (응급실) , 스택문제 5번과 더불어 어려움
//for break 하기전에 poll한 것을 null하는게 keypoint임
public class QueueQuestion8 {
    public int solution(int num1, int num2, int[] arr) {
        Deque<Person> queue = new ArrayDeque<>();
        for (int i = 0; i < arr.length; i++) {
            Person person = new Person(i, arr[i]);
            queue.offer(person);
        }

        int answer = 0;

        while (true) {
            Person poll = queue.poll();
            for (Person p : queue) {
                if (poll.priority < p.priority) {
                    queue.offer(poll);
                    poll = null;
                    break;
                }
            }

            if (poll != null) {
                answer++;
                if (poll.id == num2) return answer;
            }
        }
    }

    public static void main(String[] args) {
        QueueQuestion8 T = new QueueQuestion8();
        Scanner kb = new Scanner(System.in);
        int num1 = kb.nextInt();
        int num2 = kb.nextInt();
        int[] numArr = new int[num1];
        for (int i = 0; i < num1; i++) {
            numArr[i] = kb.nextInt();
        }

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


        System.out.println(T.solution(num1,num2,numArr));

//        for (int i : T.solution(num1, num2, numArr)) {
//            System.out.print(i + " ");
//        }
    }
}