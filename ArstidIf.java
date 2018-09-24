public class ArstidIf{
  public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    if (a>12 || a<1 )
      System.out.println("Þessi mánuður er ekki til");
    else if (a<=2 || a==12)
      System.out.println("Vetur");
    else if (a<=5)
      System.out.println("Vor");
    else if (a<=8)
      System.out.println("Sumar");
    else if (a<=11)
      System.out.println("Haust");
  }
}
