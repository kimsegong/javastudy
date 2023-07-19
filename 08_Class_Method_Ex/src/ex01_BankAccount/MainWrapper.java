package ex01_BankAccount;

public class MainWrapper {

  public static void main(String[] args) {
    
    // BankAccount 객체 선언 & 생성
    BankAccount acc = new BankAccount();
    
    // BankAccount 객체에 계좌번호 등록하기
    acc.setAccNo("032-21-9874-321");
    
    // BankAccount 객체에 입금하기
    acc.deposit(50000);
    
    // BankAccount 객체에서 출금하기
    acc.withdrawal(10000);
    
    // BankAccount 객체 조회하기
    acc.inquiry();
  }

}
