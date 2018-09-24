public class ArstidSwitch{
  public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    if (a>12 || a<1 )
      System.out.println("Þessi mánuður er ekki til");
    else
      switch (a) {
        case 1: case 2: case 12:
          System.out.println("Vetur"); break;
        case 3: case 4: case 5:
          System.out.println("Vor"); break;
        case 6: case 7: case 8:
          System.out.println("Sumar"); break;
        case 9: case 10: case 11:
          System.out.println("Haust"); break;
      }
  }
}
