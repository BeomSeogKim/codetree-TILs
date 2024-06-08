import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++){
            students[i] = new Student(sc.nextInt(), sc.nextInt(), i + 1);
        }

        Arrays.sort(students);
        for(int i = 0; i < n; i++) {
            System.out.println(students[i]);
        }
    }
}

class Student implements Comparable<Student> {
    int height;
    int weight;
    int index;

    Student(int height, int weight, int index) {
        this.height = height; 
        this.weight = weight;
        this.index = index;
    }

    @Override 
    public int compareTo(Student student) {
        if (this.height != student.height) {
            return student.height - this.height;
        }
        if (this.weight != student.weight) {
            return student.weight - this.weight;
        }
        return this.index - student.index;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb.append(this.height).append(" ")
                .append(this.weight).append(" ")
                .append(this.index).toString();
    }
}