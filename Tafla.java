public class Tafla{
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);

    for (int i=1;i<=(n+1);i++){
      for (int j=(n-i); j>=0;j--) {
        if (i<10){
          System.out.print(i+ "  ");
        }
        else{
          System.out.print(i+ " ");
        }
      }
      System.out.println();
    }
  }
}
