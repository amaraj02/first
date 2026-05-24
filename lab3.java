import java.util.*;
interface LibraryHelper {
    void checkBooks();
}

abstract class Student {
    String name;
    int marks;

    Student(String n, int m) {
        name = n;
        marks = m;
    }

    void attendClass() {
        System.out.println(name + " attending class");
    }

    int gradeCalculator() {
        return marks / 25;
    }

    abstract void display();
}

class StudentCEIV extends Student implements LibraryHelper {

    StudentCEIV(String n, int m) {
        super(n, m);
    }

    public void checkBooks() {
        System.out.println("Books checked");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
      
        StudentCEIV s = new StudentCEIV( "Amaraj", 85);

        s.display();
        s.attendClass();
        s.checkBooks();

        System.out.println("Grade: " + s.gradeCalculator());
    }
}