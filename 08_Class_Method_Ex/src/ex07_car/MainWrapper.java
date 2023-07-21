package ex07_car;

public class MainWrapper {

  public static void main(String[] args) {
   
    Driver driver = new Driver();
    
    driver.setName("홍길동");
    driver.setCareer(20);
    
    Car myCar = new Car();
    myCar.setDriver(driver);
     
    myCar.setFuel(50);
    myCar.engineStart();//시동이 걸렸습니다. 시동이 걸리지않았습니다.
    myCar.drive(); //자동차가 움직였습니다. 자동차가 움지이지 않습니다.
    myCar.accel(50); //기본속도에 50이 추가, 현재 속도는 50입니다.
    myCar.accel(60); //기존속도에 60이 추가(최대 속도는 100), 현재 속도는 100입니다.
    myCar.brake(50); //기존속도가 50만큼 감속, 현재 속도는 50입니다.
    myCar.brake(60); //기존속도가 60만큼 감속(최저 속도는 0)

  }

}
