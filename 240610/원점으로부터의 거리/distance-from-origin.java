import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Point[] points = new Point[n];
        for (int i = 0; i < n; i++) {
            points[i] = new Point(sc.nextInt(), sc.nextInt(), i + 1);
        }
        Arrays.sort(points);
        for(int i = 0; i < n; i++ ){
            System.out.println(points[i].getIndex());
        }
    }
}

class Point implements Comparable<Point> {
    int x;
    int y; 
    int index;

    Point(int x, int y, int index) {
        this.x = x;
        this.y = y;
        this.index = index;
    }

    int getX() {
        return this.x;
    }

    int getY() {
        return this.y;
    }

    int getIndex() {
        return this.index;
    }

    @Override
    public int compareTo(Point point) {
        return (Math.abs(this.x) + Math.abs(this.y)) - (Math.abs(point.getX()) + Math.abs(point.getY()));
    }

}