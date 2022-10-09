//Each new create instance represents a Isosceles that is also a Triangle
public class Isosceles extends Triangle {
    public Isosceles() {
        super();
    }

    public Isosceles(double myBase, double myHeight) {
        super(myBase, myHeight);
    }

    public String getMyType() {
        return "Isoscelese";
    }

    public String toString() {
        return "Isoscelese and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
