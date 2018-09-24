public class Fjarfestir{
  public static void main(String[] args) {
    int upph = Integer.parseInt(args[0]);
    int tap = Integer.parseInt(args[1]);
    int grodi = Integer.parseInt(args[2]);
    int T = Integer.parseInt(args[3]);
    double likur = Double.parseDouble(args[4]);

    int dagar = 0;
    int fjoldigroda = 0;
    int hUtkoma = 0;

    for (int t= 0; t < T; t++){
      int stada=upph;
      while (stada > tap && stada < grodi){
        dagar++;
        if (Math.random() < likur ){
          stada++;
        }
        else{
          stada--;
        }
      }
      /*while (stada > tap && stada < grodi) {
        System.out.println("Einn dagur");
          dagar++;
          if (Math.random() < likur) stada++;     // gengi hækkar um 1
          else                       stada--;     // gengi lækkar um 1
      }*/

      if (stada == grodi){
        fjoldigroda++;
      }
      hUtkoma += stada;
    }
    System.out.println("Hlutfall sala með gróða: " + (100.0*fjoldigroda)/T + "%");
    System.out.println("Meðalútkoma fjárfestis : "+ (1.0*hUtkoma)/T);
    System.out.println("Meðalfjöldi daga       : "+ (1.0*dagar)/T);
  }
}
