package ex07_car;

public class Car {

  private Driver driver;
  private int speed;
  private int fuel;
  private final int MAX_SPEED = 100;
  
  public void setDriver(Driver driver) {
    this.driver = driver;
  }
  public void setSpeed(int speed) {
    this.speed = speed;
  }
  public void setFuel(int fuel) {
    this.fuel = fuel;
  } 
  public Driver getDriver() {
    return driver;
  }
  public int getSpeed() {
    return speed;
  }
  public int getFuel() {
    return fuel;
  }   
  public void engineStart() {
     if(fuel == 0) {
       System.out.println("시동이 걸리지 않았습니다");
     }else {
       System.out.println("시동이 걸렸습니다.");      
     }
  }
   public void drive () {
     if(fuel == 0  || driver == null) {
       System.out.println("자동차가 움직이지 않았습ㄴ;디");
     } else {
       System.out.println("자동차가 움직였습니다.");
     }
   }
   public void accel(int speed) {
     this.speed += speed;
     fuel--;
     if(this.speed > MAX_SPEED) {
       this.speed = MAX_SPEED;
     }
     System.out.println("현재속도는 " + this.speed + "입니다.");
   }
   public void brake(int speed) {
     this.speed -= speed;
     if(this.speed < 0) {
       this.speed = 0;
     }
     System.out.println("현재속도는" + this.speed + "입니다.");
     
   }
   
 }
 
