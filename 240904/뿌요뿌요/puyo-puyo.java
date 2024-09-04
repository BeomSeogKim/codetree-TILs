import java.util.Scanner;

public class Main {

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static int[][] grid;
    static boolean[][] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        grid = new int[size][size];
        visited = new boolean[size][size];

        // 입력 받기
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                grid[row][col] = sc.nextInt();
            }
        }

        int maxBlockCount = 0;  // 최대 블록 크기
        int blockBoomCount = 0; // 터지는 블록의 수

        // 모든 칸에 대해 블록 탐색
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (!visited[row][col]) {
                    int blockSize = DFS(row, col, grid[row][col]);

                    if (blockSize >= 4) {
                        blockBoomCount++;  // 터지는 블록의 수 증가
                        maxBlockCount = Math.max(maxBlockCount, blockSize);  // 최대 블록 크기 갱신
                    }
                }
            }
        }

        // 최종 결과 출력
        System.out.println(blockBoomCount + " " + maxBlockCount);
    }

    // DFS로 연결된 블록의 크기를 구하는 함수
    static int DFS(int row, int col, int number) {
        int size = grid.length;

        // 기저 조건: 격자 범위를 벗어나거나, 이미 방문했거나, 다른 숫자인 경우
        if (row < 0 || row >= size || col < 0 || col >= size || visited[row][col] || grid[row][col] != number) {
            return 0;
        }

        visited[row][col] = true;  // 현재 칸 방문 처리
        int blockSize = 1;  // 현재 칸을 포함한 블록의 크기 초기화

        // 인접한 네 방향에 대해 DFS 수행
        for (int d = 0; d < 4; d++) {
            int nRow = row + dx[d];
            int nCol = col + dy[d];
            blockSize += DFS(nRow, nCol, number);
        }

        return blockSize;
    }
}