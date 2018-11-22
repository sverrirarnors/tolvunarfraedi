public class SendaAftast{
  public static void sendaAftast(int[] a, int i){
    if (i > a.length-1) {
      return;
    }
    int t = a[i];
    for (int j=i; j<a.length-1; j++) {
      a[j]=a[j+1];
    }
    a[a.length-1]=t;
    return;
  }
  public static void main(String[] args) {
    int[] a= {4, 6, 1, 5, 9, 8};
    StdArrayIO.print(a);
    sendaAftast(a,2);
    StdArrayIO.print(a);
  }
}
