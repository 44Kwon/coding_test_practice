package arrayQuestion;

import java.util.ArrayList;
import java.util.Scanner;


//문제 어려움 꼭 다시 풀어볼것!!!
public class Array6 {
    public boolean isPrime(int num) {

        if (num == 1) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i : arr) {
            int reverse = 0;
            while (i >0) {
                int balance = i % 10;
                reverse = reverse * 10 + balance;
                i = i / 10;
            }
            if (isPrime(reverse)) {
                list.add(reverse);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        Array6 T = new Array6();
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