public class Polygon {
    private Point[] pts;
    public Polygon(Point[] pts){
        this.pts=pts;
    }
    public String toSvg(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("polygon points=\"");
        for (Point point:pts){
            stringBuilder.append(point.x).append(",").append(point.y).append(" ");
        }
        stringBuilder.append("\" style=\"fill:none;stroke:black;stroke-width:1\"/>\n");
        return stringBuilder.toString();
    }

    public Polygon(Polygon src){
        this.pts = new Point[src.pts.length];
        for(int i =0;i<pts.length;i++) {
            this.pts[i] = new Point(src.pts[i].x, src.pts[i].y);
        }
    }
}
