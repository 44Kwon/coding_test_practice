import java.util.Scanner;

//꼭 다시 풀어보기 어려움!!!
//생각 다시 해보기
public class Main {
    public int[] solution(String s1, String s2) {
        int[] intArr = new int[s1.length()];
        //p를 1000으로 두는 이유
        int p = 1000;
        for (int i = 0; i < s1.length(); i++) {

            if (s1.charAt(i) == s2.charAt(0)) {
                p = 0;
                intArr[i] = p;
            } else {
                p++;
                intArr[i] = p;
            }
        }

        p = 1000;

        for (int i = s1.length()-1; i >= 0; i--) {

            if (s1.charAt(i) == s2.charAt(0)) {
                p = 0;
            } else {
                p++;
                intArr[i] = Math.min(p, intArr[i]);
            }
        }

        return intArr;

    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str1 = kb.next();
        String str2 = kb.next();

        for (int i : T.solution(str1,str2)) {
            System.out.print(i + " ");
        }
    }
}