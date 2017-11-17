class Car {
  /**
   * Default (no modifier) = visible to the package
   * Private = Only visible to the class
   * Protected = Only visible to package and all subclasses 
   * Public = Visible for everyone
   */
  protected String name;
  protected String color;
  protected int horsepower;

  public Car (String name, String color) {
    this.horsepower = 400;
    this.color = color;
    this.name = name;

    getNumbers();
  }

  // Getter, because of encapsulation, only way to access this class variables is by calling a method in the class
  public String getColor() {
    return color;
  }

  // Setter, because of encapsulation
  public void setColor(String receivedColor) {
    color = receivedColor;
  }

  // As this method is private, it won't be inherited to the Audi subclass
  private void getNumbers() {
    System.out.println("$1000000000");
  }
}

// A SUBCLASS of Car, it inherites or 'extends' from its parent class: Car
class Audi extends Car {
  private String serial;

  // Audi's constructor
  public Audi (String name, String color, int tires) {
    // 'super' REQUIRED, this calls the constructor of Car: Audi's parent class
    super(name, color);

    this.serial = "aksndjabsfkas1342";    

    // As the 'name' variable is inherited, you can access it from here
    System.out.println(this.name);
  }

  /**
   * OVERRIDING a method: Audi objects will all return black, 
   * while normal Car objects will return the actual color of the car
   */ 
  public String getColor() {
    return "black";
  }

}

public class Agency {
  public static void main(String[] args) {
    Audi audi = new Audi("supercarro", "darks", 4);

    String audiColor = audi.getColor();

    System.out.println(audiColor);

    // audi.getNumbers(); <-- WRONG This method was not inherited to audi
    // audi.serial = "someotherserial"; <-- WRONG that variable is only visible by the Audi class
  }
}