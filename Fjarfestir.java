/*public class Gambler {

    public static void main(String[] args) {
        int stake  = Integer.parseInt(args[0]);    // gambler's stating bankroll
        int goal   = Integer.parseInt(args[1]);    // gambler's desired bankroll
        int trials = Integer.parseInt(args[2]);    // number of trials to perform

        int bets = 0;        // total number of bets made
        int wins = 0;        // total number of games won

        // repeat trials times
        for (int t = 0; t < trials; t++) {

            // do one gambler's ruin simulation
            int cash = stake;
            while (cash > 0 && cash < goal) {
                bets++;
                if (Math.random() < 0.5) cash++;     // win $1
                else                     cash--;     // lose $1
            }
            if (cash == goal) wins++;                // did gambler go achieve desired goal?
        }

        // print results
        System.out.println(wins + " wins of " + trials);
        System.out.println("Percent of games won = " + 100.0 * wins / trials);
        System.out.println("Avg # bets           = " + 1.0 * bets / trials);
    }

}
*/
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
    System.out.println("Hlutfall sala með gróða: " + (100.0*fjoldigroda)/T);
    System.out.println("Meðalútkoma fjárfestis : "+ (1.0*hUtkoma)/T);
    System.out.println("Meðalfjöldi daga       : "+ (1.0*dagar)/T);
  }
}
