public class Polygon {
    private Point[] points;

    public Polygon(int ile) {
        this.points = new Point[ile];
    }

    public void setPoint(int index, Point point) {
        if (index >= 0 && index < points.length) {
            points[index] = new Point(point.x, point.y);
        }
    }

    public void setPoints(Point[] points) {
        this.points = new Point[points.length];
        for (int i = 0; i < points.length; i++) {
            this.points[i] = new Point(points[i].x, points[i].y);
        }
    }

    public String toSvg() {
        StringBuilder svg = new StringBuilder("<svg xmlns=\"http://www.w3.org/2000/svg\" version=\"1.1\">\n<polygon points=\"");

        for (Point p : points) {
            svg.append(p.x).append(",").append(p.y).append(" ");
        }

        svg.append("\" stroke=\"black\" stroke-width=\"3\" fill=\"none\" />\n</svg>");
        return svg.toString();

    }
}