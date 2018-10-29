public class Printnum{
  public static void printnum(int n){
    if (n==0) return;
    StdOut.println(n);
    printnum(n-1);
  }
  public static void printnumOfugt(int n){
    if (n==0) return;
    printnumOfugt(n-1);
    StdOut.println(n);
  }
  public static void main(String[] args) {
    printnum(10);
    StdOut.println();
    printnumOfugt(10);
  }
}
