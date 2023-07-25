package ex04_Chair;

public class Alba extends Student{

  private String work;
  
  public Alba() {   
  }
  public Alba(String name, String school, String work) {
    super(name, school); // public Student(String name, String school) {} 생성자 호출
    this.work = work;
  }
  public String getWork() {
    return work;
  }
  public void setWork(String work) {
    this.work = work;
  }
  @Override
  public void info() {
    super.info();  // 슈퍼클래스의 info -> Student클래스의 info
    System.out.println("직장:" + work);
  }
}
