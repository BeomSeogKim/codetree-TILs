import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for(int i = 0; i < n; i++) {
            students[i] = new Student(sc.nextInt(), sc.nextInt(), i + 1);
        }
        Arrays.sort(students);

        for (int i = 0; i < n; i++ ){
            System.out.println(students[i]);
        }
    }
}

class Student implements Comparable<Student> {
    int height;
    int weight;
    int index;
    
    Student (int height, int weight, int index) {
        this.height = height;
        this.weight = weight;
        this.index = index;
    }
    @Override
    public int compareTo(Student student) {
        if (this.height == student.height) {
            return student.weight - this.weight;
        }
        return this.height - student.height;
    }

    @Override
    public String toString() {
        return this.height + " " + this.weight + " " + this.index;
    }
}