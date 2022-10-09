//Each new create instance represents a Trapezium that is also a Quadrilateral
public class Trapezium extends Quadrilateral {
    public Trapezium() {
        super();
    }

    public Trapezium(double myBase1, double myBase2, double myHeight) {
        super(myBase1, myBase2, myHeight);
    }

    public void calculateArea() {
        setMyArea((this.getMyBase1() + this.getMyBase2()) * this.getMyHeight() / 2);
    }

    public String getMyType() {
        return "Trapezium";
    }

    public String toString() {
        return "Trapezium and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
