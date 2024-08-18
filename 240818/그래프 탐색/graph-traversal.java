import java.util.Scanner;

public class Main {

    private static int countOfNearVertex = 0;
    private static int N;
    private static boolean[] visited;
    private static boolean[][] graph;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int M = sc.nextInt();
        visited = new boolean[N + 1];
        graph = new boolean[N + 1][N + 1];

        for(int i = 0; i < M; i++){
            int row = sc.nextInt();
            int col = sc.nextInt();

            graph[row][col] = true;
            graph[col][row] = true;
        }
        visited[1] = true;
        DFS(1);
        System.out.println(countOfNearVertex);
    }

    public static void DFS(int curV) {
        for (int i = 0; i <= N; i++) {
            if (!visited[i] && graph[curV][i]){
                countOfNearVertex++;
                visited[i] = true;
                DFS(i);
            }
        }
    }
}