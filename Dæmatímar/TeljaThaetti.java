public class TeljaThaetti{
  public static int teljaThaetti(int n){
    int thaettir = 1;
    for (int i=n; i>1; i--) {
      if (n%i==0) {
        thaettir++;
      }
    }
    return thaettir;
  }
  public static void main(String[] args) {
    StdOut.println(teljaThaetti(10));
    StdOut.println(teljaThaetti(5));
    StdOut.println(teljaThaetti(1));
  }
}
