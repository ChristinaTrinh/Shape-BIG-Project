//Each new create instance represents a Dodecagon that is also an "Agon"
public class Dodecagon extends Agon {
    public Dodecagon() {
        super();
    }

    public Dodecagon(double mySideLength) {
        super(11, mySideLength);
    }

    public String getMyType() {
        return "Dodecagon";
    }

    public String toString() {
        return "Dodecagon and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
