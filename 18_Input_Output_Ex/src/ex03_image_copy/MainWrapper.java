package ex03_image_copy;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class MainWrapper {

  public static void main(String[] args) {
    
    // 문제. %ORA_HOME%/oui/instImages/bg.jpg 이미지 파일을 C:/storage/bg.jpg 이미지로 복사하시오.
    // %ORA_HOME%은 C:/app/사용자/product/18.0.0/dbhomeXE 디렉터리를 의미한다.
     
    /*
     * 원본 bg.jpg                    byte[] b = new byte[1024]                   복사본 bg.jpg
     * ┌-------┐                            ┌-------┐                            ┌-------┐
     * │       │----------------------------│       │----------------------------│       │
     * │       │            -->             │       │            -->             │       │
     * │       │----------------------------│       │----------------------------│       │
     * └-------┘   readByte = bin.read(b)   └-------┘  bout.write(b,0,readByte)  └-------┘
     */
    File dir1 = new File("C:/app/GD/product/18.0.0/dbhomeXE/oui/instImages");
    if(dir1.exists() == false) {
      dir1.mkdirs();
    }
    File src = new File(dir1, "bg.jpg");   
    // 원본을 읽는 입력스트림 선언
    BufferedInputStream bin = null;
    
    // 복사본 파일의 File 객체 생성
    File dir2 = new File("C:/storage");
    if(dir2.exists() == false) {
      dir2.mkdirs();
    }
    File cp = new File(dir2, src.getName());
    
    // 복사본을 만드는 출력스트림 선언
    BufferedOutputStream bout = null;

            try {
                // 파일 입력 스트림 생성
                bin = new BufferedInputStream(new FileInputStream(src));
                
                // 복사본을 만드는 출력스트림 생성
                bout = new BufferedOutputStream(new FileOutputStream(cp));

                // 버퍼 사이즈 설정 (예: 1KB)
                byte[] b = new byte[1024];
                int readByte = 0;

                // 1024byte씩 복사 진행
                while ((readByte = bin.read(b)) != -1) {
                    bout.write(b, 0, readByte);
                }

                System.out.println(src.getPath() + "→" + cp.getPath());

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    // 사용한 스트림 닫기
                    if (bout != null) {
                        bin.close();
                    }
                    if (bin != null) {
                        bin.close();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
 

}