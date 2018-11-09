public class SnuaStofum{
  public static int snuaStofum(int n){
    int result = 0;
    int lengd = 0;
    int n2 = n;
    while (n2>0){
      n2 /= 10;
      lengd++;
    }
    for (int i=0; i<lengd; i++) {
      result += (n%10)*Math.pow(10,lengd-i-1);
      n/=10;
    }
    return result;
  }
  public static void main(String[] args) {
    int talan = Integer.parseInt(args[0]);
    StdOut.println(snuaStofum(talan));
  }
}
