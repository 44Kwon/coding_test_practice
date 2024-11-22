import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int ok = 0;
        for (int i : arr) {
            String s = new StringBuilder(""+i).reverse().toString();
            int num = Integer.parseInt(s);
            for (int j = 2; j <= Math.sqrt(num); j++) {
                ok = 1;
                if (num % j == 0) {
                    ok = 0;
                    break;
                }
            }
            if (ok == 1) list.add(num);
        }

        return list;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int[] numArr = new int[num];
        for (int i = 0; i < num; i++) {
            numArr[i] = kb.nextInt();
        }

        for (int i : T.solution(num, numArr)) {
            System.out.print(i + " ");
        }
    }
}