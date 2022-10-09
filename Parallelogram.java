//Each new create instance represents a Parallelogram that is also a Quadrilateral
public class Parallelogram extends Quadrilateral {
    public Parallelogram() {
        super();
    }

    public Parallelogram(double myBase1, double myHeight) {
        super(myBase1, 0, myHeight);
    }

    public String getMyType() {
        return "Parallelogram";
    }

    public String toString() {
        return "Parallelogram and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
