package ex02_Coffee;

import java.util.ArrayList;
import java.util.List;

public class Person {

  private List<Cup> tray;
  
  // new Person()
  public Person() {
   tray = new ArrayList<Cup>();
  }
  public void addCupToTray(Cup cup) {
    //this.cup = cup;
    tray.add(cup);    
  }
  public void trayInfo() {
    for(int i = 0, length = tray.size(); i < length; i++) {
      System.out.println((i + 1) + "번째 커피:" + tray.get(i).getCoffee()); //아메리카노랑 카페라떼 toString 메서드 사용
    }
  }
}
