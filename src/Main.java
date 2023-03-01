/*
Zdefiniuj klasę Point posiadającą dwa publiczne, ostateczne pola x, y. Napisz konstruktor ustawiający te wartości.
*/
public class Main {
    public static void main(String[] args) {
      Point point = new Point(2,4);
      System.out.println(point.x);
      String s = String.format("%f", point.x);
    }
}