public class Main {
  public static void main(String[] args) {
    Student student1 = new Student("Korbinian Ludwig", 3);
    student1.addGrade(1.5);
    student1.addGrade(3.0);
    student1.addGrade(4.5);
    student1.printResult();

    Student student2 = new Student("Jarno Köninger", 2);
    student2.addGrade(6);
    student2.addGrade(3);
    student2.printResult();
  }
}
