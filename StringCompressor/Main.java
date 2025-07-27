import java.util.Arrays;

public class Main {

  final static public void main(final String args[]) {
    var foo = new FooImproved();
    char[] chars = {'a','a','b','b','b','b','b','b','b','b','b','b','b','b','c','c','c'};
    System.out.println("chars: " + Arrays.toString(chars));

    int length = foo.compress(chars);
    System.out.println("charsCompressed: " + Arrays.toString(chars));

    System.out.println("length: " + length);


    char[] chars1 = {'a','b','b','b','b','b','b','b','b','b','b','b','b','c','c','c'};
    System.out.println("chars1: " + Arrays.toString(chars1));
    
    int length1 = foo.compress(chars1);
    System.out.println("chars1Compressed: " + Arrays.toString(chars1));

    System.out.println("length: " + length1);

    char[] chars2 = {'a','e', 'b','b','b','b','b','b','b','b','b','b','b','b','d', 'c', 'c', 'e'};
    System.out.println("chars2: " + Arrays.toString(chars2));
    
    int length2 = foo.compress(chars2);
    System.out.println("chars2Compressed: " + Arrays.toString(chars2));

    System.out.println("length: " + length2);
  }
}
