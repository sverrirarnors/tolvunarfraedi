public class TextaDags{
  public static String textaDags(String dag){
    String[] a = dag.split("-");
    String dagur = Integer.toString(Integer.parseInt(a[2]));
    String ar = a[0];
    String manudur = "";
    int manudurS = Integer.parseInt(a[1]);
    switch (manudurS) {
      case 1: manudur = "janúar"; break;
      case 2: manudur = "febrúar"; break;
      case 3: manudur = "mars"; break;
      case 4: manudur = "apríl"; break;
      case 5: manudur = "maí"; break;
      case 6: manudur = "júní"; break;
      case 7: manudur = "júlí"; break;
      case 8: manudur = "ágúst"; break;
      case 9: manudur = "september"; break;
      case 10: manudur = "október"; break;
      case 11: manudur = "nóvember"; break;
      case 12: manudur = "desember"; break;
      default: return "Ógildur mánuður";
    }
    return dagur.concat(". " + manudur + " " + ar);
  }
  public static void main(String[] args) {
    StdOut.println(textaDags(args[0]));
  }
}
