public class RammiNM{
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    int m = Integer.parseInt(args[1]);
    if (n<=2 || m<=2) {
      System.out.println("Breidd og hæð verða að vera heiltala stærri en tveir");
    }

    else{
      char a = '+';
      char b = '-';
      for (int i=1;i<=n ;i++ ) {
        if (i==1 || i==n) {
          a = '+';
          b = '-';
        }
        else{
          a = '|';
          b = ' ';
        }
        System.out.print(a+" ");
        for (int j=2;j<m ;j++ ) {
          System.out.print(b+" ");
        }
        System.out.print(a);
        System.out.println();

      }
    }
  }
}
