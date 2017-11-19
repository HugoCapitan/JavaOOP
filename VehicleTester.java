public class VehicleTester {
  public static void main(String[] args) {
    Plane boing = new Plane(110);

    System.out.println("--------Avion---------");
    boing.printFuel();
    boing.arrancar();
    boing.printSpeed();

    Car bochito = new Car("Manual");
    System.out.println("--------Carro---------");
    bochito.printFuel();
    bochito.arrancar();
    bochito.printSpeed();
    bochito.subirVelocidad();
    bochito.subirVelocidad();
  }
}