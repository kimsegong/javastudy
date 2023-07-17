package ex02_loop;

public class MainWrapper {

  
  public static void ex01() {
    // 구구단 출력하기
    // 2 x 1 = 2
    // 2 x 2 = 4
    // ...
    // 2 x 9 = 17
    int dan = 2;  // 이 곳에 원하는 구구단을 넣으면 된다.
    int a = 1;
    while(a <= 9) {
      System.out.println(dan + "*" + a + "=" +dan * a);
      a++;
    }
           
    
  }
  
  public static void ex02() {
    // 100000 넘을 때까지 60원씩 모금하면서 과정 출력하기
    // 1회 모금액 60원, 현재 모금액 60원
    // 2회 모금액 60원, 현재 모금액 120원
    // 3회 모금액 60원, 현재 모금액 180원
    // ...
    // 1667회 모금액 60원, 현재 모금액 100020원
    int goal = 100000;  // 목표 모금액
    int money = 60;  // 1회당 모금액
    int total = 0;  // 모금액 합계
    int nth = 0;  // 회차
    
    while(total <= goal) {
      total += money;
      nth++;
      System.out.println(nth + "회" + "모금액" + money + "원" + "현재 모금액" + total + "원");
      
      
      
      
    }
    
        
    
  }
  
  public static void ex03() {
    // 전체 구구단 출력하기 - 1
    // 2 x 1 = 2
    // ...
    // 9 x 9 = 81
    // 고정 값 : 바깥 LOOP에 배치
    
    for(int a = 2; a <= 9; a++) {
       for(int b = 1; b <= 9; b++) {
        
         
         
         System.out.println( a + " * " + b + "=" + a * b);
       }
       
      
  }
   
  
  
  }
  
  public static void ex04() {
    // 전체 구구단 출력하기 - 2
    // 2x1=2  3x1=3  4x1=4  ... 9x1=9
    // ...
    // 2x9=18 3x9=27 4x9=36 ... 9x9=81
    
    for(int n = 1; n <= 9; n++) {
      for(int dan = 2; dan <= 9; dan++) {
        System.out.print(dan + " X " + n + "=" + String.format("%-4d", (dan * n)));
      }
      System.out.println(); //줄 바꿈 
     
      
    }
    
    // 참고할코드
    //System.out.print("2x1=2");  // 2x1=2를 출력한 뒤 줄을 바꾸지 않는다.
   
  }
  
  public static void ex05() {
    // 삼각별 출력하기 - 1 (2중 loop)
    //     b=12345 
    // a=1   *
    // a=2   **
    // a=3   ***
    // a=4   ****
    // a=5   *****
    // a=1, star=1~1
    // a=2, star=1~2
    // a=3, star=1~3
    // a=4, star=1~4
    // a=5, star=1~5
    
    
   
    
    for(int a = 1; a <= 5; a++) {
      for(int b = 1; b <= a; b++) {
        
        System.out.print("*");
        
      }
      System.out.println();
      
    }
    
    
    
    // 참고할 코드
     // *를 출력한 뒤 줄을 바꾸지 않는다.
       // 줄 바꾸기
    
  }
  
  public static void ex06() {
    // 삼각별 출력하기 - 2 (2중 loop)
    //     b=12345
    // a=1   *****
    // a=2   ****
    // a=3   ***
    // a=4   **
    // a=5   *

    
    for(int a = 1; a <= 5; a++) {
      for(int b = 5; b >= a; b--) { //위에 식에서 6-a로 가능
        
        System.out.print("*");
        
      }
      System.out.println();
      
    }
    
    
    
    
  }
  
  public static void ex07() {
    // 삼각별 출력하기 - 3 (2중 loop)
    //     space/star=123456789
    //row=1               *
    //row=2              ***
    //row=3             *****
    //row=4            *******
    //row=5           *********
    //
    // row=1, space=1~4, star=5~5
    // row=2, space=1~3, star=4~6
    // row=3, space=1~2, star=3~7
    // row=4, space=1~1, star=2~8
    // row=5, space=1~0, star=1~9
    
    for(int row = 1; row<= 5; row++) {
      for(int space=1; space<= 5-row; space++) {
        
        System.out.print(" ");        
      }
      
      for(int star= 6-row; star<=row + 4; star++) {
        System.out.print("*");
      }
        
      System.out.println();
      
    }
    
    
    
    
  }
  
  public static void ex08() {
    // 삼각별 출력하기 - 4 (2중 loop)
    //     space/star=123456789
    // row=1          *********
    // row=2           *******
    // row=3            *****
    // row=4             ***
    // row=5              *
    // row=1, space=1~0, star=1~9
    // row=2, space=1~1, star=2~8
    // row=3, space=1~2, star=3~7
    // row=4, space=1~3, star=4~6
    // row=5, space=1~4, star=5~5
    
    for(int row = 1; row<= 5; row++) {
      for(int space=1; space<= row-1; space++) {
        
        
        System.out.print(" ");
        
      }
      for(int star= row; star<= 10 - row ; star++) {
        System.out.print("*");
      }
        
      System.out.println();
      
    }
 
    
  }
  
  
 
  
  
  public static void main(String[] args) {
    


    //ex01();
    //ex02();
    //ex03();
    //ex04();
    //ex05();   
    //ex06();
    //ex07();
    ex08();
  
  
  }
  
  
  
  
  
  
}
