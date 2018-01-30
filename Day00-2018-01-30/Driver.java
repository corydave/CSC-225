public class Driver {
    public static void main (String[] args) {

        Circle c1 = new Circle();
        c1.setRadius(10);

        Circle c2 = new Circle();
        c2.setRadius(100);

        Circle c3 = new Circle();

        Circle c4 = new Circle(1000);


        System.out.println("radius of c1: " + c1.getRadius());
        System.out.println("radius of c2: " + c2.getRadius());
        System.out.println("radius of c3: " + c3.getRadius());
        System.out.println("radius of c4: " + c4.getRadius());

    //    System.out.println(c4.getClass());

        Rectangle r1 = new Rectangle();

        Rectangle r2 = new Rectangle(10, 2);

        System.out.println("length of r1 = " + r1.getLength() + "\nwidth of r1 = " + r1.getWidth());
        System.out.println("length of r2 = " + r2.getLength() + "\nwidth of r2 = " + r2.getWidth());

        Square s1 = new Square(14);
        System.out.println("side of s1 = " + s1.getSide());

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println(s1);



    }
}




















