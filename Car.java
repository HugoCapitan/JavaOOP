public class Car extends Vehicle {
  String transmision;
  int velocidad;

  public Car(String transmision) {
    super("motor de carro", "magna");
    this.transmision = transmision;
  }

  public void subirVelocidad() {
    this.velocidad = this.velocidad + 1;
    System.out.println(this.velocidad);
  }

  @Override
  public void arrancar() {
    System.out.println("Prendiendo motor");
    System.out.println("Acelerar");
    this.velocidad = 1;
  }
}