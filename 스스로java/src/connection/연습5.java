package connection;


public class 연습5 {

  public static void ex01() {
 int sum = 0;
    
    for(int i = 0; i <= 20; i++) {
      
      if(i%2 != 0 && i%3 != 0) {
        sum += i;
      }    
    }
    System.out.println(sum);
  }
  static public void ex02() {
    
    int sum = 0;
    int sumTotal = 0;
    
    for(int i = 0; i <= 10; i++) {
      
      sum += i;
      sumTotal += sum;
    }
    System.out.println(sumTotal);
  }
  static public void ex03() {
    for(int i = 1; i <= 6; i++) {
      for(int j = 1; j <= 6; j++) {
        if(i + j == 6) 
          System.out.println(i+ "+" + j + "=" + (i + j));
              
      }
    }
  }
  public static void ex04() {
    
    
    int value = (int) (Math.random() * 6) + 1;
    
    System.out.println("value:" + value);
    
  }
  public static void ex05() {
    
  for(int x = 0; x <= 10; x++) {
    for(int y = 0; y <=10; y++) {
      if(2*x + 4*y == 10)
        System.out.println("x" + "=" + x + "y" + "=" + y);
        
    }
  }
  }
  public static void ex06() {
    
    String str = "12345";
    int sum = 0;

    for(int i = 0; i < str.length(); i++) {
      
      
    }
    System.out.println("sum=" + sum);
  }
  static class SutdaCard{
    int num;
    boolean isKwang;
    public SutdaCard() {
      this(1, true);
    }
    public SutdaCard(int num, boolean isKwang) {
      
      this.num = num;
      this.isKwang = isKwang;
    }
    public String info() {
      return num + (isKwang ? "k" : "");
    }
  }
  static class Student{
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    
    public int getTotal() {
      return  kor + eng + math;
      
    }
    public double getAverage() {
      return (double)( kor + eng + math)/3;
    }
  }
  public static void main(String[] args) {
   // ex06();
//    SutdaCard card1 =  new SutdaCard(3, false);
//    SutdaCard card2 =  new SutdaCard();
//    
//    System.out.println(card1.info());
//    System.out.println(card2.info());
    Student s = new Student();
    s.name = "홍길동";
    s.ban = 1;
    s.no = 1;
    s.kor = 100;
    s.eng = 60;
    s.math = 76;
    
    System.out.println("이름:" + s.name );
    System.out.println("총점:" + s.getTotal());
    System.out.println("평균:" + s.getAverage());
    

}
  
}
