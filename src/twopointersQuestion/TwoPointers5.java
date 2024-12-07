package twopointersQuestion;

import java.util.Scanner;


//어려움 꼭 다시풀어볼것. 방법은 아나 식 세우는게 어려움
public class TwoPointers5 {
    public int solution(int n) {
        //n을 2로 나눈값 몫 더하기 1 까지만 하면 된다.(그걸 넘어가면 n을 넘어감)
//        int sum=0,answer=0,lt=1;
//        for (int rt = 1; rt <= n/2+1; rt++) {
//            sum+=rt;
//            if (sum == n) answer++;
//            while(sum >= n) {
//                sum -= lt++;
//                if (sum == n) answer++;
//            }
//        }
//        return answer;

        //수학적으로 풀어보기
        int answer =0, cnt=1;
        n--;
        while (n > 0) {
            cnt++;
            n = n-cnt;
            if(n%cnt==0) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        TwoPointers5 T = new TwoPointers5();
        Scanner kb = new Scanner(System.in);
        int num1 = kb.nextInt();
//        int[] num1Arr = new int[num1];
//        int num2 = kb.nextInt();
//        for (int i = 0; i < num1; i++) {
//            num1Arr[i] = kb.nextInt();
//        }


        System.out.println(T.solution(num1));

//        for (int i : T.solution(num1, num2, num1Arr)) {
//            System.out.print(i + " ");
//        }
    }
}