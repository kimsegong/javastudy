package ex05_access_modifier;

public class MainWrapper {

  public static void main(String[] args) {
    
    //클래스 이름 으로 객체 생성 USer
    User u = new User();
    
    u.setId("admin");
    System.out.println(u.getId());
    
    
    
    u.setAge(1000);   
    System.out.println(u.getAge());

  }

}
