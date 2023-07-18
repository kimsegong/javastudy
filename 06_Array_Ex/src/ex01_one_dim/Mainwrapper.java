package ex01_one_dim;

import java.util.Arrays;

public class Mainwrapper {

  
  public static void ex01() {
    // 월에 따른 계절    월 % 12
    // 3 ~ 5 : 봄        3 ~ 5
    // 6 ~ 8 : 여름      6 ~ 8
    // 9 ~ 11: 가을      9 ~ 11
    // 12 ~ 2: 겨울      0 ~ 2
    int month = 12;
    String[] seasons = {"겨울", "봄", "여름", "가을"};
    // 코드 1줄로 해결할 것
   
    System.out.println(month + "월은" + seasons[month % 12/3] + "계절입니다.");
    
    }


  public static void ex02() {
    // 10, 20, 30, 40, 50을 배열 a에 저장하고 출력하기
    // 배열 a: [10, 20, 30, 40, 50]
    int[] a = {10, 20, 30, 40, 50};
    // 배열과 인덱스 외 변수 사용 금지 //a[i] = (i + 1) * 10
   
    for(int i = 0; i < a.length; i++) {
     
     
      System.out.println("배열 a : " + Arrays.toString(a));
      }
  
  }
  
  public static void ex03() {
    // 'A', 'B', 'C', ...'Z'를 배열 a에 저장하고 출력하기
    // 배열 a: [A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z]
    char[] a = new char[26];
    char ch = 'A';
   for(int i = 0; i < a.length; i++) {
     a[i] =(char)(ch + i);
   }
   System.out.println("배열 a : " + Arrays.toString(a)); 
    
    
  }
  
  public static void ex04() {
    // 배열 a의 마지막 3개 요소 0을 배열 b의 요소로 바꾸기
    // 배열 a: [10, 20, 30, 40, 50, 60]
    int[] a = {10, 20, 30, 0, 0, 0};
    int[] b = {40, 50, 60};
    
    
    System.arraycopy(b, 0, a, 3, b.length);
    
    
   
   
    for(int i = 0; i < b.length; i++) {
      a[3 + i] = b[i];
      
     
    }
    System.out.println("배열 a : " + Arrays.toString(a)); 
    } 
 
  
  public static void ex05() {
    // 10진수(int number)를 2진수(int[] binary)로 변환하기
    // 10진수 35 = 2진수 0000100011
    int number = 35;             //  35를 2진수로 변환하면 아래와 같다.
                                 // ┌------------------------------------------------┐
    int[] binary = new int[10];  // │ 0 │ 0 │ 0 │ 0 │ 1 │ 0 │ 0 │ 0 │ 1 │ 1 │
                                 // └------------------------------------------------┘
    
    System.out.println("10진수 " + number + "= 2진수");
    int i = 9;
    while(number != 0) { // while(number > 0)
  
      binary[i--] = number % 2;
      number /= 2;       //number = number / 2;
    }
    for(int j = 0; j < binary.length; j++) {
      System.out.print(binary[j]);
    }
    
  }
  
  public static void ex06() {
    // 배열에 저장된 점수의 평균, 최댓값, 최솟값 구하기
    // 평균: 84.8점
    // 최대: 100점
    // 최소: 70점
    String[] name = {"미희", "정숙", "영철", "상철", "옥자"};
    int top = 0;     // 1등의 인덱스
    int bottom = 0;  // 5등의 인덱스
    int[] score = {100, 70, 95, 83, 76};
    int total = score[0];  // 합계(평균을 구할 때 필요한 변수)
    int max = score[0];  // 최댓값
    int min = score[0];  // 최솟값
    
    
    
    for(int i = 0 ; i < score.length; i++) {
     
        total += score[i];    
        top = i;
    }for(int j = 1; j < score.length; j++) {
      if(score[j] > max) 
        max = score[j];  
        
      else if(score[j] < min);{
        min = score[j];
        bottom = j;
      }
    }
 
    float average =  total / (float)score.length;
    
      
    
    
    
    
    System.out.println("평균 : " +  average);
    System.out.println("최댓값 : " +  max);
    System.out.println("최솟값 : " +  min);
    System.out.println("1등 : " +  name[top]);
    System.out.println("5등 : " +  name[bottom]);
      
    
  }
  

  
  public static void main(String[] args) {
    
    
   // ex01();
    //ex02();
    //ex04();
    //ex06();
    //ex05();
    //ex03();
    ex06();
  }

}
