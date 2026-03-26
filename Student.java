import java.util.ArrayList;

public class Student {
  String name;
  ArrayList<Double> grades = new ArrayList<>();

  public Student(String name) {
    this.name = name;
    this.grades = new ArrayList<>();
  }

  public void addGrade(double grade) {
    grades.add(grade);
  }

  public double calculateAverage() {
    double total = 0.0;
    for (int i = 0; i < grades.size(); i++) {
      total = total + grades.get(i);
    }
    double average = total / grades.size();
    return average;
  }

  public void printResult() {
    double average = calculateAverage();
    System.out.println(name + " has an average of " + average + "!");
    if (average < 4.5) {
      System.out.println("You passed the class!");
    } else if (average > 4.5) {
      System.out.println("You failed the class!");
    } else {
      System.out.println("The teachers need to discuss if you pass the class or not!");
    }
  }
}
