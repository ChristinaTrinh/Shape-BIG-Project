//Each new create instance represents a Quadrilateral that implements the PolygonComparable interface
public abstract class Quadrilateral implements PolygonComparable {
    private double myBase1;
    private double myBase2;
    private double myHeight;
    private double myArea;

    public Quadrilateral() {
        setMyBase1(0);
        setMyBase2(0);
        setMyHeight(0);
    }

    public Quadrilateral(double myBase1, double myBase2, double myHeight) {
        setMyBase1(myBase1);
        setMyBase2(myBase2);
        setMyHeight(myHeight);
    }

    public void setMyBase1(double myBase1) {
        this.myBase1 = myBase1;
    }

    public void setMyBase2(double myBase2) {
        this.myBase2 = myBase2;
    }

    public void setMyHeight(double myHeight) {
        this.myHeight = myHeight;
    }

    public void setMyArea(double myArea) {
        this.myArea = myArea;
    }

    public double getMyBase1() {
        return myBase1;
    }

    public double getMyBase2() {
        return myBase2;
    }

    public double getMyHeight() {
        return myHeight;
    }

    public double getMyArea() {
        calculateArea();
        return myArea;
    }

    public String getMyCategory() {
        return "Quadrilaterals";
    }

    public void calculateArea() {
        myArea = myBase1 * myHeight;
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
        return "Quadrilateral and I am also a Polygon_Comparable.";
    }
}