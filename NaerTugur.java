public class NaerTugur{
  public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    int modulo = a%10;
    switch (modulo) {
      case 1: case 0: case 9:
        System.out.println("Nálægt tug"); break;
      default :
        System.out.pintln("Ekki nálægt tug");
    }
  }
}
