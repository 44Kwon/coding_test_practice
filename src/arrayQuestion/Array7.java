package arrayQuestion;

import java.util.Scanner;


public class Array7 {
    public int solution(int n, int[] arr) {
        int count = 0;
        int answer = 0;
        for (int i : arr) {
            if (i == 1) {
                count++;
                answer += count;
            } else {
                count = 0;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Array7 T = new Array7();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int[] numArr = new int[num];
        for (int i = 0; i < num; i++) {
            numArr[i] = kb.nextInt();
        }

        System.out.println(T.solution(num, numArr));

//        for (int i : T.solution(num, numArr)) {
//            System.out.print(i + " ");
//        }
    }
}