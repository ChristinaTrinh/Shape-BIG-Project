//Each new create instance represents a Triangle that implements the PolygonComparable interface
public abstract class Triangle implements PolygonComparable {
    private double myBase;
    private double myHeight;
    private double myArea;

    public Triangle() {
        setMyBase(0.0);
        setMyHeight(0.0);
    }

    public Triangle(double myBase, double myHeight) {
        setMyBase(myBase);
        setMyHeight(myHeight);
    }

    public void setMyBase(double myBase) {
        this.myBase = myBase;
    }

    public void setMyHeight(double myHeight) {
        this.myHeight = myHeight;
    }

    public void setMyArea(double myArea) {
        this.myArea = myArea;
    }

    public double getMyBase() {
        return myBase;
    }

    public double getMyHeight() {
        return myHeight;
    }

    public double getMyArea() {
        calculateArea();
        return myArea;
    }

    public String getMyCategory() {
        return "Triangle";
    }

    public void calculateArea() {
        myArea = 0.5 * myBase * myHeight;
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
        return "Triangle and I am also a Polygon_Comparable.";
    }
}
