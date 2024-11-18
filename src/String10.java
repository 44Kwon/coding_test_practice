import java.util.Scanner;

//꼭 다시 풀어보기 어려움!!!
//생각 다시 해보기
public class String10 {
    public int[] solution(String s, char c) {
        int[] intArr = new int[s.length()];
        //p를 1000으로 두는 이유
        int p = 1000;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == c) {
                p = 0;
                intArr[i] = p;
            } else {
                p++;
                intArr[i] = p;
            }
        }

        p = 1000;

        for (int i = s.length()-1; i >= 0; i--) {

            if (s.charAt(i) == c) {
                p = 0;
            } else {
                p++;
                intArr[i] = Math.min(p, intArr[i]);
            }
        }

        return intArr;

    }

    public static void main(String[] args) {
        String10 T = new String10();
        Scanner kb = new Scanner(System.in);
        String str1 = kb.next();
        char c = kb.next().charAt(0);

        for (int i : T.solution(str1,c)) {
            System.out.print(i + " ");
        }
    }
}