public class Student extends Person {

    private String mNumber;

    public Student() {
        System.out.println("...and a STUDENT has been created");
    }

    public Student(String name) {
//        this.name = name;
        super(name);
        System.out.println("...and a STUDENT has been created " + name);
    }

    public String toString() {
        return "STUDENT toSring has been called.";
    }

    public void foo() {
        System.out.println("Student FOO!!!!!");
    }


}





















