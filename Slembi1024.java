public class Slembi1024{
  public static int slembi1024(int r){
    return (23*r + 5)%1024;
  }
  public static void main(String[] args) {
    int N = 1024;
    boolean[] a = new boolean[N];
    int r = 0;
    a[0]=true;
    int count = 1;
    for (int i=1; i<N; i++) {
      r = slembi1024(r);
      if (r==0 || a[r]) {
        break;
      }
      count++;
      a[r]=true;
    }

    if (count==N) {
      StdOut.println("Slembitölufallið hefur fulla lotu");
    }
    else{
      StdOut.println("Slembitölufallið hefur ekki fulla lotu. Lotan er: "+ count);
    }
  }
}
