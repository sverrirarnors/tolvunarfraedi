public class Random{
  public static void main(String[] args) {
    double n = Math.random();
    int count = 0;
    while (n<0.9) {
      System.out.println(n);
      n = Math.random();
      count++;
    }
    System.out.println("Forritið keyrði "+ count + " sinnum");
  }
}
