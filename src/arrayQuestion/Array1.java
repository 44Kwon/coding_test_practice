package arrayQuestion;

import java.util.ArrayList;
import java.util.Scanner;


public class Array1 {
    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for (int i = 0; i < n-1; i++) {
            if (arr[i] < arr [i+1]) {
                list.add(arr[i+1]);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        Array1 T = new Array1();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int[] numArr = new int[num];
        for (int i = 0; i < num; i++) {
            numArr[i] = kb.nextInt();
        }

        for (int i = 0; i < T.solution(num, numArr).size(); i++) {
            System.out.print(T.solution(num, numArr).get(i) + " ");
        }
    }
}