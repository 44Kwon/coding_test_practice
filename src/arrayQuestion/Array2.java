package arrayQuestion;

import java.util.ArrayList;
import java.util.Scanner;


public class Array2 {
    public int solution(int n, int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int maxNum = 0;
        int answer = 0;
        for (int i : arr) {
            if (maxNum < i) {
                answer++;
                maxNum = i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Array2 T = new Array2();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int[] numArr = new int[num];
        for (int i = 0; i < num; i++) {
            numArr[i] = kb.nextInt();
        }

        System.out.println(T.solution(num,numArr));
//        for (int i : T.solution(num, numArr)) {
//            System.out.print(i + " ");
//        }
    }
}