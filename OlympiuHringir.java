public class OlympiuHringir{
  public static void main(String[] args) {
    StdDraw.setCanvasSize(600,300);
    StdDraw.setXscale(0,12);
    StdDraw.setYscale(0,6);
    StdDraw.setPenRadius(0.025);

    //Fyrsta lína
    StdDraw.setPenColor(0,132,164);
    StdDraw.circle(2,4,1.7);

    StdDraw.setPenColor(StdDraw.BLACK);
    StdDraw.circle(6,4,1.7);

    StdDraw.setPenColor(StdDraw.RED);
    StdDraw.circle(10,4,1.7);

    //Önnur lína
    StdDraw.setPenColor(255,175,0);
    StdDraw.circle(4,2,1.7);

    StdDraw.setPenColor(0,145,51);
    StdDraw.circle(8,2,1.7);
  }
}
