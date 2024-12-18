package stackAndQueueQuestion;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


public class StackQuestion3 {
    public int solution(int n1, int[][] arr1, int n2, int[] arr2) {
        //arr2 배열을 돌면서 해당 위치의 arr1 열의 값들을 행의 순서로 돈다
        //만약 그 행의 값이 있다면 해당 값을 스택에 쌓고 해당 행열 값을 0으로 바꾼다.
        //만약 끝까지 가도 없다면 pass
        //스택에 값을 쌓을때는 해당 값이 stack.peek()와 같은지 확인 같다면 pop하고 answer에 +2를 해준다.
        //answer를 return
        Deque<Integer> stack = new ArrayDeque<>();
        int answer = 0;
        for (int i : arr2) {
            i = i-1;
            for (int j = 0; j < n1; j++) {
                if (arr1[j][i] != 0) {
                    if (!stack.isEmpty() && stack.peek() == arr1[j][i]) {
                        answer += 2;
                        stack.pop();
                    } else {
                        stack.push(arr1[j][i]);
                    }
                    arr1[j][i] = 0;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        StackQuestion3 T = new StackQuestion3();
        Scanner kb = new Scanner(System.in);
        int num1 = kb.nextInt();
        int[][] numArr1 = new int[num1][num1];
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num1; j++) {
                numArr1[i][j] = kb.nextInt();
            }
        }
        int num2 = kb.nextInt();
        int[] numArr2 = new int[num2];
        for (int i = 0; i < num2; i++) {
            numArr2[i] = kb.nextInt();
        }


        System.out.println(T.solution(num1, numArr1, num2, numArr2));

//        for (int i : T.solution(num1, num2, numArr)) {
//            System.out.print(i + " ");
//        }
    }
}