import java.util.Scanner;
import java.util.Objects;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class Main {
    
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    static int[][] grid;
    static boolean[][] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        List<Integer> peoples = new ArrayList<>();
        
        // initialize 
        grid = new int[size][size];
        visited = new boolean[size][size];

        for (int row = 0; row < size; row++){
            for(int col = 0; col < size; col++){
                grid[row][col] = sc.nextInt();
            }
        }

        for(int row = 0; row < size; row++) {
            for(int col = 0; col < size; col++) {
                if (grid[row][col] == 1 && !visited[row][col]) {
                    visited[row][col] = true;
                    int neighbor = DFS(row, col);
                    peoples.add(neighbor);
                }
            }
        }

        Collections.sort(peoples);
        
        System.out.println(peoples.size());
        for(Integer neighbor : peoples){
            System.out.println(neighbor);
        }

    }

    static int DFS(int row, int col){

        for(int d = 0; d < 4; d++){
            int newRow = row + dx[d];
            int newCol = col + dy[d];
            int size = grid.length;
            if (newRow >= 0 && newRow < size && newCol >= 0 && newCol < size ) {
                if (grid[newRow][newCol] == 1 && !visited[newRow][newCol]) {
                    visited[newRow][newCol] = true;
                    return DFS(newRow, newCol) + 1;
                }
            }
        }
        return 1;
    }
}