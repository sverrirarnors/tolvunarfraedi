public class Toppar{
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    int[][] a = new int[n][n];

    for (int i=0; i<n; i++) {
      for (int j=0; j<n; j++) {
        a[i][j] = (int)(Math.random()*10);
      }
    }
    for (int i=0; i<n; i++) {
      for (int j=0; j<n; j++) {
        System.out.print(a[i][j]+ " ");
      }
      System.out.println();
    }
    System.out.println();
    int fjoldi = 0;
    int[][] toppar = new int[n*n][2];

    for (int i=1; i<n-1; i++) {
      for (int j=1; j<n-1; j++) {
        int stak = a[i][j];
          if (stak>a[i-1][j] &&  stak>a[i+1][j] && stak>a[i][j-1] && stak>a[i][j+1]) {
            toppar[fjoldi][0] = i;
            toppar[fjoldi][1] = j;
            fjoldi++;
          }
        }
      }
      for (int i=0; i<fjoldi; i++) {
        System.out.println("Stak (" + toppar[i][0] + ", " + toppar[i][1] + ") = " + a[toppar[i][0]][toppar[i][1]]+ " er toppur");
      }
      System.out.println("Fjöldi toppa er: " + fjoldi);

  }
}
