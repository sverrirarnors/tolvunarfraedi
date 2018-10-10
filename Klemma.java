public class Klemma{
  public static void main(String[] args) {
    double lo = Double.parseDouble(args[0]);
    double hi = Double.parseDouble(args[1]);
    while (!StdIn.isEmpty()){
      double value = StdIn.readDouble();
      if (value < lo) StdOut.println(lo);
      else if (value > hi) StdOut.println(hi);
      else StdOut.println(value);
    }
  }
}
