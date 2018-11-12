import java.awt.Color;
public class Andhverfulitur{
  public static Color andhverfa(Color c){
    return new Color(255-c.getRed(),255-c.getGreen(),255-c.getBlue());
  }
  public static void main(String[] args) {
    Color c = new Color(10,40,100);
    StdOut.println(c);
    StdOut.println(andhverfa(c));
  }
}
