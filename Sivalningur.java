public class Sivalningur {

    public static void main(String[] args) {
      double rad = Double.parseDouble(args[0]);
      double haed = Double.parseDouble(args[1]);
      double flatarmal = (2 * Math.PI * rad*rad) + (2*Math.PI*haed*rad);
      double rummal = (Math.PI*haed*rad*rad);
      System.out.println("Flatarmál sívalningsins er: " + flatarmal);
      System.out.println("Rúmmál sívalningsins er: " + rummal);
    }

}
