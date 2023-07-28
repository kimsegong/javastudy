package ex04_Student;

public class Exam {

  private int kor;
  private int Eng;
  private int math;
  
  // new Exam(100, 100, 100)
  public Exam(int kor, int eng, int math) {
    super();
    this.kor = kor;
    Eng = eng;
    this.math = math;
  }
  public int getKor() {
    return kor;
  }
  public void setKor(int kor) {
    this.kor = kor;
  }
  public int getEng() {
    return Eng;
  }
  public void setEng(int eng) {
    Eng = eng;
  }
  public int getMath() {
    return math;
  }
  public void setMath(int math) {
    this.math = math;
  }
  @Override
  public String toString() {
    return "Exam [kor=" + kor + ", Eng=" + Eng + ", math=" + math + "]";
  } 
}
