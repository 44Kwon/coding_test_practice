package twopointersQuestion;

import java.util.ArrayList;
import java.util.Scanner;


public class TwoPointers1 {
    public ArrayList<Integer> solution(int[] arr1, int[] arr2) {
        //two pointers algorithm -> O(n)
        ArrayList<Integer> list = new ArrayList<Integer>();
        int pointerA = 0, pointerB =0;
        int n = arr1.length, m = arr2.length;
        while (pointerA < n && pointerB < m) {
            if (arr1[pointerA] <= arr2[pointerB]) {
                list.add(arr1[pointerA++]);
//                pointerA++;
            } else {
                list.add(arr2[pointerB++]);
//                pointerB++;
            }
        }
        while (pointerA < n) {
            list.add(arr1[pointerA++]);
        }
        while (pointerB < m) {
            list.add(arr2[pointerB++]);
        }

        return list;

    }

    public static void main(String[] args) {
        TwoPointers1 T = new TwoPointers1();
        Scanner kb = new Scanner(System.in);
        int num1 = kb.nextInt();
        int[] num1Arr = new int[num1];
        for (int i = 0; i < num1; i++) {
            num1Arr[i] = kb.nextInt();
        }
        int num2 = kb.nextInt();
        int[] num2Arr = new int[num2];
        for (int i = 0; i < num2; i++) {
            num2Arr[i] = kb.nextInt();
        }


//        System.out.println(T.solution(num, numArr));

        for (int i : T.solution(num1Arr, num2Arr)) {
            System.out.print(i + " ");
        }
    }
}