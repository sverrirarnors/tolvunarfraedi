public class EinvidEind{
  public static int einvidEind(int n){
    int stada=1;
    int count=0;
    while (stada<n){
      if (stada==1) {
        stada++;
      }
      else if (Math.random()<0.5) {
        stada--;
      }
      else{
        stada++;
      }
      count++;
    }
    return count;
  }
  public static void main(String[] args) {
    int T = Integer.parseInt(args[0]);
    int n = Integer.parseInt(args[1]);
    int summa = 0;
    for (int i=0; i<T; i++) {
      summa += einvidEind(n);
    }
    StdOut.printf("Meðalfjöldi fyrir n=%d: ", n);
    StdOut.print(summa/T + "\n");
  }
}
