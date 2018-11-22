public class Skeidklukka{
  public static void main(String[] args) {
    int T = (int)Math.pow(10,9);
    double gildi = Math.random();

    Stopwatch timer = new Stopwatch();
    for (int i=0; i<T; i++) {
      gildi = Math.sin(gildi);
    }
    double timi = timer.elapsedTime();
    double timiper = timi/T;
    double timipernano = timiper*Math.pow(10,9);
    StdOut.println("Tími í nanósekúndum er: " + timipernano);
  }
}
