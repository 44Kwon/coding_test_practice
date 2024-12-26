package sortingAndSearching;

import java.util.Scanner;

//선택정렬
public class Sorting1 {
    public int[] solution(int num, int[] arr) {


        for (int i = 0; i < arr.length-1; i++) {
            int idx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[idx] > arr[j]) idx = j;
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }

        return arr;
    }

    public static void main(String[] args) {
        Sorting1 T = new Sorting1();
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


//        System.out.println(T.solution(num1,num2,numArr));

        for (int i : T.solution(num1, numArr)) {
            System.out.print(i + " ");
        }
    }
}