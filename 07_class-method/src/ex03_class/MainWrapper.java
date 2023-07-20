package ex03_class;

public class MainWrapper {

  public static void main(String[] args) {
    
    // Calculator 객체 선언
    Calculator myCalc;
    
    // Calculator 객체 생성(객체 == 인스턴스)
    myCalc = new Calculator(); // 인스턴스화 : 메모리에 로드외었다.
    
    // 계산하고자 하는 실수 2개 준비
    double a = 1.5;
    double b = 1.2; //지금까지 필드와 메서드는 인스턴스멤버(static이 안붙어있눈멤버)
    
    // 덧셈, 뺄셈 , 곱셈, 나눗셈 메소드 호출
    System.out.println(myCalc.addition(a, b));
    System.out.println(myCalc.division(a, b));
    System.out.println(myCalc.multiplication(a, b));
    System.out.println(myCalc.substraction(a, b));
  }

}
