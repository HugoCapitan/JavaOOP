public class Car {
  String name;
  String color;
  int horsepower;

  /**
   * Constructor.
   * Same name as class.
   * First thing called when instantiating a new object
   */
  public Car (String name, String color) {
    // 'this' keyword used to differentiate between class variables and method parameters
    this.horsepower = 400;
    this.color = color;
    this.name = name;
  }

  public void printColor() {
    System.out.println("Your " + name + " is: " + color + " and has " + horsepower + " horsepower");
  }

  public static void main(String[] args) {
    // Instantiation of new Car objects, each car has name, color, and a printColor method of it's own
    Car mustang = new Car("mustang", "red");
    Car ferrari = new Car("ferrari", "blue");

    // As mustang is a Car object, it has a printColor method
    mustang.printColor();
    ferrari.printColor();

    System.out.println(mustang.name);
  }

}
