public class Circle {

    private double radius;

    // CONSTRUCTORS

    // Default donstructor
    public Circle() {
        radius = 0.0;
    }

    public Circle(double rad) {
        radius = rad;
    }
    // End CONSTRUCTORS


    // ACCESSORS and MUTATORS (also known as GETTERS and SETTERS)
    public void setRadius(double rad) {
        radius = rad;
    }

    public double getRadius() {
        return radius;
    }
    // End of ACCESSORS and MUTATORS



}
