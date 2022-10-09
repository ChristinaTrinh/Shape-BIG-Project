//This is the PolygonComparable inface that extends the Comparable interface to compare the polygons
public interface PolygonComparable extends Comparable<PolygonComparable> {
    public void calculateArea();

    public double getMyArea();

    public String getMyType();

    public String getMyCategory();

    public int compareTo(PolygonComparable that);
}