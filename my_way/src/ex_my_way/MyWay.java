package ex_my_way;

public class MyWay {
 

  public static void main(String[] args) {
    
    for(int i =1; i <= 5; i++) {
      System.out.println("**********");
    }
    
    
    
    ex01();
  }

  public static void ex02() {
    
    
    
    
    
    
    
    
    
    
    
  }   
  
  
public static void ex01() {
  
  int sum = 0;
  float average = 0f;
  
  int[] score = {100, 88, 100, 100, 90};
  
  for (int i = 0; i < score.length; i++) {
    sum += score[i];
  }
  
  average = sum / (float)score.length;
  
System.out.println("총합 :" + sum + "입니다.");
System.out.println("평균 :" + average + "입니다.");
  //총합을 나타내는 결과식

  
  
  
  
  
}






}