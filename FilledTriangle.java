public class FilledTriangle{
  public static void filledTriangle(double x, double y, double h){
    double h2 = h/2.0;
    double sindot = h2*0.866;
    double[] xh = {x-h2,x,x+h2};
    double[] yh = {y-sindot,y+sindot,y-sindot};
    StdDraw.filledPolygon(xh,yh);
  }
  public static void main(String[] args) {
    filledTriangle(0.5,0.5,0.5);
  }
}
