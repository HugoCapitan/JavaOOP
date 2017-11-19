public abstract class Vehicle {
  public int maxSpeed;
  public String motorModel;
  public String fuelType;

  public Vehicle(String motorModel, String fuelType) {
    this.motorModel = motorModel;
    this.fuelType = fuelType;

    if (motorModel.equals("motor de carro")) {
      this.maxSpeed = 280;
    } else {
      this.maxSpeed = 600;
    }
  }

  public abstract void arrancar();

  public void printSpeed() {
    System.out.println((maxSpeed / 2) + " km/h");
  }

  public void printFuel() {
    System.out.println(fuelType);
  }

}