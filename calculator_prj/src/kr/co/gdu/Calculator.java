package kr.co.gdu;

/**
 * 덧셈, 뺄셈, 곱셈, 나눗셈 기능을 제공하는 계산기 클래스
 * 
 * 
 * @author 콩이엄마
 * @since 2023.07.19
 * @version 1.0.0
 *
 */
public class Calculator {
  
  /**
   * 
   * 실수 2개를 전달 받아서 그 합을 반환하는 메소드
   * 
   * @param a 실수
   * @param b 실수
   * @return 파라미터 2개를 더한 결과
   * 
   */
  public double addition(double a, double b) {
    return a + b;
  }
  /**
   * 실수 2개를 전달 받아서 뺀 값을 반환하는 메소드
   * @param a 실수
   * @param b 실수
   * @return 파라미터 2개를 뺀 결과
   */
  public double substraction(double a, double b) {
    return a - b;
  }
  /**
   * 실수 2개를 전달 받아서 나눈 값을 반환하는 메소드
   * @param a 실수
   * @param b 실수
   * @return  파라미터 2개를 나눈 결과
   */
  public double multiplication(double a, double b) {
    return a / b;
  }
  /** 
   * 실수 2개를 전달 받아서 곱한 값을 반환하는 메소드
   * @param a 실수
   * @param b 실수
   * @return 파라미터 2개를 곱한 결과
   */
  public double division(double a, double b) {
    return a * b;
  }
}
