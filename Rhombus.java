//Each new create instance represents a Rhombus that is also a Quadrilateral
public class Rhombus extends Quadrilateral {
    public Rhombus() {
        super();
    }

    public Rhombus(double myBase1, double myHeight) {
        super(myBase1, 0, myHeight);
    }

    public String getMyType() {
        return "Rhombus";
    }

    public String toString() {
        return "Rhombus and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
