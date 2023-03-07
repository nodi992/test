/*
Zdefiniuj klasę Point posiadającą dwa publiczne, ostateczne pola x, y. Napisz konstruktor ustawiający te wartości.
*/
public class Main {
    public static void main(String[] args) {
      Point p2 = new Point(2,4);
      Point p1 = new Point(3,5);
      System.out.println(p1.x);
      String s = String.format("%f", p1.x);
      Segment segment = new Segment(p1,p2);
      System.out.println("Dlugosc odcinka: " + segment.distance());
      String s1=segment.wys();
      System.out.println(s1);
      perpendicularSegment(segment,p1);
      System.out.println(segment.getP1().x);
        Polygon polygon = new Polygon(4);
        polygon.setPoint(0, new Point(50, 50));
        polygon.setPoint(1, new Point(150, 50));
        polygon.setPoint(2, new Point(150, 150));
        polygon.setPoint(3, new Point(50, 150));

        System.out.println(polygon.toSvg());

    }
    public static Segment perpendicularSegment(Segment segment, Point point) {
        double dx = segment.getP2().x - segment.getP1().x;
        double dy = segment.getP2().y - segment.getP1().y;
        if (dx == 0 && dy == 0) {
            // Segment degeneruje się do punktu, nie można skonstruować prostopadłego
            return null;
        }
        double length = segment.distance();
        double px = point.x;
        double py = point.y;
        double x1, y1, x2, y2;

        if (dx == 0) {
            // Segment jest pionowy, prostopadły musi być poziomy
            x1 = px - length/2;
            y1 = py;
            x2 = px + length/2;
            y2 = py;
        } else if (dy == 0) {
            // Segment jest poziomy, prostopadły musi być pionowy
            x1 = px;
            y1 = py - length/2;
            x2 = px;
            y2 = py + length/2;
        } else {
            // Segment skośny, obliczamy współczynniki prostopadłego
            double k = (double) dy / dx;
            double b = py - k * px;
            double d = length / Math.sqrt(1 + k * k);
            x1 = (double) Math.round(px - d / 2);
            y1 = (double) Math.round(k * x1 + b);
            x2 = (double) Math.round(px + d / 2);
            y2 = (double) Math.round(k * x2 + b);
        }
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        return new Segment(p1, p2);
    }
}