package ex04_Student;

import java.util.HashMap;
import java.util.Map;

public class MainWrapper {

  public static void main(String[] args) {
   
    // 교실의 학생 정보를 저장하는 HashMap 만들기
    // key : 학번(예 : 10101)
    // Value : Student 객체
    
    Map<String, Object> student = new HashMap<String, Object>();
    
    student.put("name", "홍길동");
    student.put("학번", "10101");
    student.put("점수", "100");
    
    System.out.println(student.get("name"));

  }

}
