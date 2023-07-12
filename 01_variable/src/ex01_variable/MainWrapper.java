package ex01_variable;

public class MainWrapper {
  
  public static void main(String[] args) {
    
     // single comment ( 한 줄 주석)
     /*
      * multiple comment
      * 여러 줄 주석
      * 
      */
    /*
     * 키워드 규칙
     * 1. 프로젝트 : 상관없다 맘대로
     * 2. 패키지   : 모두 소문자 (실무는 회사 도메인을 거꾸로 작성)
     * 3. 클래스   : Upper Camel Case(첫 글자가 대문자인 Camel Case)
     * 4. 메소드   : Lower Camel case(첫 글자가 소문자인 Camel Case)
     * 5. 변수     : Lower Camel case(첫 글자가 소문자인 Camel Case)
     * 6. 상수     : Snake Case(대문자를 밑줄로 연결)
     */
    
    // 들여쓰기는 필수이다.
    
    //변수 선언하기
    
    //primitive type - 1 : 논리타입
    boolean isGood = true;
    boolean isAlive = false;
    System.out.println(isAlive);
    System.out.println(isGood);
    
    //primitive type - 2 : 문자타입
    char ch1 = 'A';
    char ch2 = '가';
    System.out.println(ch1 + ch2);
    System.out.println(ch1);
    System.out.println(ch2);
    
    // primitive type - 3 : 정수타입
    int score = 100;
    long money = 1000000000000L;
    System.out.println(score + money);
    
    // primitive type - 4 : 실수타입
    double commision = 0.5;
    System.out.println(commision);
    
    // 상수
    final double PI = 3.14;
    System.out.println(PI);
    
    // reference type : 참조타입
    String name = "tom";
    System.out.println(name);
    
    
  }

}
