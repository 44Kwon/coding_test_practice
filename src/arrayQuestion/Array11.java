package arrayQuestion;

import java.util.Scanner;


//11번 12번 다시 풀어보기 for문 논리적으로 설계하는것의 중요성
public class Array11 {
    public int solution(int n, int[][] arr) {
        //첫번째 for문 i : 학생
        //두번째 for문 j : 비교 학생
        //세번째 for문 k : 학년
        int answer = 0;
        int max = 0;
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= 5; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        count++;
                        break;
                    }
                }
            }
            if (max < count) {
                max = count;
                answer = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Array11 T = new Array11();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int[][] numArr = new int[num+1][6];
        for (int i = 1; i < num+1; i++) {
            for (int j = 1; j < 6; j++) {
                numArr[i][j] = kb.nextInt();
            }
        }

        System.out.println(T.solution(num, numArr));

//        for (int i : T.solution(num, numArr)) {
//            System.out.print(i + " ");
//        }
    }
}