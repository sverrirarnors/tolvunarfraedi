public class Cesaro{
  public static void cesaro(int n, double step, Turtle turtle){
    if (n==0) {
      turtle.goForward(step);
      return;
    }

    cesaro(n-1,step,turtle);
    turtle.turnLeft(89);
    cesaro(n-1,step,turtle);
    turtle.turnLeft(182);
    cesaro(n-1,step,turtle);
    turtle.turnLeft(89);
    cesaro(n-1,step,turtle);
  }
  public static void main(String[] args) {
    StdDraw.setCanvasSize(800,800);
    StdDraw.setXscale(-0.01,1.01);
    StdDraw.setYscale(-0.01,1.01);
    int n = Integer.parseInt(args[0]);
    double step = 1.0 / Math.pow(2.045,n);
    Turtle turtle = new Turtle(0.0,0.0,0.0);
    cesaro(n, step, turtle);
    turtle.turnLeft(90);
    cesaro(n, step, turtle);
    turtle.turnLeft(90);
    cesaro(n, step, turtle);
    turtle.turnLeft(90);
    cesaro(n, step, turtle);
  }
}
