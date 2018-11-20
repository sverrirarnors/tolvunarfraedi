public class Skeidklukka{
  public static void main(String[] args) {
    Stopwatch timer1 = new Stopwatch();
    int total1 = 0;
    for (int i=0; i<100000000; i++) {
      total1+= i;
    }
    double timi1 = timer1.elapsedTime();
    StdOut.println(timi1);

    Stopwatch timer2 = new Stopwatch();
    double total2 = 0;
    for (double i=0; i<100000000; i++) {
      total2+= i;
    }
    double timi2 = timer2.elapsedTime();
    StdOut.println(timi2);
  }
}
