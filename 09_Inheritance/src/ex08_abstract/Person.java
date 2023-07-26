package ex08_abstract;

/*
 * 추상 클래스
 * 1. 추상 메서드를 1개 이상 가지고 있는 클래스이다.
 * 2. abstract 키워드를 추가한다.
 * 3. 추상클래스는 객체를 생성할 수 없다. (미완성 된 클래스이기 때문이다.)
 * 4. 추상클래스의 서브 클래스는 "반드시" 추상 메서드를 오버라이드 해야한다.
 */
public abstract class Person {

  public void eat() {
    System.out.println("냠냠");
  }
  public void sleep() {
    System.out.println("쿨쿨");
  }
  // 호출을 위해서 생성한 study
  // 본무이 필요 없기 때문에 본문이 없는 메서드로 만들 수 있다.
  // 본문이 없는 메서드를 "추상 메서드"라고 한다.
  // abstract 키워드를 추가하고 본문({})을 제거한다. 
  public abstract void study();
    
  
}
