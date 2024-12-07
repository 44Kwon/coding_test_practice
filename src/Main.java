import java.util.*;


//슬라이딩 윈도우 문제 다시한번 생각해볼것
public class Main {
    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        for (int i = 0; i < m; i++) {
            answer += arr[i];
        }
        int slide = answer;

        for (int i = m; i < n; i++) {
            slide = slide + arr[i] - arr[i-m];
            answer = Math.max(answer, slide);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
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