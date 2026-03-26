public class Student {
  String name;
  double[] grades;
  int numGrades;
  int gradeCount;

  public Student(String name, int numGrades) {
    this.name = name;
    this.numGrades = numGrades;
    this.grades = new double[numGrades];
    gradeCount = 0;
  }

  public void addGrade(double grade) {
    this.grades[gradeCount] = grade;
    gradeCount++;
  }

  public double calculateAverage() {
    double total = 0.0;
    for (int i = 0; i < grades.length; i++) {
      total = total + grades[i];
    }
    double average = total / grades.length;
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
