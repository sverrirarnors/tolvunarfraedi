public class TolustafurNrRec{
  public static int tolustafurNrRec(int tala, int i){
    if (i==0) return tala%10;
    else tala /=10;
    return tolustafurNrRec(tala,i-1);
  }
  public static void main(String[] args) {
    for (int i=0; i<6; i++) {
      StdOut.println(tolustafurNrRec(12345,i));
    }
  }
}
