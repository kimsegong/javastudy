package ex07_car;

public class Driver {

  private String name;
  private int career;
  private boolean bestDriver; // 기준 career가 10년 이상이면 true
  
  public void setName(String name) {
    this.name = name;
  }  
  public void setCareer(int career) {
    this.career = career;
    setBestDriver(career >= 10); 
  }  
  private void setBestDriver(boolean bestDriver) {
    this.bestDriver = bestDriver;
  } 
  public String getName() {
    return name;
  }  
  public int getCareer() {
    return career;
  }  
  public boolean isBestDriver() {
    return bestDriver;
  }
}




//전달전달 true가 bestDriver에들어가고