import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for(int i = 0; i < n; i++) {
            students[i] = new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(students);

        for (int i = 0; i < n; i++){
            System.out.println(students[i]);
        }
    }
}

class Student implements Comparable<Student> {
    String name;
    int kor;
    int eng;
    int math;

    public Student(String name, int kor, int eng, int math){
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    @Override
    public int compareTo(Student student){
        if (this.kor == student.kor) {
            if(this.eng == student.eng) {
                return student.math - this.math;
            }
            return student.eng - this.eng;
        }
        return student.kor - this.kor;
    }

    @Override 
    public String toString(){
        return this.name + " " + this.kor + " " + this.eng + " " + this.math;
    }
}