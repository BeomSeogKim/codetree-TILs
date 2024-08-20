import java.util.Scanner;

public class Main {

    static int[] dx = {1,0};
    static int[] dy = {0,-1};
    static int[][] grid;
    static boolean[][] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowSize = sc.nextInt();
        int colSize = sc.nextInt();
        
        // initialize
        grid = new int[rowSize][colSize];
        visited = new boolean[rowSize][colSize];
        
        for(int row = 0; row < rowSize; row++) {
            for(int col = 0; col < colSize; col++) {
                grid[row][col] = sc.nextInt();
            }
        }
        visited[0][0] = true;
        DFS(0,0);
        
        if (visited[rowSize - 1][colSize - 1]) {
            System.out.println(1);
        }
        
        System.out.println(0);
    }

    static void DFS(int row, int col) {
        
        for(int d = 0; d < 2; d++) {
            int nRow = row + dx[d];
            int nCol = col + dy[d];
            if(nRow >= 0 && nRow < visited.length && nCol >= 0 && nCol < visited[0].length && !visited[nRow][nCol]) {
                visited[nRow][nCol] = true;
                DFS(nRow,nCol);
            }
        }
    }
}