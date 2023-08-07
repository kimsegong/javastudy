package ex04_supplier;

import java.util.function.Supplier;

public class Point {
  
  public Point() {
  }
  public void confirmPoint(Supplier<Integer> supplier) {
    System.out.println("획득 포인트:" + supplier.get());
  }
  public static void main(String[] args) {
    
    Point point = new Point();
    point.confirmPoint(() -> (int)(Math.random() * 10));  // 람다 표현식을 Supplier 파라미터로 전달
  }
}
