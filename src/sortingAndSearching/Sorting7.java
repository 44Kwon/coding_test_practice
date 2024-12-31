package sortingAndSearching;

import java.util.ArrayList;
import java.util.Scanner;

//어려움. comparable 구현하여 CompareTo 재정의하여 정렬(좌표정렬)
class Point implements Comparable<Point>{
    public int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if (this.x == o.x) return this.y - o.y;
        else return this.x - o.x;
    }
}

//좌표 정렬
public class Sorting7 {
    public ArrayList<Point> solution(int n, ArrayList<Point> list) {
//        list.sort(null);
//        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {
        Sorting7 T = new Sorting7();
        Scanner kb = new Scanner(System.in);
        int num1 = kb.nextInt();
        ArrayList<Point> points = new ArrayList<Point>();

//        int[][] numArr = new int[num1][2];
        for (int i = 0; i < num1; i++) {
            points.add(new Point(kb.nextInt(), kb.nextInt()));
        }

//        int[][] numArr1 = new int[num1][num1];
//        for (int i = 0; i < num1; i++) {
//            for (int j = 0; j < num1; j++) {
//                numArr1[i][j] = kb.nextInt();
//            }
//        }
//        int num2 = kb.nextInt();
//        int[] numArr2 = new int[num2];
//        for (int i = 0; i < num2; i++) {
//            numArr2[i] = kb.nextInt();
//        }


//        System.out.println(T.solution(num1,numArr));

        for (Point p : T.solution(num1, points)) {
            System.out.println(p.x + " " + p.y);
        }
    }
}