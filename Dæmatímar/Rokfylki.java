public class Rokfylki{
  public static void main(String[] args) {
    int M = Integer.parseInt(args[0]);
    int N = Integer.parseInt(args[1]);

    boolean[][] a = new boolean[M][N];

    for (int i=0; i<M; i++) {
      for (int j=0; j<N; j++) {
        a[i][j] = (Math.random()<0.5);
      }
    }
    for (int i=0; i<M; i++) {
      for (int j=0; j<N; j++) {
        if (a[i][j]) System.out.print("*");
        else System.out.print("_");
      }
      System.out.println();
    }
  }
}
