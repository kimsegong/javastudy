package ex;

public class MainWrapper4 {
  
  // void : 리턴이 없다.
  public static void ex01() {
    
    System.out.println("리턴이 없는 ex01");
    
  }
  //int : 리턴이 int 타입이다.
  public static int ex02() {
    return 100;
    
  }
  
  public static String ex03() {
    return "Hello world";
  }
  
  
  public static void main(String[] args) {
    ex01();
    ex02(); //실핼 후에는 100;
    System.out.println(ex02());
    
    
    String str = ex03();
    System.out.println(str); //Hello world
    
  }

}
