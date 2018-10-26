public class Fibonacci{
  public static String FibOrdRec(int n){
    if (n==0) return "b";
    if (n==1) return "a";
    return FibOrdRec(n-1) + FibOrdRec(n-2);
  }
  public static String FibOrd(int n){
    String[] f = new String[n+1];
    f[0] = "b";
    f[1] = "a";
    for (int i=2; i<=n; i++) {
      f[i] = f[i-1] + f[i-2];
    }
    return f[n];
  }
  public static void main(String[] args) {
    StdOut.println(FibOrdRec(5) + "\n" + FibOrd(5));
  }
}
