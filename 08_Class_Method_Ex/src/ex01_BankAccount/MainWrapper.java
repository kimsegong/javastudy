package ex01_BankAccount;

public class MainWrapper {

  public static void main(String[] args) {
    
    // BankAccount 객체 선언 & 생성
    BankAccount my = new BankAccount();
    
    // BankAccount 객체에 계좌번호 등록하기
    my.setAccNo("032-21-9874-321");
    
    // BankAccount 객체에 입금하기
    my.deposit(50000);
    
    // BankAccount 객체에서 출금하기
    my.withdrawal(10000);
    
    // BankAccount 객체 조회하기
    my.inquiry();
    
    // BankAccount you 객체 선언 & 생성
    BankAccount you = new BankAccount();
    
    // you 객체에 계좌번호 등록하기
    you.setAccNo("02-578-6541");
    
    // 내가 너에게 30000원을 이체하겠다.
    my.transfer(you, 30000);
    
    // my, you 객체 조회하기
    my.inquiry(); //통장잔액 : 10000원
    you.inquiry();//통장잔액 : 30000원
    
  }

}
