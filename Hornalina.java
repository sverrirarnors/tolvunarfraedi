public class Hornalina{
  public static void nullaUtanHornalinu(double[][] a){
    int N = a.length;
    for (int i=0; i<N; i++) {
      for (int j=0; j<N; j++) {
        if (i!=j) {
          a[i][j] = 0;
        }
      }
    }
    return;
  }
  public static void main(String[] args) {
    int N = 5;
    double[][] a = new double[N][N];
    for (int i=0; i<N; i++) {
      for (int j=0; j<N; j++) {
        a[i][j] = Math.random()*10;
      }
    }
    StdArrayIO.print(a);
    nullaUtanHornalinu(a);
    StdArrayIO.print(a);
  }
}
