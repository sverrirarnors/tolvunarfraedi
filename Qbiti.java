public class Qbiti{
  private final double re;
  private final double im;
  private final boolean gildi;

  public Qbiti(double real, double imag){
    re = real;
    im = imag;
    gildi = StdRandom.bernoulli(re*re);
  }
  public boolean maela(){
    return gildi;
  }
  public static void main(String[] args) {
    double studlar = 1.0/Math.sqrt(2);
    Qbiti qbit = new Qbiti(studlar,studlar);
    StdOut.println(qbit.maela());
    StdOut.println(qbit.maela());
  }
}
