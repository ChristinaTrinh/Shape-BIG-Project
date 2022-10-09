//Each new create instance represents a Trapezoid that is also a Quadrilateral
public class Trapezoid extends Quadrilateral {
    public Trapezoid() {
        super();
    }

    public Trapezoid(double myBase1, double myBase2, double myHeight) {
        super(myBase1, myBase2, myHeight);
    }

    public void calculateArea() {
        setMyArea((this.getMyBase1() + this.getMyBase2()) * this.getMyHeight() / 2);
    }

    public String getMyType() {
        return "Trapezoid";
    }

    public String toString() {
        return "Trapezoid and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
