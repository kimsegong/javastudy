package ex02_lambda;

/*
 *  람다 표현식
 *  1. Anonymous Inner Type 방식의 객체를 생성할 때 사용할 수 있는 표현식이다.
 *  2. 추상 메서드가 하나인 인터페이스에서 람다 표현식을 사용할 수 있따. 메서드가 두개일때는 못씀
 *    (함수형 인터페이스 : 추상 메서드가 하나인 인터페이스)
 *  3. 형식
 *    (매개변수) -> {
 *      본문;
 *     }
 */
/*
 * 람다 표현식 적용 예시
 * 
 * 1. 파라미터 X, 반환 X
 *    () -> {
 *      System.out.println("Hello World");
 *    };
 *    
 *    () -> System.out.println("Hello World"); // 메소드 본문이 1줄이면 중괄호 {} 생략가능
 * 2. 파라미터 O, 반환 X (파라미터의 타입은 생략한다.)
 *  
 *    (name) -> {
 *      System.out.println("Hello" + name);
 *    }
 *    
 *    (name) -> System.out.println("Hello" + name);
 * 3. 파라미터 X, 반환 O (반환 타입은 생략한다.)
 * 
 *    () -> {
 *      String name = "tom";
 *      return name; 
      }
      
      () -> "tom"; // 메서드에 return만 존재하면 return을 생략한다.
      
   4. 파라미터 O, 반환 O
      (name) -> {
      String retVal = name + "님";
      System.out.println(retVal);
      return retVal;
      (number) -> number + 1;
      
     
      
 */


public class GasStation {

  private int totalOil;
  private int payPerLiter;
  private int earning;
  
  public GasStation() {    
  }
  public void sellOil(String model, int oil) {
    //Car 인터페이스를 구현한 별도 클래스를 만들고, 해당 클래스 객체를 만들고, addOil()호출
    //Car's addOil
    //Car car 지역변수(객체) 선언 (sellOil메소드 호출시 생성되고, sellOil 메서드 종료 시 소멸된다.)
    Car car;
    
    // car 지역변수(객체) 생성
    // 람다식으로 Car 인터페이스 타입의 객체 생성
    car = () -> {
      totalOil -= oil;
      earning += oil * payPerLiter;
      System.out.println(model + " " + oil + "L주유완료");
    };
    // Car car 지역변수(객체)의 addOil() 메소드 호출
    car.addOil();
 
  }
  public int getTotalOil() {
    return totalOil;
  }
  public void setTotalOil(int totalOil) {
    this.totalOil = totalOil;
  }
  public int getPayPerLiter() {
    return payPerLiter;
  }
  public void setPayPerLiter(int payPerLiter) {
    this.payPerLiter = payPerLiter;
  }
  public int getEarning() {
    return earning;
  }
  public void setEarning(int earning) {
    this.earning = earning;
  }  
}
