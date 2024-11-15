import java.util.Scanner;


public class String3 {
    public String solution(String str) {
        String[] arr = str.split(" ");
        int length = 0;
        String answer = "";
        for (String s : arr) {
            if (s.length() > length) {
                length = s.length();
                answer = s;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String3 T = new String3();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.print(T.solution(str));
    }
}