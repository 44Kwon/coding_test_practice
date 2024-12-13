package hashMapQuestion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class HashMapQuestion3 {
    public ArrayList<Integer> solution(int num1, int num2, int[] numArr) {
        //num2를 기준으로 슬라이딩하면서 간다.
        //map에 값을 넣는다. 그리고 갯수를 구하고 그걸 list에 넣음. (초기화)
        //슬라이딩 진행하면서 추가, 맨 앞에것은 -1 만약 -1한 것이 0일때는 아예 삭제를 remove
        //그리고 이 size를 list에 add
        //마지막 list를 반환.
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        int p = 0;

        for (int i = 0; i < num2; i++) {
            map.put(numArr[i], map.getOrDefault(numArr[i],0)+1);
        }
        list.add(map.size());

        for (int i = num2; i < num1; i++) {
            map.put(numArr[i], map.getOrDefault(numArr[i],0)+1);
            map.put(numArr[p], map.get(numArr[p])-1);

            if (map.get(numArr[p]) == 0) map.remove(numArr[p]);
            p++;
            list.add(map.size());
        }

        return list;
    }

    public static void main(String[] args) {
        HashMapQuestion3 T = new HashMapQuestion3();
        Scanner kb = new Scanner(System.in);
        int num1 = kb.nextInt();
        int num2 = kb.nextInt();
        int[] numArr = new int[num1];
        for (int i = 0; i < num1; i++) {
            numArr[i] = kb.nextInt();
        }

//        System.out.println(T.solution(num1, num2, numArr));

        for (int i : T.solution(num1, num2, numArr)) {
            System.out.print(i + " ");
        }
    }
}