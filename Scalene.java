//Each new create instance represents a Scalene that is also a Triangle
public class Scalene extends Triangle {
    public Scalene() {
        super();
    }

    public Scalene(double myBase, double myHeight) {
        super(myBase, myHeight);
    }

    public String getMyType() {
        return "Scalene";
    }

    public String toString() {
        return "Scalene and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
