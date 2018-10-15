public class SlembiProfun {

    public static int[] slembiFylki(int N, int a, int b) {
        int[] c = new int[N];
        for (int i=0; i<N; i++) {
          c[i] = (int)(Math.random()*((b-a)+1))+a;
        }
        return c;

    }

    public static void main(String[] args) {

        int[] rnd = slembiFylki(25, -10, 10);

        for (int i=0; i<rnd.length; i++)
            System.out.print(rnd[i] + " ");
        System.out.println();
    }
}
