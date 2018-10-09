public class FilterOut{
  public static void main(String[] args) {
    double a = Double.parseDouble(args[0]);
    double b = Double.parseDouble(args[1]);

    while (!StdIn.isEmpty()){
      double value = StdIn.readDouble();
      if ((value < a) || (value > b)) {
        StdOut.println(value);
      }
    }
  }
}
