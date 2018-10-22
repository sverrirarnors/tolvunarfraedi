public class Slembi{
  public static int slembi(int r){
    return (4*r +1)%9;
  }
  public static void main(String[] args) {
    int r= 0;
    for (int i=0; i<10; i++) {
      r= slembi(r);
      StdOut.println(r);
    }
  }
}
