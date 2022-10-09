//Each new create instance represents a Equilateral that is also a Triangle
public class Equilateral extends Triangle {
    public Equilateral() {
        super();
    }

    public Equilateral(double myBase, double myHeight) {
        super(myBase, myHeight);
    }

    public void calculateArea() {
        setMyArea((Math.sqrt(3) / 4) * (Math.pow(this.getMyBase(), 2)));
    }

    public String getMyType() {
        return "Equilateral";
    }

    public String toString() {
        return "Equilateral and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
