package ex;

import java.util.Arrays;

public class MainWrapper3 {

  public static void ex01(int[] a) {
    
    System.out.println(Arrays.toString(a));
    a[0] = 100;
    System.out.println("ex01의 배열 a = " +Arrays.toString(a));
    
  }
  public static void main(String[] args) {
    int[] a = {10,20,30};
    ex01(a);
System.out.println("main 의 배열 a = " + Arrays.toString(a));
  }

}
