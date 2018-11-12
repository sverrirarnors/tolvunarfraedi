public class Island{
  public static void main(String[] args) {
    String s = "Ísland er lýðveldi með þingbundinni stjórn";
    String t = s.split("er")[0] + "var" + s.split("er")[1];
    String v = s.substring(0,s.indexOf("er")).concat("var" + s.substring(s.indexOf("er")+2,s.length()));
    StdOut.println(t);
    StdOut.println(v);

    int count = 0;
    do {
      count++;
      s = s.substring(s.indexOf("n")+1,s.length());
    } while (s.indexOf("n")!=-1);
    StdOut.println(count);
  }
}
