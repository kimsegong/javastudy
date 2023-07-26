package ex10_Walkable;

public class Food {

  private String name;

  public Food (String name) {
    this.name = name;
  }
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  @Override
  public String toString() {
    return "Food [name=" + name + "]";
  }
  
  
}
