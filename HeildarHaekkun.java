public class HeildarHaekkun{
  public static int heildarHaekkun(int[] h){
    int haekkun = 0;
    for (int i=0; i<h.length-1; i++) {
      if (h[i]<h[i+1]) {
        haekkun += h[i+1] - h[i];
      }
    }
    return haekkun;
  }
  public static void main(String[] args) {
    int[] rand = new int[10];
    for (int i=0; i<10; i++) {
      rand[i] = (int)(Math.random()*101);
    }
    StdArrayIO.print(rand);
    StdOut.println(heildarHaekkun(rand));
  }
}
