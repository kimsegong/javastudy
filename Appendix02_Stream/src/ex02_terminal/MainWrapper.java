package ex02_terminal;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainWrapper {

  public static void ex01() {
    
    // 통계 계산
    
    // IntStream iStream = IntStream.range(1, 6);  // 1,2,3,4,5
    
    System.out.println("합계:" + IntStream.range(1, 6).sum());
    System.out.println("평균:" + IntStream.range(1, 6).average().getAsDouble());
    System.out.println("개수:" + IntStream.range(1, 6).count());
    System.out.println("최대:" + IntStream.range(1, 6).max().getAsInt());
    System.out.println("최소:" + IntStream.range(1, 6).min().getAsInt());
  }
  public static void ex02() {
    
    // Stream -> List 
    
    // Stream
    Stream<String> stream = Stream.of("봄", "여름", "가을", "겨울");
    
    // Stream -> List
    List<String> list = stream.collect(Collectors.toList());
    System.out.println(list);
  }
  public static void main(String[] args) {
    ex02();

  }

}
