public class Polygon {
    private Point[] points;

    public Polygon(int ile) {
        this.points = new Point[ile];
    }

    public void setVertex(int index, Point point) {
        if (index >= 0 && index < points.length) {
            points[index] = new Point(point.x, point.y);
        }
    }

    public void setVertices(Point[] points) {
        this.points = new Point[points.length];
        for (int i = 0; i < points.length; i++) {
            this.points[i] = new Point(points[i].x, points[i].y);
        }
    }

    public String toSvg() {
        StringBuilder svgBuilder = new StringBuilder();
        svgBuilder.append("<svg xmlns='http://www.w3.org/2000/svg' viewBox='0 0 100 100'>\n");
        svgBuilder.append("<polygon points='");
        for (int i = 0; i < points.length; i++) {
            Point point = points[i];
            svgBuilder.append(point.x).append(",").append(point.y).append(" ");
        }
        svgBuilder.append("' />\n");
        svgBuilder.append("</svg>");
        return svgBuilder.toString();

    }
}