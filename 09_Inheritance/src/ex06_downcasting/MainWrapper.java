package ex06_downcasting;

public class MainWrapper {

  public static void ex01() {
    
    Person p = new Student();
    p.eat();
    p.sleep();
    ((Student)p).study();  // 슈퍼 클래스 타입 -> 서브 클래스 타입으로 변경(다운캐스팅)
        
    ((Worker)p).work();    // 잘못된 캐스팅을 막고 싶다.
  }
  public static void ex02() {
    
    Person p1 = new Student();
    System.out.println(p1 instanceof Person);  //p1이 Person 타입이면 true, 아니면 false
    System.out.println(p1 instanceof Student); //p1이 Student 타입이면 true, 아니면 false   
    System.out.println(p1 instanceof Worker);
    
    if(p1 instanceof Student) {
      ((Student) p1).study();
    }    
    Person p2 = new Worker();
    
    if(p2 instanceof Worker) {
      ((Worker) p2).work();
    }
  }
  public static void main(String[] args) {
    
   ex02();
    

    
  }

}
