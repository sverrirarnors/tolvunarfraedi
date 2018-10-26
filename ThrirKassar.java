public class ThrirKassar{
  public static int thrirKassar(int n){
    if (n==0) return 1;
    return 1 + thrirKassar(n-1);
  }
  public static void main(String[] args) {
    StdOut.println(thrirKassar(10));
  }
}
