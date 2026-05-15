public class Polymorphism {

    /**
     * Returns the role.
     * @param p the person whose role is to be returned
     * @return the role of the person
     */
   public static String getRole(Person p) {
       if (p == null) {
           return "Unknown";
       }

       return p.getRole();
}

class Person {
    public String role = "General";
    private String name;

    public Person(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public String getRole() {
        return role;
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