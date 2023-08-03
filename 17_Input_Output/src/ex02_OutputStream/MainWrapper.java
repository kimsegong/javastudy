package ex02_OutputStream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainWrapper {

  /*
   * java.io.OutputStream
   * 1. 바이트 기반의 출력 스트림이다. (바이트를 읽거나 들어오거나 스트림으로 사용)
   * 2. 출력 단위
   *    1) int
   *    2) byte[ ] 
   */
  public static void ex01() {
    
    // 디렉터리를 File 객체로 만들기
    File dir = new File("C:/storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    
    // 파일을 File 객체로 만들기
    File file = new File(dir, "ex01.dat");  // 데이터를 내보낼때 파일로 만들어서 내보낸다
    
    // 파일출력스트림 선언
    FileOutputStream fout = null;
    
    try {
    // 파일출력스트림 생성 (반드시 예외처리가 필요한 코드)
    fout = new FileOutputStream(file);   // 출력스트림 목적지가 file로 출력할것이다 그쪽으로 데이터를 보낼것이다
    
    // 출력할 데이터(파일로 보낼 데이터)
    int c = 'A';             // int  단위 4바이트
    String s = "pple";   
    byte[] b = s.getBytes();  //String을 byte로 바꿔주는 메서드   
    
    // 출력(파일로 데이터 보내기)
    fout.write(c); 
    fout.write(b); 
    } catch(IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if( fout != null) {   // fout이 만들어지지못하고 nullpointexception뜰것을 예방
          fout.close(); // 출력스트림은 반드시 닫아줘야함(반드시 예외 처리가 필요한 코드)
        }
      } catch(IOException e) {
        e.printStackTrace();
      }
      
    }
    System.out.println(file.getName() + "파일 크기 :" + file.length() + "바이트");  //getParent는 폴더, path는 경로랑 파일다
  }
  public static void ex02() {                                                 
    
    // C:\storage\ex02.dat  파일로 안녕하세요 보내기 파일크기확인
    File dir = new File("C:/storage");
    
    File file = new File(dir, "ex02.dat");
    
    FileOutputStream fout = null;
    
    try {
      fout = new FileOutputStream(file);
      
      String s = "안녕하세요";  //한글은 하나당 3바이트
      byte[] b = s.getBytes();
      fout.write(b);
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(fout != null) {
          fout.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    System.out.println(file.getName() + "파일크기:" + file.length() + "바이트");
  }
  public static void ex03() {
    
    /*
     * java.io.BufferedOutputStream 클래스
     * 1. 내부 버퍼를 가지고 있는 출력스트림이다.
     * 2. 많은 데이터를 한 번에 출력하기 때문에 속도 향상을 위해서 사용한다.
     * 3. 보조 스트림이기 때문에 메인 스트림과 함께 사용한다.
     */
    File dir = new File("C:/storage");
    
    File file = new File(dir, "ex03.dat"); 
    // 버퍼 출력스트림 선언 출력속도가 빠르다 속도향상 한번에 내보낸다 하나씩내보내는건 FileOutputStream
    BufferedOutputStream bout = null;
    
    try {
      bout = new BufferedOutputStream(new FileOutputStream(file)); // 파일아웃풋을 만들고 버퍼를 끼운다(추가한다고 생각)
      String s = "안녕하세요 \n 반갑습니다";
      byte[] b = s.getBytes();
      bout.write(b);
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(bout != null) {
          bout.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    System.out.println(file.getName() + "파일크기:" + file.length() +"바이트");
  }
  public static void ex04() {
    
    /*
     * java.io.DataOutputStream 클래스
     * 1. int, double, String 등의 변수를 그대로 출력하는 출력스트림이다.
     * 2. 보조스트림이므로 메인스트림이랑 함께 사용한다.
     */
    File dir = new File("C:/storage");
    
    File file = new File(dir, "ex04.dat"); 
    // 데이터 출력스트림 선언 
    DataOutputStream dout = null;
    
    try {
      dout = new DataOutputStream(new FileOutputStream(file)); 
      String name = "tom";
      int age = 50;
      double height = 180.5;
      String school = "가산대학교";
      
      dout.writeChars(name);
      dout.writeInt(age);
      dout.writeDouble(height);
      dout.writeUTF(school);

    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(dout != null) {
          dout.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    System.out.println(file.getName() + "파일크기:" + file.length() +"바이트");
  }
  public static void ex05() {
    
    /*
     * java.io.ObjectOutputStream 클래스
     * 1. 객체를 그대로 출력하는 출력스트림이다.
     * 2. 직렬화(Serializable)된 객체를 보낼 수 있다.
     * 3. 보조스트림이므로 메인스트림과 함께 사용한다.
     */
    File dir = new File("C:/storage");
    
    File file = new File(dir, "ex05.dat"); 
    // 데이터 출력스트림 선언 
    ObjectOutputStream oout = null;
    
    try {
      oout = new ObjectOutputStream(new FileOutputStream(file));
      String name = "tom";
      int age = 50;
      double height = 180.5;
      String school = "가산대학교";
      Student student = new Student(name, age, height, school);
      oout.writeObject(student);

    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(oout != null) {
          oout.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    System.out.println(file.getName() + "파일크기:" + file.length() +"바이트");
  }
  public static void main(String[] args) {
    ex05();

  }

}
