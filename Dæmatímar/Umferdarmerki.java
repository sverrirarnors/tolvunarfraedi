public class Umferdarmerki{
  public static void main(String[] args) {
    StdDraw.setCanvasSize(300,300);
    StdDraw.setXscale(0,10);
    StdDraw.setYscale(0,10);

    StdDraw.setPenColor(StdDraw.RED);
    StdDraw.filledCircle(5,5,4);

    StdDraw.setPenColor(StdDraw.YELLOW);
    StdDraw.filledRectangle(5,5,3,0.6);
  }
}
