public class Finna{
  public static int finna(int[] a, int x){
    int result = -1;
    for (int i=0; i<a.length; i++) {
      if (a[i] == x) {
        result = i;
        break;
      }
    }
    return result;
  }
  public static void main(String[] args) {
    int[] a = new int[10];
    for (int i=0; i<10; i++) {
      a[i] = (int)(Math.random()*6);
    }
    StdOut.println("2 er í sæti " + finna(a, 2));
    StdOut.println("4 er í sæti " + finna(a, 4));
  }
}
