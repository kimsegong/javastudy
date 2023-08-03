package ex02_delete;

import java.io.File;
import java.io.IOException;

public class MainWrapper {

  public static void ex01() {
    
    // C:/2023 디렉터리를 삭제하시오.
    // 비어있는 디렉터리만 삭제할 수 있다.   
     new File("C:/2023/08/03/15").delete(); 
     new File("C:/2023/08/03").delete(); 
     new File("C:/2023/08").delete(); 
     new File("C:/2023").delete(); 
      // 디렉터리가 없으면 만들기
  }
  public static void ex02() {
    
    File dir = new File("C:/storage");
    File[] files = dir.listFiles();
    if(files != null) {
      for(File file : files) {
        System.out.println(file.getPath() + "파일삭제");
        file.delete();
      }
    }
    dir.delete(); 
  }
  public static void main(String[] args) {
    ex02();
    
   
    }
}
