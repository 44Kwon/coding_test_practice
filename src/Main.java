import java.util.*;


//다시 풀어보기 못풀음!
public class Main {
    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
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

//        System.out.println(T.solution(num, numArr));

        for (int i : T.solution(num, numArr)) {
            System.out.print(i + " ");
        }
    }
}