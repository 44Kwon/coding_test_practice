import java.util.Scanner;


public class Main {
    public String solution(String str) {
        char[] charArr = str.toCharArray();

        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] < 'a') {
                charArr[i] = Character.toLowerCase(charArr[i]);
            } else {
                charArr[i] = Character.toUpperCase(charArr[i]);
            }
        }

        return String.valueOf(charArr);
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}