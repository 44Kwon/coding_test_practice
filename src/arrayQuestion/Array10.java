package arrayQuestion;

import java.util.Scanner;


//문제보며 푸는 방법 떠올리기, 내가 한 방법과 풀이가 다름
public class Array10 {
    public int solution(int n, int[][] arr) {
        int answer = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - 1; j++) {
                int temp = arr[i][j];
                if (temp > arr[i-1][j] && temp > arr[i][j-1]
                && temp > arr[i+1][j] && temp > arr[i][j+1]) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Array10 T = new Array10();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int[][] numArr = new int[num+2][num+2];
        for (int i = 1; i < num+1; i++) {
            for (int j = 1; j < num+1; j++) {
                numArr[i][j] = kb.nextInt();
            }
        }

        System.out.println(T.solution(num, numArr));

//        for (int i : T.solution(num, numArr)) {
//            System.out.print(i + " ");
//        }
    }
}