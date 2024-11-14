import java.util.Scanner;


public class String2 {
    public String solution(String str) {
        char[] charArr = str.toCharArray();

        for (int i = 0; i < charArr.length; i++) {
            if (Character.isLowerCase(charArr[i])) charArr[i] = Character.toUpperCase(charArr[i]);
            else charArr[i] = Character.toLowerCase(charArr[i]) ;
//            if (charArr[i] < 'a') {
//                charArr[i] = Character.toLowerCase(charArr[i]);
//            } else {
//                charArr[i] = Character.toUpperCase(charArr[i]);
//            }
        }

        return String.valueOf(charArr);
    }

    public static void main(String[] args) {
        String2 T = new String2();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}