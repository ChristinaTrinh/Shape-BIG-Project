//Each new create instance represents a SemiCircle that is also a Round shape
public class SemiCircle extends Round {
    public SemiCircle() {
        super();
    }

    public SemiCircle(double myRadius1) {
        super(myRadius1);
    }

    public void calculateArea() {
        setMyArea(super.getMyArea() / 2);
    }

    public String getMyType() {
        return "SemiCircle";
    }

    public String toString() {
        return "SemiCircle and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
