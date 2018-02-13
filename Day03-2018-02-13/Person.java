public class Person {

    private String name;

    public Person() {
        System.out.println("A PERSON has been created");
    }

    public Person(String name) {
        this.name = name;
        System.out.println("A PERSON has been created: " + name);
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "PERSON toString() has been called: " + name;
    }



}










