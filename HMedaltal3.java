public class HMedaltal3{
  public static void main(String[] args) {
    double[] a = new double[3];
    a[0] = StdIn.readDouble();
    a[1] = StdIn.readDouble();
    a[2] = StdIn.readDouble();
    StdOut.println((a[0]+a[1]+a[2])/3);
    while (!StdIn.isEmpty()) {
      a[0] = a[1];
      a[1] = a[2];
      a[2] = StdIn.readDouble();
      StdOut.println((a[0]+a[1]+a[2])/3);
    }
  }
}
