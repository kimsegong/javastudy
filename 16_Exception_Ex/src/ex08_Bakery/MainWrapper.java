package ex08_Bakery;

public class MainWrapper {

  public static void main(String[] args) {
   
    try {
    Bakery bakery = new Bakery(100, 10000); //빵이 100개, 빵 가격 1000원, 빵집에 10000원있음
    Customer customer = new Customer(10000);  //10000원을 가진 고객
    
    customer.buy(bakery, 10000, 0); //bakery 빵 3개 구매를 위해서 10000원을 냈다.
    
    System.out.println("빵집 money :" + bakery.getMoney() + "원");
    System.out.println("빵집 빵 :" + bakery.getCount() + "개");
   
    System.out.println("고객 money :" + customer.getMoney() + "원");
    System.out.println("고객 빵 :" + customer.getCount() + "개");
    }catch(RuntimeException e) {
      System.out.println(e.getMessage());
    }
  }

}
