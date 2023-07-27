package ex02_Coffee;

public class MainWrapper {

  public static void main(String[] args) {
    
    Cup cup1 = new Cup();
    Cup cup2 = new Cup();
    
    Coffee coffee1 = new Americano("아메리카노");
    cup1.setCoffee(coffee1);
    Coffee coffee2 = new CafeLatte("카페라떼");
    cup2.setCoffee(coffee2);

    Person p = new Person();
    p.addCupToTray(cup1);
    p.addCupToTray(cup2);
    
    p.trayInfo();
    
  }

}
