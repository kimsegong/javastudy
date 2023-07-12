package ex02_convert_type;

public class MainWrapper {
  
  public static void main(String[] args) {
    
    /*
     * 자동 변환(promotion)
     * 1. 작은 크기 -> 큰 크기
     * 2. 정수 -> 실수
     */
  
    byte num1 = 127; // byte는 -128~127 가능
    int num2 = num1; //1바이트 크기를 가진 num1을 4바이트 크기로 변환
    System.out.println(num2); 
    
    /*
     강제 변환(casting)
     1. 큰 크기 -> 작은크기
     2. 실수 -> 정수
     */
    int bigNum = 256;
    byte smallNum = (byte)bigNum;
    System.out.println(smallNum);
    
    
   /*
    * 구문 분석(parsing)
    * 1. 문자열 -> 정수(int, long)
    * 2. 문자열 -> 실수(double)
    */
    
    
    String strScore = "100";
    int score = Integer.parseInt(strScore);
    
    String strMoney = "10000000000000";
    long money = Long.parseLong(strMoney);
    
    String strPct = "0.5";
    double Pct = Double.parseDouble(strPct);
    
    System.out.println(strScore);
    System.out.println(strPct);
    System.out.println(strMoney);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  }
  

}
