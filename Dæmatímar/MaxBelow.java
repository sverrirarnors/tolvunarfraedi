public class MaxBelow{
  public static void main(String[] args){
    int a = Integer.parseInt(args[0]);
    int max = Integer.MIN_VALUE;
    while (!StdIn.isEmpty()){
      int gildi = StdIn.readInt();
      if (gildi < a && gildi > max) {
        max = gildi;
      }
    }
    StdOut.println(max);
  }
}
