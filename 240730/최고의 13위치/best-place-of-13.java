import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] board = new int[N][N];

        for(int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int maxCount = 0;
        for(int row = 0; row < N; row++){
            for(int col = 0; col < N - 2; col++){
                maxCount = Math.max(maxCount, board[row][col] + board[row][col + 1] + board[row][col + 2]);
            }
        }

        System.out.println(maxCount);
    }
}