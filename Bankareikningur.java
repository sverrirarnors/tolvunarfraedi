public class Bankareikningur{
  private double innistaeda;
  private double fjoldiFaersla;

  public Bankareikningur(){
  }
  public double skilaInnist(){
    return innistaeda;
  }
  public void leggjaInn(double upph){
    innistaeda += upph;
    fjoldiFaersla++;
    return;
  }
  public boolean takaUt(double upph){
    if (upph>innistaeda) {
      return false;
    }
    fjoldiFaersla++;
    innistaeda -= upph;

    return true;
  }
  public void faerslugjold(){
    if (fjoldiFaersla <= 5) {
      return;
    }
    double gjald = (fjoldiFaersla-5)*10;
    if (gjald >= innistaeda) {
      innistaeda = 0;
    }
    innistaeda -= gjald;
    return;
  }
  public static void main(String[] args) {
    Bankareikningur reikningur = new Bankareikningur();
    reikningur.leggjaInn(1000000);
    for (int i=0; i<15; i++) {
      reikningur.takaUt(StdRandom.uniform(1000,50000));
    }
    StdOut.println("Innistaða fyrir færslugjöld: " + reikningur.skilaInnist());
    reikningur.faerslugjold();
    StdOut.println("Innistaða eftir færslugjöld: " + reikningur.skilaInnist());
  }
}
