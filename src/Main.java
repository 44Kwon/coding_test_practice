import java.util.*;



public class Main {

    public int solution(int n, int m, int[] arr) {
        return 0;
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

//        int[][] numArr1 = new int[num1][num1];
//        for (int i = 0; i < num1; i++) {
//            for (int j = 0; j < num1; j++) {
//                numArr1[i][j] = kb.nextInt();
//            }
//        }


        System.out.println(T.solution(num1,num2,numArr));

//        for (int i : T.solution(num1, new int[]{1, 2, 3})) {
//            System.out.print(i + " ");
//        }
    }
}