package ex08_static;

/*
 * 인스턴스(instance)
 * 1. 메모리에 로드된 객체
 * 2. new 키워드를 이용해서 인스턴스를 생성할 수 있다.
 */

/*
 * 인스턴스 멤버(instance member)
 * 1. 인스턴스가 사용할 수 있는 멤버(필드, 메소드)
 * 2. 인스턴스가 호출할 수 있다.
 */

/*
 * 클래스 멤버(class member)
 * 1. 정적 멤버(static member)를 의미한다.
 * 2. static 키워드가 추가된 멤버(필드, 메소드)이다.
 * 3. 인스턴스가 생성되기 이전에(객체를 만들기 전, new 이전) 사용할 수 있다.
 * 4. 클래스 멤버는 instance 생성 이전에 미리 메모리에 로드된다.
 * 5. 클래스마다 1개씩만 메모리에 로드된다. (모든 인스턴스가 공유할 수 있다.)
 * 6. 클래스를 이용해서 호출한다. (인스턴스를 만든 후 인스턴스로 호출할 수 도있지만 권장하지 않는다.)
 * 7. 클래스멤버는 다른 클래스 멤버에서 참조될 수 있다.
 *스태틱안에는 스태틱 main이 스태틱이기때문에 스태틱인거 안에서 실행할 수 있었던거 인스턴스화시키지않는이상
 */


public class MyMath {
  
  // static 필드
  private static double PI;
  
  // static 필드 초기화를 위한 static 블록
  static {
    PI = 3.14;
  }
  
  // static 메소드
  public static double getCircleArea(double radius) {
    return PI * radius * radius;
  }
  

}
