import java.util.Scanner;


public class Main {
    public String solution(String s) {
        char[] charArr = s.toCharArray();
        int lt = 0;
        int rt = charArr.length-1;

        while (lt < rt) {
            if (!Character.isAlphabetic(charArr[lt])) lt++;
            else if (!Character.isAlphabetic(charArr[rt])) rt--;
            else {
                char tmp = charArr[rt];
                charArr[rt] = charArr[lt];
                charArr[lt] = tmp;
                lt++;
                rt--;
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