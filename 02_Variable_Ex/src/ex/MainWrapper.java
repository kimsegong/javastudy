package ex;

public class MainWrapper {

  public static void main(String[] args) {
    
    // 초 -> 분/초
    int second = 90;
    int m = 1;  // 1
    int s = 30;  // 30

    System.out.println(m + "분" + s + "초");
    
    // x와 y값을 교환
    int x = 10;
    int y = 20;
    int temp;
    
     temp = y;
     y = x;
     x =temp;
             
    
    System.out.println(x);
    System.out.println(y);
    
    
        
    // 5% 이자는 얼마?(소수 이하는 버림)
    long balance = 123456L;  // 통장잔액
    double pct = 0.05;  // 5%
   
    balance *= (1+pct);
    System.out.println(balance);
    System.out.println((int)(balance * pct) + balance + "원");
    
    
    // 90점대 점수이면 true, 아니면 false
    int score1 = 95;
    double result1 = 0;  // true
    int score2 = 75;
    double result2 = 0;  // false

    String result = (score1 >= 90) ? "true" : "false";
    String result3 = (score2 >= 90) ? "true" : "false";
    
    
    System.out.println(result);
    System.out.println(result3);
    
         

    // n의 "짝수", "홀수" 여부 출력
    int n = 3;
    String res1 = (n % 2) == 0 ? "짝수" : "홀수";  // "홀수"
   
    
    System.out.println(res1);


    // num의 "짝수", "홀수", "3의배수" 여부 출력
    int num = 3;
    String res2 = (num != 0) && (num % 3) == 0 ? "3의 배수" : (num % 2) == 0 ? "짝수" : "홀수";  // "3의배수"
    
   
    System.out.println(res2);

  }  
  
  
  
  
  
  
  
  
  
  }


