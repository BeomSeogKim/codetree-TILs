import java.util.Scanner;

public class Main {

    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    static int[][] grid;
    static boolean[][] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        grid = new int[size][size];
        visited = new boolean[size][size];

        for(int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++){
                grid[row][col] = sc.nextInt();
            }
        }

        int maxBlockCount = 0;
        int blockBoomCount = 0;
        for(int row = 0; row < size; row++) {
            for(int col = 0; col < size; col++) {
                if (!visited[row][col]) {
                    int blockSize = DFS(row, col, grid[row][col]);

                    if (blockSize >= 4) {
                        blockBoomCount++;
                        maxBlockCount = Math.max(blockSize, maxBlockCount);
                    }
                    
                }
            }
        }
        System.out.println(blockBoomCount + " " + maxBlockCount);
    }

    static int DFS(int row, int col, int number) {
        int size = grid.length;

        if (row < 0 || row >= size || col < 0 || col >= size || visited[row][col] || grid[row][col] != number) {
            return 0;
        }

        visited[row][col] = true;
        int blockCount = 1;

        for (int d = 0; d < 4; d++) {
            int nRow = row + dx[d];
            int nCol = col + dy[d];
            blockCount += DFS(nRow, nCol, number);
        }

        return blockCount;
    }
}