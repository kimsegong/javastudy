package ex03_Soldier;

public class MainWrapper {

  
  public static void main(String[] args) {
    
    Gun gun = new Gun(30);
    Soldier s = new Soldier(gun);
    
    //Soldier s = new Soldier(30);
    
    s.reload(30);  // 장전이 불가능합니다.
    s.reload(20);  // 총알이 20발 장전되었습니다. 현재 50발이 들어있습니다.
    
    for(int n = 0; n < 50; n++) {
      s.shoot();
    }
    s.shoot(); //헛빵
    
  }

}
