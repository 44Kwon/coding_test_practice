package sortingAndSearching;

import java.util.Scanner;

//버블정렬
public class Sorting2 {
    public int[] solution(int num, int[] arr) {
        for (int i = 0; i < num-1; i++) {   // n-1턴인 이유 : 첫번째 인덱스는 자동으로 값이 결정되기 때문이다.
            for (int j = 0; j < num-i-1; j++) { // -i를 해주는 이유는 비교횟수가 -1씩 줄어들기 때문이다.
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Sorting2 T = new Sorting2();
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