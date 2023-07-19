package ex05_access_modifier;

public class MainWrapper {

  public static void main(String[] args) {
    
    User u = new User();
    
    u.setId("admin");
    System.out.println(u.getId());
    

  }

}
