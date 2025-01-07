package sortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;


//결정알고리즘 10번문제 내가 주석달며 푼거
public class Searching10_2 {
    //리턴 값은 들어가는 말의 갯수이다.
    public int count(int[] arr, int mid) {
        //mid 값이 가장 가까운 두말 사이의 거리임을 기억!
        int s = arr[0];
        int sum = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - s >= mid) {    //두 말 사이의 거리가 mid보다 크거나 같을 때 말을 배치해야 한다.!!
                sum++;
                s = arr[i];
            }
        }
        return sum;
    }

    public int solution(int n, int m, int[] arr) {
        //m마리의 말을 n개의 마구간에 배치
        //배치했을 때 가장 가까운 두말의 거리가 최대가 되는 최댓값을 출력
        int answer = 0;
        Arrays.sort(arr);
        int lt = 1, rt = arr[n-1];

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            //mid를 가장 가까운 두말의 거리라는 가정을 하고 점점 답에 가깝게...
            if (count(arr, mid) >= m) {  // 이 의미는 말의 갯수가 m마리를 포함하거나 넘어서므로 최댓값이 아닐뿐 만족은 한다는 것이다.
                                        //즉 mid 값을 더 키워야 한다.
                answer = mid;
                lt = mid + 1;
            } else {    //이 의미는 말의 갯수가 m보다 작게 배치되므로 만족X, 즉 mid값이 더 작아야한다.
                rt = mid-1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Searching10_2 T = new Searching10_2();
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