package ex05_upcasting;

// 학교 다니는 알바생

public class Alba extends Student {

  private String work; 
  public Alba() {
    super();
  }
  public Alba(String name, String school, String work) {
    super(name, school);
    this.work =work;
  }
  public String getWork() {
    return work;
  }
  public void setWork(String work) {
    this.work = work;
  }
  @Override
  public void working() {
    System.out.println("일함");
  }
  @Override
  public void info() {
    System.out.println("이름" + getName());
    System.out.println("학교" + getSchool());
    System.out.println("직장" + work);
  }
  
}
