public class Ferningar{
  public static Boolean isSquare(int a){
    if (Math.sqrt(a)*Math.sqrt(a) == (int)(Math.sqrt(a)*Math.sqrt(a)))
      return true;
    else
      return false;
  }
  public static void main(String[] args) {
    int talan = (int)(Math.random()*(11))+10;
    boolean L1 = true;
    while (talan>0){
      if (L1) {
        StdOut.printf("Tala: %2d | Leikmaður 1: ", talan);
        int input = StdIn.readInt();
        if (isSquare(input) && input > 0 && input <= talan) {
          talan -=input;
          L1 = false;
        }
        else{
          StdOut.println("Haltu þig við reglurnar 😡");
        }
      }
    else{
      StdOut.printf("Tala: %2d | Leikmaður 2: ", talan);
      int input = StdIn.readInt();
      if (isSquare(input) && input > 0 && input <= talan) {
        talan -=input;
        L1 = true;
      }
      else{
        StdOut.println("Haltu þig við reglurnar 😡");
      }
    }
    }
    if (L1) {
      StdOut.println("Leikmaður 2 hefur sigrað! 🎉");
    }
    else {
      StdOut.println("Leikmaður 1 hefur sigrað! 🎉");
    }
  }
}
