package ex02_two_dim;

public class Mainwrapper {

  /*
   * 2차원배열
   * 1. 1차원 배열이 2개이상 모인 자료 구조이다.
   * 2. 행과 열의 집합인 테이블 구조로 이해하면 쉽다.
   * 3. 사용하는 인덱스가 2개이다.
   * 4. 2차원 배열의 순회에는 2개의 for문이 필요하다.    
   */
   
  public static void ex01() {
    
    //2차원 배열의 선언
    int[][] a;
    
    //2차원 배열의 생성 
    a = new int[3][2]; //테이블 구조로 이해하면 : 3행 2열
                       //실제 구조로 이해 : 길이가 2인 1차원 배열이 3개
     
    //테이블 형대로 2차원 배열 출력
    System.out.println(a[0][0] + " " + a[0][1]); //첫번째행(첫번째 1차원 배열)
    System.out.println(a[1][0] + " " + a[1][1]); //두번째행(두번째 1차원 배열)
    System.out.println(a[2][0] + " " + a[2][1]); //세번째행(세번째 1차원 배열)
    
    
  }

  public static void ex02() {
    
    //2차원 배열의 선언 & 생성
    int[][] a = new int[3][2];
    
    // 각 요소를 4자리 고정 폭으로 출력
    System.out.print(String.format("%4d", a[0][0]));
    System.out.print(String.format("%4d", a[0][1]));
    System.out.println();
    System.out.print(String.format("%4d", a[1][0]));
    System.out.print(String.format("%4d", a[1][1]));
    System.out.println();
    System.out.print(String.format("%4d", a[2][0]));
    System.out.print(String.format("%4d", a[2][1]));
    System.out.println();
 
    
  }
  
  public static void ex03() {
    
   //2차원 배열 선언 & 생성
    int[][] a =new int[3][2];
    
    // 인덱스 : i, j
    // 1)i : 행 or 1차원 배열의 갯수
    // 2)j : 열 or 각 1차원 배열의 길이
    
    //2차원 배열과 2중 for문
    for(int i = 0; i < 3; i++) {
      for(int j = 0; j < 2; j++ ) {
        System.out.print(String.format("%4d", a[i][j]));
      }
      System.out.println();
    }
    
  }
  
  /*
   * 2차원 배열의 초기화
   * 
   * int[][] a = {
   *    {10, 20 },
   *    {30, 40 },
   *    {50, 60 }
   *  };
   * 
   */
  public static void ex04() {
    
   int[][] a = {
       {10, 20},
       {30, 40},
       {50, 60}
   };   
    //2중 for문
   for(int i = 0; i < 3; i++) {
     for(int j = 0; j < 2; j++) {
       System.out.print(String.format("%4d", a[i][j]));
     }
     System.out.println();
   }
  }
  /*
   * 2차원 배열의 구조
   */
  
  public static void ex05() {
    
    //2차원 배열의 선언 & 생성
    int[][] a = {
        {10, 20},
        {30, 40},
        {50, 60}
    };
    //2차원 배열의 2중 for문 final 버전
    for(int i = 0; i < a.length; i ++) {
      for(int j =0; j < a[i].length; j++) {
        System.out.print(String.format("%4d", a[i][j]));
      }
      System.out.println();
    }
  
  }
  
 public static void ex06() {
   
   //모든 열의 갯수가 동일할 필요는 없다.
   
   //2차원 배열의 초기화
   int[][] a = {
       {10},
       {20, 30},
       {40, 50, 60}
   };
   for(int i = 0; i < a.length; i ++) {
     for(int j =0; j < a[i].length; j++) {
       System.out.print(String.format("%4d", a[i][j]));
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
    ex06();

  }

}
