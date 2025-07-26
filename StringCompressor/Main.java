public class Main {

  final static public void main(final String args[]) {
    Foo foo = new Foo();
    char[] chars = {'a','a','b','b','b','b','b','b','b','b','b','b','b','b','c','c','c'};
    helpPrint(chars);
    
    int length = foo.compress(chars);
    helpPrint(chars);

    System.out.println("length: " + length);


    char[] chars1 = {'a','b','b','b','b','b','b','b','b','b','b','b','b','c','c','c'};
    helpPrint(chars1);
    
    int length1 = foo.compress(chars1);
    helpPrint(chars1);

    System.out.println("length: " + length1);

    char[] chars2 = {'a','e', 'b','b','b','b','b','b','b','b','b','b','b','b','d', 'c', 'c', 'e'};
    helpPrint(chars2);
    
    int length2 = foo.compress(chars2);
    helpPrint(chars2);

    System.out.println("length: " + length2);
  }
  
  public static void helpPrint(char[] w){
    System.out.print("[");
    for(char c : w) {
      System.out.print("\'" + c++ + "\', ");
    }
    System.out.println("]");
  }
}
