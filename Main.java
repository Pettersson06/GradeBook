import java.util.Scanner; 
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Student> students = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    System.out.println("How many Students do you want to enter?");
    int numStudents = scanner.nextInt();
    for (int i = 0; i < numStudents; i++) {
      System.out.println("What's the students name?");
      String name = scanner.next();
      System.out.println("How many grades do you have?");
      int grades = scanner.nextInt();
      Student student = new Student(name);
      for (int j = 0; j < grades; j++) {
        System.out.println("Enter a grade!"); 
        student.addGrade(scanner.nextDouble());
      }
      students.add(student);
    }
    for (Student student : students) {
      student.printResult();
    }
  }
  scanner.close();
}
