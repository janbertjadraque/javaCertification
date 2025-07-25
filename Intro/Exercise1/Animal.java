package Exercise1;
public class Animal {

  static {
    System.out.println("This is a static initializer block name: " + Animal.name);
  }
  
  public static String name = "default name";
  public int feetCount;
  
  public void Animal(){
    name = "patypus";
    feetCount = 2;

    System.out.println("we are the fake constructor part of animal class");
  }

  public Animal(String name, int feetCount){
    this.name = name;
    this.feetCount = feetCount;
  }

  public Animal(){
    name = "spider";
    feetCount = 8;

     System.out.println("we are the constructor part of animal class");
  }

  {
    System.out.println("we are at intializer block for animal class! name: " + Animal.name);

    Animal.name = "doggy";
  }
}