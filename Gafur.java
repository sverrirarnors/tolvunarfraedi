public class Gafur{
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    int sum = 1;

    for (int i=0;i<n;i++){
      sum = sum + i;
      System.out.println(sum);
    }
  }
}
