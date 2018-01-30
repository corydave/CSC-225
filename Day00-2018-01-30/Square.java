public class Square extends Rectangle {

    private int side;


    // CONSTRUCTORS
    // Default Constructor
    public Square() {
        side = 0;
    }

    public Square(int side) {
        this.side = side;
    }
    // End Constructors

    // ACCESSSORS and MUTATORS
    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }
    // End ACCESSORS and MUTATORS

    // Override Object's method 'toString()'
    public String toString() {
        return "The side of the square is " + side;
    }

}





