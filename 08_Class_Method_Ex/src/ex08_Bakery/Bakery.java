package ex08_Bakery;

public class Bakery {

  private int count; //빵이 몇개있는가
  public final int PRICE = 2000; //얼마인가
  private int money; //빵집에 돈이 얼마있는가
  
  public Bakery (int count, int money) {
    this.count = count;
    this.money = money;
  }
  public void setCount(int count) {
    this.count = count;    
  }
  public void setMoney(int money) {
    this.money = money;    
  }  
  public int getCount() {
    return count;
  }
  public int getMoney() {
    return money;
  }
  /**
   * 판매 메소드<br>
   * 고객으로 부터 구매할 빵의 갯수와 돈을 전달 받아서 판매한다.
   * @param count 구매할 빵의 갯수
   * @param money 빵을 사려고 내는 돈
   * @param 빵과 잔돈
   * 
   */
  public BreadChange sell(int count, int money) {   
    // 빵이 부족하다.
    if(this.count < count) {
      System.out.println("판매 불가합니다.(빵이부족하다)");
      return null;
    }   
    // 고객이 돈을 안 냈다.
    if(money <= 0) {
      System.out.println("판매불가");
      return null;
    }     
    // 고객이 낸 돈이 모자르다.
    if(PRICE * count > money) {
      System.out.println("판매불가합니다.(돈이모자름)");
      return null;
    }    
    // 판매 처리
    this.count -= count;
    this.money += count * PRICE;   
    // 고객에게 반환할 BreadChange 객체 생성 
    BreadChange bc = new BreadChange(count, money - count * PRICE);   
    // 고객에게 빵과 잔돈반환
    return bc;
  
}
  
}
