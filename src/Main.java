public class Main extends Segment {
    public Main(Point point1, Point point2) {
        super(point1, point2);
    }

    public static void main(String[] args) {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(2, 3);
        Segment segment = new Segment(point1, point2);
        System.out.println(segment.toSvg());
        Point[] pointsArray = {new Point(50, 50), new Point(50, 20), new Point(100, 20),new Point(100, 50)};
        Polygon polygon = new Polygon(pointsArray);
        System.out.println(polygon.toSvg());
        Polygon polygon2 = new Polygon(polygon);
        System.out.println(polygon2.toSvg());
    }
}