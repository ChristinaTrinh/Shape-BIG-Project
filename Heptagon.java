//Each new create instance represents a Heptagon that is also an "Agon"
public class Heptagon extends Agon {
    public Heptagon() {
        super();
    }

    public Heptagon(double mySideLength) {
        super(7, mySideLength);
    }

    public String getMyType() {
        return "Heptagon";
    }

    public String toString() {
        return "Heptagon and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
