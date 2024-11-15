import java.util.Scanner;


public class String4 {
    public String[] solution(String[] strArr, int num) {
        for (int i = 0; i < num; i++) {
            StringBuilder sb = new StringBuilder(strArr[i]);
            strArr[i] = sb.reverse().toString();
        }

        return strArr;
    }

    public static void main(String[] args) {
        String4 T = new String4();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        String[] strArr = new String[num];
        for (int i = 0; i < num; i++) {
            strArr[i] = kb.next();
        }
        for (String s : T.solution(strArr, num)) {
            System.out.println(s);
        }
    }
}