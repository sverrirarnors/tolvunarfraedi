public class Mork{
  public static void main(String[] args) {
    double x = Double.parseDouble(args[0]);
    if ((x >= 0) && (x<=10))
      System.out.println("Innan marka");
    else
      System.out.println("Utan marka");
  }
}
