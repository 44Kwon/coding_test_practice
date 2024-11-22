import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public int solution(int n, int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int maxNum = 0;
        int answer = 0;
        for (int i : arr) {
            if (maxNum < i) {
                answer++;
                maxNum = i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int[] numArr = new int[num];
        for (int i = 0; i < num; i++) {
            numArr[i] = kb.nextInt();
        }

        System.out.println(T.solution(num,numArr));
//        for (int i : T.solution(num, numArr)) {
//            System.out.print(i + " ");
//        }
    }
}