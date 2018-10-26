public class KastaGodumTening{
  public static int kastaTening(){
    double[] w = {0.05,0.125,0.125,0.125,0.125,0.45};
    return (StdRandom.discrete(w)+1);
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
