public class TolustafurNr{
  public static int TolustafurNr(int a, int i){
    int result = 0;
    for (int j=0; j<=i; j++) {
      result = a%10;
      a /= 10;
    }
    return result;
  }
  public static void main(String[] args) {
    for (int i=0; i<6; i++) {
      StdOut.println(TolustafurNr(12345,i));
    }
  }
}
