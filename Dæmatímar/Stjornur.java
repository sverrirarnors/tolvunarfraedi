public class Stjornur{
  public static String stjornur(int n){
    String result = "";
    for (int i=0; i<n; i++) {
      result += "*";
    }
    return result;
  }
  public static void main(String[] args) {
    StdOut.println(stjornur(6));
  }
}
