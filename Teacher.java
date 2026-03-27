public class Teacher extends Person {

    String subject;

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    public void printInfo() {
        System.out.println("Mr/Ms " + name + " teaches " + subject + ".");
    }
}
