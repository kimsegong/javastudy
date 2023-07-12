package ex03_operator;

public class MainWrapper {

  // ex01 메소드 만들기(메소드 정의)
  public static void ex01() {
    // ex02 메서드 계정
    
  } 
    public static void ex02() {
      
 //증감 연산 (++, --)
   
 // 전위 연산 (먼저 증감)
   int a = 10;
   System.out.println(++a);  //a를 증가시킨 뒤 출력한다.
      
      
 // 후위 연산 (나중에 증감)  
     int b = 10;
     System.out.println(b++); //b를 출력한 뒤 증가시킨다.
     System.out.println(b);
      
     
  }
    
    
  // ex3 메소드 정의
   public static void ex03() {
     
     // 대입 연산
     int a = 10;
     int b = a;
     System.out.println(a);
     System.out.println(b);
     
     // 복합 연산(복합 대입 연산)
     int x = 10;
     int y = 0;
     y += x; // y = y + x;   y값을 x만틈 늘리기
     
     System.out.println(x);
     System.out.println(y);
     
     
   }
  
   
  public static void ex04() {
    
    //관계 연산(크기 비교)
    int a = 3;
    int b = 5;
    
    boolean result1 = a > b;
    boolean result2 = a >= b;
    boolean result3 = a < b;
    boolean result4 = a <= b;
    boolean result5 = a == b;
    boolean result6 = a != b;
        
   
    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);
    System.out.println(result4);
    System.out.println(result5);
    System.out.println(result6);
    
    //논리 연산
    //1. 논리 AND : &&, 모든 조건이 만족하면 true, 아니면 false
    //2. 논리 OR  : ||, 하나의 조건이라도 만족하면 true, 아니면 false
    //3. 논리 NOT : ! , 조건 결과가 true이면 false, 조건 결과가 false이면 true
    int x = 10;
    int y = 20;
    
    boolean andResult = (x == 10) && (y == 10); //모든 조건이 만족하지 않기 때문에 false
    boolean orResult = (x == 10) || (y == 10); // 하나의 조건이 만족하므로 true가 된다.
    boolean notResult = !(x == 10); // x ! = 10와 동일한 조건
    
    System.out.println(andResult);
    System.out.println(orResult);
    System.out.println(notResult);
    
    
            
  }
  
 
  public static void main(String[] args) {

    // ex01 메소드 실행 부탁(메소드 호출)
    //hello();
    //ex02();  
    //ex03();
    ex04();
    
    
  }

 public static void hello() {
    
    //정수 연산
    int a = 5;
    int b = 2;
    
    int add = a + b;
    int sub = a - b;
    int mul = a * b;
    int mok = a / b;
    int mod = a % b;
    
    
     System.out.println(add);
     System.out.println(sub);
     System.out.println(mul);
     System.out.println(mok);
     System.out.println(mod);
     
     //실수 연산
     double x = 5;
     double y = 2;
     
     double addResult = x + y;
     double subResult = x - y;
     double mulResult = x / y;
     double dicResult = x * y;
     double modResult = x % y;  //나누기
     
     
     System.out.println(addResult);
     System.out.println(subResult);
     System.out.println(mulResult);
     System.out.println(dicResult);
     System.out.println(modResult);
       
     // 미션, 정수끼리 계산해서 실수 결과 도출하기
     int i = 5;
     int j = 2;
     
     double result = (double)i / j;
     System.out.println(result);
     
      
    }
    
    
  
 
  
  
}
