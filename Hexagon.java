//Each new create instance represents a Hexagon that is also an "Agon"
public class Hexagon extends Agon {
    public Hexagon() {
        super();
    }

    public Hexagon(double mySideLength) {
        super(6, mySideLength);
    }

    public String getMyType() {
        return "Hexagon";
    }

    public String toString() {
        return "Hexagon and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
