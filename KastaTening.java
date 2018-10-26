public class KastaTening{
  public static int kastaTening(){
    return (int)(Math.random()*6)+1;
  }
  public static void main(String[] args) {
    int N = 1000;
    double[] utkoma = new double[16];
    for (int i=0; i<N; i++){
      utkoma[(kastaTening()+kastaTening()+kastaTening())-3] +=1.0;
    }

    StdDraw.setYscale(0,200);
    StdStats.plotBars(utkoma);
  }
}
