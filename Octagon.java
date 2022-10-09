//Each new create instance represents an Octagon that is also an "Agon"
public class Octagon extends Agon {
    public Octagon() {
        super();
    }

    public Octagon(double mySideLength) {
        super(8, mySideLength);
    }

    public String getMyType() {
        return "Octagon";
    }

    public String toString() {
        return "Octagon and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
