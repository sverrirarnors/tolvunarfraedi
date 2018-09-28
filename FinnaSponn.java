public class FinnaSponn{
  public static void main(String[] args) {
    int[] a = new int[args.length];
    for (int i=0; i<args.length; i++){
      a[i] = Integer.parseInt(args[i]);
    }
    int min = a[0];
    int max = a[0];
    for (int j=0; j<a.length; j++){
      if (a[j]< min){ min=a[j];}
      else if (a[j]> max){ max=a[j];}
    }
    System.out.println("Spönnin er: "+ (max-min));
  }
}
