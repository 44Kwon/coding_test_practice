package sortingAndSearching;

import java.util.HashMap;
import java.util.Scanner;


public class Sorting5 {
    public String solution(int n, int[] arr) {
        String answer = "U";

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i,0)+1);
            if(map.get(i) == 2) return "D";
        }

        return answer;
    }

    public static void main(String[] args) {
        Sorting5 T = new Sorting5();
        Scanner kb = new Scanner(System.in);
        int num1 = kb.nextInt();
//        int num2 = kb.nextInt();
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


        System.out.println(T.solution(num1,numArr));

//        for (int i : T.solution(num1, numArr)) {
//            System.out.print(i + " ");
//        }
    }
}