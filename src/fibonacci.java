//조금 더 최적화된 피보나치
//어차피 썼던 값들 또 쓰기 때문에 배열에 넣어둔다.
//더 빠르게 => 메모리제이션 활용
//성능은 for문이 더 좋다. 재귀는 스택프레임이 엄청 생겨서 돌아가서...
public class fibonacci {

    static int[] fibo;

    public int DFS(int n) {
        if (fibo[n] > 0) return fibo[n];
        if (n == 1) return fibo[n] = 1;
        else if (n == 2) return fibo[n] = 1;
        else {
            return fibo[n] = DFS(n-2) + DFS(n-1);
        }
    }

    public static void main(String[] args) {
        fibonacci T = new fibonacci();
        int n = 48;
        fibo = new int [n+1]; //0번 인덱스는 안쓴다.
        T.DFS(n);
        for (int i = 1; i <= n; i++) {
            System.out.print(fibo[i] + " ");
        }
    }
}