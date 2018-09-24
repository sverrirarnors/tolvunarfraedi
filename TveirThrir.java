public class TveirThrir{
  public static void main(String[] args){
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int c = Integer.parseInt(args[2]);
    if (a%3 == 0){
      if (b%3 == 0){
        System.out.println(true);
      }
      else{
        System.out.println((c%3 == 0));
      }
    }
    else{
      if ((b%3 == 0) && (c%3 == 0)){
        System.out.println(true);
      }
      else{
        System.out.println(false);
      }
    }
  }
}
