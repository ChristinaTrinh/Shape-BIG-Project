//Each new create instance represents a Round shape that is implements the PolygonComparable interface
public abstract class Round implements PolygonComparable {
    private double myRadius1;
    private double myArea;

    public Round() {
        setMyRadius1(0);
    }

    public Round(double myRadius1) {
        setMyRadius1(myRadius1);
    }

    public void setMyRadius1(double myRadius1) {
        this.myRadius1 = myRadius1;
    }

    public void setMyArea(double myArea) {
        this.myArea = myArea;
    }

    public double getMyRadius1() {
        return myRadius1;
    }

    public double getMyArea() {
        calculateArea();
        return myArea;
    }

    public String getMyCategory() {
        return "Rounds";
    }

    public void calculateArea() {
        myArea = Math.PI * Math.pow(myRadius1, 2);
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
        return "Round and I am also a Polygon_Comparable.";
    }
}
