////Each new create instance represents an Ellipse that is also a Round shape
public class Ellipse extends Round {
    private double myRadius2;

    public Ellipse() {
        super();
    }

    public Ellipse(double myRadius1, double myRadius2) {
        super(myRadius1);
        this.myRadius2 = myRadius2;
    }

    public void calculateArea() {
        setMyArea(Math.PI * this.getMyRadius1() * this.myRadius2);
    }

    public String getMyType() {
        return "Ellipse";
    }

    public String toString() {
        return "Ellipse and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
