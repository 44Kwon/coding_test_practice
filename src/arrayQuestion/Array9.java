package arrayQuestion;

import java.util.Scanner;


//다시 풀어보기
public class Array9 {
    public int solution(int n, int[][] arr) {
        int max = 0;
        int sum_x = 0;
        int sum_y = 0;
        int sum_xy = 0;
        int sum_x_y = 0;

        for (int i = 0; i < n; i++) {
            sum_xy += arr[i][i];
            sum_x_y += arr[i][n-i-1];
            for (int j = 0; j < n; j++) {
                sum_x += arr[i][j];
                sum_y += arr[j][i];
            }
            max = Math.max(max, sum_x);
            max = Math.max(max, sum_y);

            sum_x = 0;
            sum_y = 0;
        }

        max = Math.max(max, sum_xy);
        max = Math.max(max, sum_x_y);

        return max;
    }

    public static void main(String[] args) {
        Array9 T = new Array9();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int[][] numArr = new int[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                numArr[i][j] = kb.nextInt();
            }
        }

        System.out.println(T.solution(num, numArr));

//        for (int i : T.solution(num, numArr)) {
//            System.out.print(i + " ");
//        }
    }
}