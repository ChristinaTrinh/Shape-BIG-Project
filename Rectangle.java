//Each new create instance represents a Rectangle that is also a Quadrilateral
public class Rectangle extends Quadrilateral {
    public Rectangle() {
        super();
    }

    public Rectangle(double myBase1, double myHeight) {
        super(myBase1, 0, myHeight);
    }

    public String getMyType() {
        return "Rectangle";
    }

    public String toString() {
        return "Rectangle and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
