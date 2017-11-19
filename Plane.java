public class Plane extends Vehicle implements Radio {
  public int seats;

  public Plane(int seats) {
    super("motor de avion", "combustible de avion");
    this.seats = seats;
  }

  @Override
  public void arrancar () {
    System.out.println("Revisando estado de las turbinas");
    System.out.println("Acelerando");
    System.out.println("Despegando");
  }

  @Override
  public int callControlTower(int frequency) {
    System.out.println("Calling control tower on: " +  frequency + "Mhz. frequency.");
    return 0;
  }

}