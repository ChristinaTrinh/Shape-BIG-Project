//Each new create instance represents a Pentagon that is also an "Agon"
public class Pentagon extends Agon {
    public Pentagon() {
        super();
    }

    public Pentagon(double mySideLength) {
        super(5, mySideLength);
    }

    public String getMyType() {
        return "Pentagon";
    }

    public String toString() {
        return "Pentagon I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
