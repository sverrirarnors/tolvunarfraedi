public class Counter{
  private int count;
  private final String name;
  private final int limit;

  public Counter(String id, int max){name = id; limit=max;}
  public boolean increment(){
    if (count + 1 > limit) {
      return false;
    }
    count++;
    return true;
  }
  public int value(){
    return count;
  }
  public static void main(String[] args) {
    Counter kosningar = new Counter("Kosningar",5);
    for (int i=0; i<7; i++) {
      StdOut.println(kosningar.increment());
    }
  }
}
