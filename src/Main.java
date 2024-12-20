import java.util.*;


class Person {
    int id;
    int priority;

    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}

//Person 객체를 만들어서 비교하면서.... 풀어보기 큐문제 8번 (응급실) , 스택문제 5번과 더불어 어려움
public class Main {
    public int solution(int num1, int num2, int[] arr) {

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
//        int num2 = kb.nextInt();
//        int[] numArr2 = new int[num2];
//        for (int i = 0; i < num2; i++) {
//            numArr2[i] = kb.nextInt();
//        }


        System.out.println(T.solution(num1,num2,numArr));

//        for (int i : T.solution(num1, num2, numArr)) {
//            System.out.print(i + " ");
//        }
    }
}