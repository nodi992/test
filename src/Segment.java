public class Segment{
    private Point p1;
    private Point p2;

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }
    public Point getP2() {
        return p2;
    }
    public void setP1(Point p1) {
        this.p1 = p1;
    }
    public void setP2(Point p2) {
        this.p2 = p2;
    }
    public double distance(){
        return Math.sqrt(Math.pow(p1.x-p2.x,2)+Math.pow(p1.y-p2.y,2));
    }
    public String wys(){
        return String.format(" <circle x1=\"%f\" x2=\"%f\" y1=\"%f\" y2=\"%f\" stroke=\"black\" stroke-width=\"4\" fill=\"yellow\" />\n", p1.x,p2.x,p1.y,p2.y);
    }
}