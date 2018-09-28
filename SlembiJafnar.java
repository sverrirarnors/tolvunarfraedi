public class SlembiJafnar{
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);

    int[] a = new int[n];

    for (int i = 0; i<n; i++){
      a[i] = (int)(Math.random()*51)*2;
    }
    System.out.print(a[0]);
    for (int j=1;j<n;j++){
      System.out.print(", "+a[j]);
    }
    System.out.println();
  }
}
