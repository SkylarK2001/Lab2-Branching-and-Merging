public class Polymorphism {
    // TODO TASK 1: Fix the bugs in this code to pass PolymorphismTest.java

    /**
     * Returns the role.
     * @param p the person whose role is to be returned
     * @return the role of the person
     */
   public static void main(String[] args) {
        // TODO: right now for student, it is not returning the role to be student.
       args = Person;
       return args.role;
    }
}

class Person {
    public String role = "General";
    private String name;

    /*public Person(String name) {

        this.name = name;
    }*/

    public String getName() {

        return name;
    }
}

class Student extends Person {
    public final String role = "Student";
    private final String studentId;

    public Student(String name, String studentId) {
        super(name);
        this.studentId = studentId;
    }
}