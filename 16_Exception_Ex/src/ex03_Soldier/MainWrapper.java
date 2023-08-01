package ex03_Soldier;

public class MainWrapper {

  
  public static void main(String[] args) {
    
    try {
    Gun gun = new Gun(30);
    Soldier s = new Soldier(gun);
    
    //Soldier s = new Soldier(30);
    
    s.reload(8888);  // 장전이 불가능합니다.
    s.reload(7777);  // 총알이 20발 장전되었습니다. 현재 50발이 들어있습니다.
    
    for(int n = 0; n < 50; n++) {
      s.shoot();
    }
    s.shoot(); //헛빵
    }catch(RuntimeException e) {
      System.out.println(e.getMessage());
    }
    
  }

}
