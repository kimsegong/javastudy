package ex01_BankAccount;

public class MainWrapper {

  public static void main(String[] args) {
   
 
    try {      
    BankAccount acc = new BankAccount(10000, "1234");
    BankAccount you = new BankAccount(10000, "5678");
    acc.deposit(10000);
    you.withdrawal(5000);
    acc.transfer(you, 1 );
    acc.inquiry();
    you.inquiry();
    } catch(RuntimeException e) {
      System.out.println(e.getMessage());
    }
  }

}
