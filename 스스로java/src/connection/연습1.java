package connection;

public class 연습1 {

  
  String name = "콩";
  int age = 7;
  

public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public int getAge() {
    return age;
  }


  public void setAge(int age) {
    this.age = age;
  }


public static void main(String[] args) {
  
  연습1 a = new 연습1();
  
  System.out.println(a.getName());
  
}
    
}
