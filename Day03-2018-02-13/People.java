public class People {
    public static void main (String[] args) {

        Person p1 = new Person("Dave");
        System.out.println();
        Student s1 = new Student("Ferris Bueller");

        System.out.println();
        System.out.println();

        System.out.println(p1.toString());
        System.out.println(s1.toString());

        System.out.println();
        System.out.println();

        Person s2 = new Student("Bart Simpson");
        System.out.println(s2.toString());
        System.out.println(s2.toString());

        ((Student)s2).foo();











    }
}
