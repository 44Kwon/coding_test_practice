package twopointersQuestion;

import java.util.Scanner;


//어려움 꼭 다시풀어볼것. 방법은 아나 식 세우는게 어려움
//투포인터 복합문제
public class TwoPointers4 {
    public int solution(int n, int m, int[] arr) {
        int lt=0;
        int answer = 0;
        int sum = 0;
        //합이 적을때는 rt를 옮기면서 더해감(기본)
        //합이 같다면 lt, rt 둘다 옮김
        //합이 많다면 lt를 옮기며 뺌
        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if (sum == m) {
                answer++;
            }
            while(sum >= m) {
                sum -= arr[lt];
                lt++;
                if (sum == m) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        TwoPointers4 T = new TwoPointers4();
        Scanner kb = new Scanner(System.in);
        int num1 = kb.nextInt();
        int[] num1Arr = new int[num1];
        int num2 = kb.nextInt();
        for (int i = 0; i < num1; i++) {
            num1Arr[i] = kb.nextInt();
        }


        System.out.println(T.solution(num1,num2, num1Arr));

//        for (int i : T.solution(num1, num2, num1Arr)) {
//            System.out.print(i + " ");
//        }
    }
}