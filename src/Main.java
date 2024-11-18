import java.util.Scanner;


public class Main {
    public String solution(String s) {
        char[] charArray = s.toCharArray();
        String answer = "";
        for (int i = 0; i < charArray.length; i++) {
            int num = 0;
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] == charArray[j]) {
                    num++;
                }
            }
            if (num == 0) {
                answer += charArray[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}