import java.util.*;

public class Main {
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    static int[][] grid;
    static boolean[][] visited;
    static int n;
    static int m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        grid = new int[n][m];
        visited = new boolean[n][m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        BFS();
        if(visited[n-1][m-1]) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }

    private static void BFS() {
        Queue<Position> queue = new LinkedList<>();
        queue.add(new Position(0,0));
        visited[0][0] = true;

        while(!queue.isEmpty()) {
            Position position = queue.poll();
            for(int d = 0; d < 4; d++) {
                int newX = position.x + dx[d];
                int newY = position.y + dy[d];

                if (newX >=0 && newX < n && newY >= 0 && newY < m) {
                    if (grid[newX][newY] == 1 && !visited[newX][newY]) {
                        queue.add(new Position(newX, newY));
                        visited[newX][newY] = true;
                    }
                }
            }
        }
    };
}

class Position {
    int x;
    int y;

    Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
}