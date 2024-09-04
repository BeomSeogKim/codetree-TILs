import java.util.Scanner;

public class Main {

    static int[][] grid;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int N, M;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        grid = new int[N][M];

        int maxDepth = 0; // 마을의 최대 높이 계산을 위해 사용

        // 입력 받기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                grid[i][j] = sc.nextInt();
                maxDepth = Math.max(maxDepth, grid[i][j]);
            }
        }

        int maxSafeZones = 0; // 최대 안전 영역의 수
        int minK = 1; // 최대 안전 영역을 만드는 최소의 K

        // 가능한 모든 강수량 K에 대해 반복
        for (int k = 1; k <= maxDepth; k++) {
            visited = new boolean[N][M]; // 매번 방문 배열을 새로 초기화
            int safeZoneCount = 0;

            // DFS를 사용하여 안전 영역 계산
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (grid[i][j] > k && !visited[i][j]) {
                        DFS(i, j, k);
                        safeZoneCount++;
                    }
                }
            }

            // 최대 안전 영역 수와 K 값 갱신
            if (safeZoneCount > maxSafeZones) {
                maxSafeZones = safeZoneCount;
                minK = k;
            } else if (safeZoneCount == maxSafeZones) {
                minK = Math.min(minK, k); // 안전 영역의 수가 같을 때 더 작은 K를 선택
            }
        }

        System.out.println(minK + " " + maxSafeZones);
    }

    static void DFS(int x, int y, int depth) {
        visited[x][y] = true;

        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];

            if (nx >= 0 && nx < N && ny >= 0 && ny < M) {
                if (grid[nx][ny] > depth && !visited[nx][ny]) {
                    DFS(nx, ny, depth);
                }
            }
        }
    }
}