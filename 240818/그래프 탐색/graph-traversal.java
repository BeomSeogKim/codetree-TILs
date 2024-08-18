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
        visited = new boolean[N];
        graph = new boolean[N][N];

        for(int i = 0; i < M; i++){
            int row = sc.nextInt() - 1;
            int col = sc.nextInt() - 1;

            graph[row][col] = true;
            graph[col][row] = true;
        }
        DFS(0);
        System.out.println(countOfNearVertex);
    }

    public static void DFS(int curV) {
        for (int i = 0; i < N; i++) {
            if (!visited[curV] && graph[curV][i]){
                countOfNearVertex++;
                visited[i] = true;
                DFS(i);
            }
        }
    }
}