package hashMapQuestion;

import java.util.HashMap;
import java.util.Scanner;


//어려움 다시풀어볼것
public class HashMapQuestion4 {
    public int solution(String str1, String str2) {
        int answer = 0;
        int lt = 0;
        HashMap<Character, Integer> map2 = new HashMap<>();
        HashMap<Character, Integer> map1 = new HashMap<>();
        for (Character c : str2.toCharArray()) {
            map2.put(c,map2.getOrDefault(c,0)+1);
        }

        for (int i = 0; i < str2.length(); i++) {
            map1.put(str1.charAt(i),map1.getOrDefault(str1.charAt(i),0)+1);
        }

        if (map1.equals(map2)) answer++;

        for (int i = str2.length(); i < str1.length(); i++) {
            map1.put(str1.charAt(i),map1.getOrDefault(str1.charAt(i),0)+1);
            map1.put(str1.charAt(lt), map1.get(str1.charAt(lt)) -1);
            if (map1.get(str1.charAt(lt)) == 0) map1.remove(str1.charAt(lt));
            if (map1.equals(map2)) answer++;
            lt++;
        }

        return answer;
    }

    public static void main(String[] args) {
        HashMapQuestion4 T = new HashMapQuestion4();
        Scanner kb = new Scanner(System.in);
        String str1 = kb.next();
        String str2 = kb.next();


        System.out.println(T.solution(str1, str2));

//        for (int i : T.solution(num1, num2, numArr)) {
//            System.out.print(i + " ");
//        }
    }
}