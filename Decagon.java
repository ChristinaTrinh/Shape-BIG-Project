//Each new create instance represents a Decagon that is also an "Agon"
public class Decagon extends Agon {
    public Decagon() {
        super();
    }

    public Decagon(double mySideLength) {
        super(10, mySideLength);
    }

    public String getMyType() {
        return "Decagon";
    }

    public String toString() {
        return "Decagon and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
