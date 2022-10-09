//Each new create instance represents a Circle that is also a Round shape
public class Circle extends Round {
    public Circle() {
        super();
    }

    public Circle(double myRadius1) {
        super(myRadius1);
    }

    public String getMyType() {
        return "Circle";
    }

    public String toString() {
        return "Circle and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
