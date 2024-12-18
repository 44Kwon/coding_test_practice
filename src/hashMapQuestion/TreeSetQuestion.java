package hashMapQuestion;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;


//Treeset문제 잘 모르겠음
public class TreeSetQuestion {
    public int solution(int num1, int num2, int[] arr) {
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < num1; i++) {
            for (int j = i+1; j < num1; j++) {
                for (int k = j+1; k < num1; k++) {
                    set.add(arr[i]+arr[j]+arr[k]);
                }
            }
        }

        int cnt = 0;
        for (int i : set) {
            cnt++;
            if (cnt == num2) return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        TreeSetQuestion T = new TreeSetQuestion();
        Scanner kb = new Scanner(System.in);
        int num1 = kb.nextInt();
        int num2 = kb.nextInt();
        int[] numArr = new int[num1];
        for (int i = 0; i < num1; i++) {
            numArr[i] = kb.nextInt();
        }


        System.out.println(T.solution(num1, num2, numArr));

//        for (int i : T.solution(num1, num2, numArr)) {
//            System.out.print(i + " ");
//        }
    }
}