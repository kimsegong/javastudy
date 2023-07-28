package ex04_Student;

import java.util.HashMap;
import java.util.Map;

public class MainWrapper {

  public static void main(String[] args) {
   
    // 교실의 학생 정보를 저장하는 HashMap 만들기
    // key : 학번(예 : 10101)
    // Value : Student 객체
    
    Map<String, Student> clazz = new HashMap<String, Student>();
    
    clazz.put("10101", new Student("가길동", new Exam(100, 100, 100)));
    clazz.put("10102", new Student("나길동", new Exam(90, 90, 90)));
    
    String[] stuNo = {"10101", "10102"};
    for(int i = 0; i < stuNo.length; i++) {
      Student student = clazz.get(stuNo[i]);
      System.out.println("이름 :" + student.getName());
      System.out.println("시험 :" + student.getExam());
    }

    
   
  
  }
  
  public static void ex01() {
    
    
    // 교실의 학생 정보를 저장하는 HashMap 만들기
    // key : 학번(예 : 10101)
    // Value : Student 객체
    Map<Integer, Student> claze = new HashMap<Integer, Student>();
    
    claze.put(10203, new Student("박길동", new Exam(88, 88, 88)));
    
    Student student = new Student();
    
    student.setName("김길동");
    student.setExam(new Exam(99, 99, 99));
    claze.put(10516, student);
    
    
    
    
    
  }

}
