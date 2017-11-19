/**
 * interfaceImplementer
 */
public class interfaceImplementer extends AbstractClass implements Interfaces {
  public int x, y, area;

  interfaceImplementer (int x, int y){
    super("john", 86);
    this.x = x;
    this.y = y;
    calculateArea(this.x, this.y);
  }

  @Override
  public int calculateArea(int x, int y) {
    area = x * y;
    return area;
  }

  @Override
  public void printArea() {
    System.out.println(area);
  }

  public void printMedidas() {
    System.out.println("x" + x + "y" + y);
  }

  @Override
  public void tellAge() {
    System.out.println("24");
  }

  public static void main(String[] args) {
    interfaceImplementer square = new interfaceImplementer(3, 4);
    square.printMedidas();
    square.printArea();
    square.sayHi();
    square.tellAge();
  }
  
}