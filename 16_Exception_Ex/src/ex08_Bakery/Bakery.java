package ex08_Bakery;

import java.util.HashMap;
import java.util.Map;

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
   * @throws RuntimeException 빵이부족, 잔돈이 부족, 돈을 안냄, 돈이 부족함
   * 
   */
  public Map<String, Integer> sell(int count, int money)throws RuntimeException {   
    
    // 0이하의 빵을 요청했다.
    if(count <= 0) {
      throw new RuntimeException("판매불가합니다.");
    }
    // 빵이 부족하다.
    if(this.count < count) {
      throw new RuntimeException("판매 불가합니다.(빵이부족하다)");
    }
    // 잔돈이 부족하다.
    if(this.money < money - count * PRICE) {
      System.out.println("판매 불가합니다.(잔돈이 부족하다.)");
      return null;
    }
    // 고객이 돈을 안 냈다.
    if(money <= 0) {
      throw new RuntimeException("판매불가(돈을 안냈다)");
    }     
    // 고객이 낸 돈이 모자르다.
    if(PRICE * count > money) {
      throw new RuntimeException("판매불가합니다.(돈이모자름)");
    }    
    // 판매 처리
    this.count -= count;
    this.money += count * PRICE;   
    // 고객에게 반환할 Map 생성 
    Map<String, Integer> map = new HashMap<String, Integer>();
    map.put("bread", count);
    map.put("change", money * count * PRICE);
 
    // 고객에게 빵과 잔돈반환
    return map;
  
}
  
}
