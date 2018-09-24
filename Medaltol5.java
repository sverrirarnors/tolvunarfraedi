public class Medaltol5{

  public static void main(String[] args){
    double a = Double.parseDouble(args[0]);
    double b = Double.parseDouble(args[1]);
    double c = Double.parseDouble(args[2]);
    double d = Double.parseDouble(args[3]);
    double e = Double.parseDouble(args[4]);

    double vMedaltal = (a + b + c + d + e)/5;
    double fMedaltal = Math.pow((a*b*c*d*e), (double)1/5);
    double thMedaltal = 5/((1/a) + (1/b) + (1/c) + (1/d) + (1/e));
    System.out.println("Venjulegt meðaltal: " + vMedaltal);
    System.out.println("Faldmeðaltal: " + fMedaltal);
    System.out.println("Þýtt meðaltal: " + thMedaltal);
  }
}
