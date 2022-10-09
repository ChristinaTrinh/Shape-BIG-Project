//Each new create instance represents a Nonagon that is also an "Agon"
public class Nonagon extends Agon {
    public Nonagon() {
        super();
    }

    public Nonagon(double mySideLength) {
        super(9, mySideLength);
    }

    public String getMyType() {
        return "Nonagon";
    }

    public String toString() {
        return "Nonagon and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
