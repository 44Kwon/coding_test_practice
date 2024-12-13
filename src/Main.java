import java.util.*;


//Treeset문제 잘 모르겠음
public class Main {
    public int solution(int num1, int num2, int[] arr) {
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());

        return 1;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int num1 = kb.nextInt();
        int num2 = kb.nextInt();
        int[] numArr = new int[num1];
        for (int i = 0; i < num1; i++) {
            numArr[i] = kb.nextInt();
        }


        System.out.println(T.solution(num1, num2, numArr));

//        for (int i : T.solution(num1, num2, numArr)) {
//            System.out.print(i + " ");
//        }
    }
}