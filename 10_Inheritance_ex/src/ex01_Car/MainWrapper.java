package ex01_Car;

public class MainWrapper {

  public static void main(String[] args) {
    
    //Ev 
    Ev ev = new Ev();
    ev.drive();
    ev.charge();
    
    //EngineCar
    EngineCar enCar = new EngineCar();
    enCar.addFuel();
    enCar.drive();
    
    //HybridCar
    HybridCar hybrid = new HybridCar();
    hybrid.addFuel();
    hybrid.charge();
    hybrid.drive();

  }

}
