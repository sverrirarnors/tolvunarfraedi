public class Tata{
  public static void main(String[] args) {
    Turtle tata = new Turtle(0.5,0.5,0.0);

    for (int j=0; j<72; j++) {
      for (int i=0; i<4; i++) {
        tata.goForward(0.3);
        tata.turnLeft(90);
      }
      tata.turnLeft(5);
    }
  }
}
