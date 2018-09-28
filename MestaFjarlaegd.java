public class MestaFjarlaegd{
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);

    int[] a = new int[n];

    for (int i = 0; i<n; i++){
      a[i] = (int)(Math.random()*11)-5;
    }
    System.out.print(a[0]);
    for (int j=1;j<n;j++){
      System.out.print(", "+a[j]);
    }
    System.out.println();

    int[] munur = new int[n];

    for (int k=0; k<n; k++){
      for (int l=k+1; l<n; l++){
        if (a[k] == a[l]){
          munur[k] = l-k;
          break;
        }

      }
    }
    int maxStada = 0;
    int maxMunur = munur[0];
    for (int m=0;m<n ;m++){
      if (munur[m]> maxMunur){
        maxMunur = munur[m];
        maxStada = m;
      }
    }
    System.out.println("Mesta fjarlægð er " + maxMunur + " fyrir gildið " + a[maxStada]);
  }
}
