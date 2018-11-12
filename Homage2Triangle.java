import java.awt.Color;
public class Homage2Triangle{
  public static Color randColor(){
    int r = (int)(Math.random()*255 + 1);
    int g = (int)(Math.random()*255 + 1);
    int b = (int)(Math.random()*255 + 1);
    return new Color(r,g,b);
  }
  public static void filledTriangle(double x, double y, double h){
    double h2 = h/2.0;
    double sindot = h2*0.866;
    double[] xh = {x-h2,x,x+h2};
    double[] yh = {y-sindot,y+sindot,y-sindot};
    StdDraw.filledPolygon(xh,yh);
  }
  public static void main(String[] args) {
    int N = StdRandom.uniform(3,5);
    double x = 0.5, y= 0.5, h= 0.8, m=0.9;
    StdDraw.setCanvasSize(800,800);
    StdDraw.clear(randColor());
    for (int i=0; i<N; i++) {
      StdDraw.setPenColor(randColor());
      filledTriangle(x,y-0.047*(i+1), h*Math.pow(0.7,i));
    }

  }
}
