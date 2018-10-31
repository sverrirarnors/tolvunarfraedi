import java.awt.event.KeyEvent;
public class BrotamyndAuka{
  public static int rand255(){
    return (int)(Math.random()*255 + 1);
  }
  public static void draw(int n, double x, double y, double r){
    if (n==0) {
      StdDraw.setPenColor(rand255(),rand255(),rand255());
      StdDraw.filledSquare(x,y,r);
      return;
    }
    double ratio = 2.0/3.0;

    draw(n-1, x, (y+r*ratio), r*1/3); //Uppi
    draw(n-1, x, (y-r*ratio), r*1/3); //Niðri
    draw(n-1, x, y, r*1/3); //Miðja
    draw(n-1, x+r*ratio, y, r*1/3); //Hægri
    draw(n-1, x-r*ratio, y, r*1/3); //Vinstri

  }
  public static void main(String[] args) {
    int n = 0;
    double x = 0.5, y = 0.5;
    double r = 0.4;
    draw(n, x, y, r);
    while (true) {
      StdDraw.enableDoubleBuffering();
      if (StdDraw.isKeyPressed(KeyEvent.VK_UP)) {
        StdDraw.clear();
        draw(++n, x, y, r);
        StdDraw.show();
      }
      if (StdDraw.isKeyPressed(KeyEvent.VK_DOWN) && n>=1) {
        StdDraw.clear();
        draw(--n, x, y, r);
        StdDraw.show();
      }
      StdDraw.pause(100);
    }
  }
}
