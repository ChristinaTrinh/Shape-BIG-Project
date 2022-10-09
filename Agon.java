//Each new create instance represents an "Agon" that implements the PolygonComparable interface
public abstract class Agon implements PolygonComparable {
    private double mySideLength;
    private double myArea;
    private final int MY_NUM_SIDES;

    public Agon() {
        MY_NUM_SIDES = 0;
        setMySideLength(0);
    }

    public Agon(int sides, double mySideLength) {
        MY_NUM_SIDES = sides;
        setMySideLength(mySideLength);
    }

    public void setMySideLength(double mySideLength) {
        this.mySideLength = mySideLength;
    }

    public double getMySideLength() {
        return mySideLength;
    }

    public double getMyArea() {
        calculateArea();
        return myArea;
    }

    public int getMY_NUM_SIDES() {
        return MY_NUM_SIDES;
    }

    public String getMyCategory() {
        return "Agon";
    }

    public void calculateArea() {
        myArea = 1.0 / 4 * MY_NUM_SIDES * Math.pow(mySideLength, 2) * (1.0 / Math.tan(Math.PI / MY_NUM_SIDES));
    }

    public int compareTo(PolygonComparable that) {
        if ((this.getMyArea() - that.getMyArea()) < 0)
            return -1;
        else if ((this.getMyArea() - that.getMyArea()) > 0)
            return 1;
        else
            return 0;
    }

    public String toString() {
        return "Agon and I am also a Polygon_Comparable";
    }
}
