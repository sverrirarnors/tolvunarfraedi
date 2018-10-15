public class  eydaNullum{
  public static int[]  eydaNullum(int[] a){
    int fjoldi = 0;
    boolean[] stodur = new boolean[a.length];
    for (int i=0; i<a.length; i++) {
      if (a[i]==0) {
        stodur[i] = true;
        fjoldi++;
      }
    }
    int[] b = new int[a.length - fjoldi];
    int c = 0;
    for (int i=0; i<a.length; i++) {
      if (!stodur[i]) {
        b[c] = a[i];
        c++;
      }
    }
    return b;
  }
  public static void main(String[] args) {
    int[] a = new int[20];
    for (int i=0; i<20; i++){
      a[i] = (int)(Math.random()*6);
    }
    int[] result = eydaNullum(a);

    StdOut.print("Upprunalega fylkið er ["+a[0]);
    for (int i=1; i<a.length; i++) {
      StdOut.print("," + a[i]);
    }
    StdOut.println("]");

    StdOut.print("Fylkið án núlla er ["+result[0]);

    for (int i=1; i<result.length; i++) {
      StdOut.print(","+ result[i]);
    }
    StdOut.println("]");
  }
}
