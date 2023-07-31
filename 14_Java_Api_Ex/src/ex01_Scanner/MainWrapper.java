package ex01_Scanner;

import java.util.Scanner;

public class MainWrapper {
  
  // 문제1. Scanner 클래스의 next() 메소드를 이용해서 사용자로부터 문자열을 계속 입력 받는다.
  // 사용자가 "exit" 문자열을 입력하면 더 이상 입력 받지 않는다.
  // 총 몇 번만에 종료되었는지 그 횟수를 마지막에 출력한다.
  // 실행예시)
  // 문자열 입력 >>> apple
  // 문자열 입력 >>> exit
  // 2번만에 exit가 입력되었다.
  public static void ex01() {
    Scanner sc = new Scanner(System.in);
    int count = 0;
    while (true) {
    System.out.print("문자열 입력 >>>");
    String blank = sc.next(); 
    if (blank.equals("exit")) {
      count++;
      break;
    }
    count++;
    System.out.println("입력한 값이" + blank);  
  }
  

  
}

  // 문제2. "대한민국의 수도는?" 퀴즈 정답을 맞힐때까지 계속 퀴즈를 내시오.
  // "서울", "seoul", "Seoul", "SEOUL" 등을 정답으로 처리하시오.
  // 실행예시)
  // 대한민국의 수도는? >>> 인천
  // 오답입니다.
  // 대한민국의 수도는? >>> 영국
  // 오답입니다.
  // 대한민국의 수도는? >>> 서울
  // 정답입니다.
  public static void ex02() {
    Scanner sc = new Scanner(System.in);
    int count = 0;
    while (true) {
    System.out.print("대한민국의 수도는? >>>");
    String blank = sc.next(); 
    if (blank.equals("서울")) {
      count++;
      break;
    }
    count++;
    System.out.println("입력한값이" + blank); 
  }
 }

  // 문제3. 평점 입력 받아서 해당 평점만큼 ★을 출력하시오.
  // 평점은 1 ~ 5 사이 정수로 입력 받는데, 벗어난 범위는 다시 입력 받는다.
  // 실행예시)
  // 평점(1~5) 입력 >>> 9
  // 평점(1~5) 입력 >>> -1
  // 평점(1~5) 입력 >>> 3
  // ★★★
  public static void ex03() {
    Scanner sc = new Scanner(System.in);
    int count = 0;
    while (true) {
      System.out.print("평점(1~5) 입력 >>>");
      int blank = sc.nextInt(); 
      if(blank == 1 ) {
        System.out.println("★");
        break;
      }else if(blank == 2) {
        System.out.println("★★");
        break;
      }else if(blank == 3) {
        System.out.println("★★★");
        break;
      }else if(blank == 4) {
        System.out.println("★★★★");
        break;
      }else if(blank == 5) {
        System.out.println("★★★★★");
        break;
      }
      count++;
      System.out.println("입력한값이" + blank);
    }
    
    
  }
  
  // 문제4. 비밀번호는 "1234"이다.
  // 사용자로부터 비밀번호를 입력 받아서 "1234"와 같으면 "성공", "1234"가 아니면 다시 비밀번호를 입력 받도록 처리하시오.
  // 비밀번호 입력은 최대 5번으로 제한하고, 5번의 입력이 모두 틀리면 최종적으로 "실패"를 출력하시오.
  // 실행예시1)
  // 비밀번호? >>> 0000
  // 비밀번호? >>> 1111
  // 비밀번호? >>> 2222
  // 비밀번호? >>> 3333
  // 비밀번호? >>> 4444
  // 실패
  // 실행예시2)
  // 비밀번호? >>> 0000
  // 비밀번호? >>> 1234
  // 성공
  public static void ex04() {
    Scanner sc = new Scanner(System.in);
    int count = 0;
    while (true) {
      System.out.print("비밀번호? >>>");
      int blank = sc.nextInt();
      if(blank == 1234) {
        System.out.println("성공");
        break;
      }else {
        count++;
      }
      count++;
      System.out.println("입력한값이" + blank);
    }
   
  }
  
  // 문제5. 4계절이 저장되어 있는 영한 사전(2차원 배열)을 이용하여 문제를 해결하시오. 순서대로 한 번씩만 물어보는 방식으로 처리하시오.
  // 실행예시)
  // 봄을 영어로 하면? >>> spring
  // 정답
  // 여름을 영어로 하면? >>> sumer
  // 오답
  // 가을을 영어로 하면? >>> fall
  // 정답
  // 겨울을 영어로 하면? >>> win
  // 오답
  public static void ex05() {
    Scanner sc = new Scanner(System.in);
    int count = 0;
    while(true) {
      System.out.println("봄을 영어로 하면? >>>");
      String blank = sc.next();
      if(blank.equals("spring")) {
        System.out.println("정답");
        break;
      }else {
        System.out.println("오답");
      }
      
    }
    while(true) {
      System.out.println("여름을 영어로 하면? >>>");
      String blank = sc.next();
      if(blank.equals("summer")) {
        System.out.println("정답");
        break;
      }else {
        System.out.println("오답");
      }
      
    }
    while(true) {
      System.out.println("가을을 영어로 하면? >>>");
      String blank = sc.next();
      if(blank.equals("fall")) {
        System.out.println("정답");
        break;
      }else {
        System.out.println("오답");
      }
      
    }
    while(true) {
      System.out.println("겨울을 영어로 하면? >>>");
      String blank = sc.next();
      if(blank.equals("winter")) {
        System.out.println("정답");
        break;
      }else {
        System.out.println("오답");
      }
      
    }
    
  }
  
  public static void main(String[] args) {
    //ex01();
    //ex02();
    //ex03();
    //ex04();
    ex05();
  }

}