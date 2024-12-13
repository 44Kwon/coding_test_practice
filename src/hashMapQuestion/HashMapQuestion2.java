package hashMapQuestion;

import java.util.HashMap;
import java.util.Scanner;


//map에 하나 넣고 하나씩 빼면서 0이면 통과되게. for문을 줄일 수 있음.
//길이가 같다는 가정하에 어차피 전부가 0인걸 증명할 필요도 없다.
//왜냐하면 -1할때 비교 문자에 다른게 껴있거나 0일때는 바로 NO로 종료시키는 검증이 있으면 되기 때문이다.
//다시풀어보기
public class HashMapQuestion2 {
    public String solution(String str1, String str2) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char c : str1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c,0)+1);
        }
        for (char c : str2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c,0)+1);
        }

        if (!(map1.size() == map2.size())) return "NO";

        for (Character c : map1.keySet()) {
            if (map2.containsKey(c)) {
                if (map1.get(c) != map2.get(c)) return "NO";
            } else {
                return "NO";
            }
        }

        return "YES";
    }

    public static void main(String[] args) {
        HashMapQuestion2 T = new HashMapQuestion2();
        Scanner kb = new Scanner(System.in);
        String str1 = kb.next();
        String str2 = kb.next();

        System.out.println(T.solution(str1, str2));

//        for (int i : T.solution(num1, num2, num1Arr)) {
//            System.out.print(i + " ");
//        }
    }
}