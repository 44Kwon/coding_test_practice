package sortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;


//이분검색 알고리즘
public class Searching8 {
    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        //이분검색
        int lt = 0, rt = n-1;

        while(lt <= rt) {
            int mid = (lt+rt)/2;
            if (arr[mid] == m) {
                answer = mid+1;
                break;
            } else if (arr[mid] > m) {
                rt = mid-1;
            } else {
                lt = mid+1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Searching8 T = new Searching8();
        Scanner kb = new Scanner(System.in);
        int num1 = kb.nextInt();
        int num2 = kb.nextInt();

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


        System.out.println(T.solution(num1,num2,numArr));

//        for (int i : T.solution(num1, new int[]{1, 2, 3})) {
//            System.out.print(i + " ");
//        }
    }
}