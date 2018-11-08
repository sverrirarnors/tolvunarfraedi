public class SpegilfylkiRec{
  public static boolean prec(int[] a, int i, int j){
    if (i==j || i+1==j) {
      return true;
    }
    else if (a[i]==a[j]) {
      return prec(a,i+1,j-1);
    }
    else if (a[i] != a[j]) {
      return false;
    }
    return true;
  }
  public static void main(String[] args) {
    int[] a = {0,1,2,3,3,2,1,0};
    int[] b = {0,1,2,3,3,3,2,1,0};
    int[] c = {1,2,3,4,5,6};
    StdOut.println(prec(a,0,a.length-1));
    StdOut.println(prec(b,0,b.length-1));
    StdOut.println(prec(c,0,c.length-1));
  }
}
