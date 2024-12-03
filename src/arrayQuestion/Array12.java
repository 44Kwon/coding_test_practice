package arrayQuestion;

import java.util.Scanner;


//11번 12번 다시 풀어보기 for문 논리적으로 설계하는것의 중요성
public class Array12 {
    public int solution(int M, int N, int[][] arr) {
        //배열의 행은 테스트를 0 ~ M-1회
        //배열의 열은 등수를 나타냄 0 ~ n-1등
        int answer = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i == j) continue;
                int count = 0;
                for (int k = 0; k < M; k++) {
                    int a=0,b=0;
                    for (int l = 0; l < N; l++) {
                        if (arr[k][l] == i) {
                            a = l;
                        }
                        if (arr[k][l] == j) {
                            b = l;
                        }
                    }
                    if (a < b) count++;
                }
                if (count == M) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Array12 T = new Array12();
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int M = kb.nextInt();
        int[][] numArr = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                numArr[i][j] = kb.nextInt();
            }
        }

        System.out.println(T.solution(M, N, numArr));

//        for (int i : T.solution(num, numArr)) {
//            System.out.print(i + " ");
//        }
    }
}