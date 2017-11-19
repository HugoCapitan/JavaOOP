/**
 * AbstractClass
 */
public abstract class AbstractClass {
  private String name;
  private int age;

  public AbstractClass(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void sayHi() {
    System.out.println(name);
  }

  public abstract void tellAge();
  
}