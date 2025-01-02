package sortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;


//결정알고리즘, 어려움
public class Searching9 {

    public int count(int[] arr, int capacity) {
        int cnt = 1, sum = 0;
        for (int x : arr) {
            if(sum+x > capacity) {
                cnt++;
                sum=x;
            } else {
                sum += x;
            }
        }

        return cnt;
    }

    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while(lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(arr, mid) <= m) {
                answer = mid;
                rt = mid-1;
            } else {
                lt = mid+1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Searching9 T = new Searching9();
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