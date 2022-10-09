//Each new create instance represents a Square that is also a Quadrilateral
public class Square extends Quadrilateral {
    public Square() {
        super();
    }

    public Square(double myBase1, double myHeight) {
        super(myBase1, 0, myHeight);
    }

    public String getMyType() {
        return "Square";
    }

    public String toString() {
        return "Square and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
