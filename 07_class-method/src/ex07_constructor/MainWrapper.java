package ex07_constructor;

public class MainWrapper {

  public static void main(String[] args) {
    
    // Computer myCom객체 선언
    Computer myCom;
    
    // Computer myCom 객체 생성
    myCom = new Computer();  // public Computer() {} 생성자가 호출된다. 
    //아무필드값을 안준 기본객체를 만드려는 시도
    
    //생성자역할 setter가했음
    myCom.setModel("gram"); //그래서 setter 호출 값을 채워서
    System.out.println("my com :" + myCom.getModel());
    
    
    // Computer yourCom 객체  선언
    Computer yourCom;
    
    // Computer yourCom 객체 생성
    yourCom = new Computer("mac book"); // public Computer (String model) {} 생성자가 호출된다. 
    //필드값을 채워서 전달  String 있는 setter 없쥬
    
    System.out.println("yourcom :" + yourCom.getModel());
    
    //생성자를 만드는이유는 setter을 안만드려고 
  }

}
