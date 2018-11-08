public class Spegilfylki{
  public static boolean palin(int[] a){
    int N = a.length;
    for (int i=0; i<N/2; i++) {
      if (a[i] != a[N-i-1]) {
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args) {
    int[] a = {0,1,2,3,3,2,1,0};
    int[] b = {0,1,2,3,3,3,2,1,0};
    int[] c = {1,2,3,4,5,6};
    StdOut.println(palin(a));
    StdOut.println(palin(b));
    StdOut.println(palin(c));
  }
}
