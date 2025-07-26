public class Main {

  final static public void main(final String args[]) {
    Foo foo = new Foo();
    char[] chars = {'a','a','b','b','b','b','b','b','b','b','b','b','b','b','c','c','c'};
    helpPrint(chars);
    
    int length = foo.compress(chars);
    helpPrint(chars);

    System.out.println("length: " + length);
  }
  
  public static void helpPrint(char[] w){
    System.out.print("[");
    for(char c : w) {
      System.out.print("\'" + c++ + "\', ");
    }
    System.out.println("]");
  }
}
