public class Saman{
  public static boolean saman(int[] a, int d, int e){
    for (int i=0; i<a.length-1; i++) {
      if (a[i]==d && a[i+1]==e || a[i]==e && a[i+1]==d) {
        return true;
      }
    }
    return false;
  }
  public static void main(String[] args) {
    int N = 10;
    int[] rand = new int[N];
    for (int i=0; i<N; i++) {
      rand[i] = (int)(Math.random()*10 +1);
    }
    StdArrayIO.print(rand);
    StdOut.println(saman(rand, 3,4));
  }
}
