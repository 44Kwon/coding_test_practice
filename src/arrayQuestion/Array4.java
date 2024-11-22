package arrayQuestion;

import java.util.Scanner;


public class Array4 {
    public int[] solution(int n) {
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;
        for (int i = 2; i < answer.length; i++) {
            answer[i] = answer[i-2] + answer[i-1];
        }

        return answer;
    }

    public static void main(String[] args) {
        Array4 T = new Array4();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
//        int[] numArr = new int[num];
//        for (int i = 0; i < num; i++) {
//            numArr[i] = kb.nextInt();
//        }

        for (int i : T.solution(num)) {
            System.out.print(i + " ");
        }
    }
}