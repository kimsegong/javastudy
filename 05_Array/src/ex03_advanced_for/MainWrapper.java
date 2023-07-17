package ex03_advanced_for;

import java.util.Arrays;

public class MainWrapper {

  
  //1차원 배열의 advanced-for문 
  public static void ex01() {
    
    //1차원 배열의 초기화
    int[] a = {10, 20, 30};
  
    // advanced-for (단순 조회할때 좋음)
    // for(배열요소를 저장할변수 : 배열명)
    for(int number : a) {
      System.out.println(number);
    }
        
  
  }  
  
  //advanced-for문을 사용하지 못하는 대표적인 경우 : 배열요소의 값이 변하는 경우
  public static void ex02() {
    
    int[] a = {10, 20, 30};
    
    //모든 배열요소를 1씩 증가시키기 - 1 : advanced-for문 (불가능)
    //for(int number : a) {
     // number++;
      
    //}
    // 모든 배열요소를 1씩 증가시키기 - 2 : 일반 for문 (가능)
    for(int i = 0; i < a.length; i++) {
      a[i]++;
    }
    // 배열요소 확인
    System.out.println(Arrays.toString(a));  
    
  }
 
  //2차원 배열의 advanced-for문
  public static void ex03() {
    
    //2차원 배열의 초기화
    int[][] a = {
        {10,20},
        {30,40},
        {50,60}        
    };
    
    //advanced-for
    for(int[] b : a) {
      for(int number : b) {
        System.out.print(String.format("%4d", number));
      }
      System.out.println();
    }  
    
  }
  
  public static void main(String[] args) {
   //ex01();
   //ex02();
    ex03();
  
  }

}
