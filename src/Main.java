import java.util.Scanner;


public class Main {
    public String solution(String s) {
        char[] charArr = s.toCharArray();
        int start = 0;
        int end = charArr.length-1;

        while (start < end) {
            if (Character.isAlphabetic(charArr[start]) && Character.isAlphabetic(charArr[end])) {
                char a = charArr[end];
                charArr[end] = charArr[start];
                charArr[start] = a;
            }
            start++;
            end--;
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