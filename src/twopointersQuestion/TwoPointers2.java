package twopointersQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class TwoPointers2 {
    public ArrayList<Integer> solution(int n, int m, int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        ArrayList<Integer> list = new ArrayList<>();
        int p1 = 0, p2=0;
        while (p1 < n && p2 < m) {
            if (arr1[p1] < arr2[p2]) {
                p1++;
            } else if (arr1[p1] > arr2[p2]) {
                p2++;
            } else {
                list.add(arr1[p1]);
                p1++;
                p2++;
            }
        }
        return list;

    }

    public static void main(String[] args) {
        TwoPointers2 T = new TwoPointers2();
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

        for (int i : T.solution(num1,num2,num1Arr, num2Arr)) {
            System.out.print(i + " ");
        }
    }
}