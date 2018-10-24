public class Trmean{
  public static  double trmean(double[] a){
    double summa = 0;
    for (int i=0; i<a.length; i++) {
      summa += a[i];
    }
    summa -= StdStats.min(a) + StdStats.max(a);
    return summa/(a.length-2);
  }
  public static void main(String[] args) {
    double[] rand = new double[10];
    for (int i=0; i<rand.length; i++) {
      rand[i] = Math.random()*10;
    }
    StdArrayIO.print(rand);
    StdOut.println(trmean(rand));
  }
}
