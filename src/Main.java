import java.util.*;



//어려움 꼭 다시풀어볼것. 방법은 아나 식 세우는게 어려움
public class Main {
    public int solution(int n,int m, int[] arr) {
        return 0;
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


        System.out.println(T.solution(num1,num2,num1Arr));

//        for (int i : T.solution(num1, num2, num1Arr)) {
//            System.out.print(i + " ");
//        }
    }
}