package sortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;


//결정알고리즘, 많이 어려움
public class Searching10 {

    //배치한 말의 마리 수를 리턴
    public int count(int dist, int[] arr) {
        int cnt = 1;
        int ep = arr[0];    //마지막 배치한 배치위치

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - ep >= dist) {
                cnt++;
                ep = arr[i];
            }
        }

        return cnt;
    }

    public int solution(int n, int m, int[] arr) {
        // 가장 가까운 두 말의 거리가 최대가 되는 최대값을 출력
        // 가장 가까운 두 말의 거리는 1, 가장 먼거는 마지막 인덱스 - 처음 인덱스
        int answer = 0;
        Arrays.sort(arr);
        int lt = 1, rt = arr[n-1] - arr[0];

        while (lt <= rt) {
            //이것으로 m개의 말이 배치가 되는지. 배치가 된다면 어떻게할지, 안되면 어떻게할지.
            int mid = (lt + rt) / 2; // 가장 가까운 두 말의 거리를 이거로 두고 배치한다는 것.
            if (count(mid,arr) >= m) {  //답이 유효하다
                answer = mid;
                lt = mid+1;
            } else {    //답이 유효하지 않다. 너무 넓어서 다 배치불가
                rt = mid-1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Searching10 T = new Searching10();
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