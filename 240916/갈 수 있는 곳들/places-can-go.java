import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {

    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    static int[][] grid;
    static boolean[][] visited; 
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        int k = sc.nextInt();
        
        grid = new int[n][n];
        visited = new boolean[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                grid[i][j] = sc.nextInt();
            }
        }


        for (int i = 0; i < k; i++){
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            visited[x][y] = true;
            BFS(x,y);
        }

        int vCount = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(visited[i][j]) vCount++;
            }
        }
        System.out.println(vCount);
    }

    static void BFS(int row, int col){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{row, col});

        while (!queue.isEmpty()) {
            int[] info = queue.poll();
            int x = info[0];
            int y = info[1];

            for(int d = 0; d < 4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];
                if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
                    if (grid[nx][ny] == 0 && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        queue.offer(new int[]{nx,ny});
                    }
                }
            }
        }
    }
}