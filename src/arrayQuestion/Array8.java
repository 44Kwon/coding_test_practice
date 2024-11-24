package arrayQuestion;

import java.util.Scanner;


//다시 풀어보기 못풀음!
public class Array8 {
    public int[] solution(int n, int[] arr) {
        int[] answer = new int[arr.length];
        int num = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    num++;
                }
            }
            answer[i] = num;
            num = 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Array8 T = new Array8();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int[] numArr = new int[num];
        for (int i = 0; i < num; i++) {
            numArr[i] = kb.nextInt();
        }

//        System.out.println(T.solution(num, numArr));

        for (int i : T.solution(num, numArr)) {
            System.out.print(i + " ");
        }
    }
}