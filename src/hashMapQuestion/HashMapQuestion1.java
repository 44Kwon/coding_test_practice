package hashMapQuestion;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


//어려움 꼭 다시풀어볼것. 방법은 아나 식 세우는게 어려움
public class HashMapQuestion1 {
    public String solution(int n, String str) {
        //str을 돌면서 없으면 새로 넣고, 있으면 +1을 한다.
        //마지막에 값들 중 가장 높은 값에 키값을 반환한다(공동은 없으므로)
        String answer = "";
        int max = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (Character c : str.toCharArray()) {
            hashMap.put(c,hashMap.getOrDefault(c,0)+1);
        }

        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                answer = String.valueOf(entry.getKey());
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        HashMapQuestion1 T = new HashMapQuestion1();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        String str = kb.next();

        System.out.println(T.solution(num, str));

//        for (int i : T.solution(num1, num2, num1Arr)) {
//            System.out.print(i + " ");
//        }
    }
}