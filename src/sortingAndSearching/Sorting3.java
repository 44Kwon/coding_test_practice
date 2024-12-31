package sortingAndSearching;

import java.util.Scanner;

//삽입정렬
public class Sorting3 {
    public int[] solution(int num, int[] arr) {
        //삽입정렬은 어떤것인가
        //arr[i]값을 비교하면서 arr[j]값이 더 크다면 이동 j+1에다가 arr값을 넣는다
        //arr j값이 더 작은 경우 break 하고 삽입, or 0까지 다돌면 삽입
        for (int i = 1; i < num; i++) {
            int tmp = arr[i],j;
            for (j = i-1; j >= 0; j--) {
                if (tmp > arr[j]) {
                    break;
                } else {
                    arr[j+1] = arr[j];
                }
            }
            arr[j+1] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Sorting3 T = new Sorting3();
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