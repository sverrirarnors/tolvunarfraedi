public class vinnurTvisvar{
  public static int vinnurTvisvar(){
    int count = 1;
    boolean T1 = (int)(Math.random()*6) < (int)(Math.random()*6);
    while (true) {
      if (T1 &&  (int)(Math.random()*6) < (int)(Math.random()*6)){
        count++;
        break;
      }
      else{
        T1 = (int)(Math.random()*6) < (int)(Math.random()*6);
        count++;
      }
    }
    return count;
  }
  public static void main(String[] args) {
    int summa = 0;
    for (int i=0; i<100000; i++) {
      summa += vinnurTvisvar();
    }
    StdOut.println(1.0*summa/100000);
  }
}
