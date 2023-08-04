package ex01_weather;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainWrapper {

  public static void main(String[] args) {
    
    // 1시간마다 갱신되는 전국 날씨 정보
    String spec = "http://www.kma.go.kr/XML/weather/sfc_web_map.xml";

    URL url = null;
    
    HttpURLConnection con = null;

    BufferedInputStream bin = null;

    BufferedOutputStream bout = null;
    try {
      url = new URL(spec); 
      con = (HttpURLConnection) url.openConnection();
      bin = new BufferedInputStream(con.getInputStream());
   
    // C:/storage/sfc_web_map.xml 파일로 저장하기
    File dir = new File("C:/storage");
    if(dir.exists() == false) {
      dir.mkdirs();
    }
    File file = new File(dir, "sfc_web_map.xml");
    
    bout = new BufferedOutputStream(new FileOutputStream(file));
    byte[] b = new byte[1024];  
   
    int readByte = 0;

    while((readByte = bin.read(b)) != -1) {
      bout.write(b, 0, readByte);
    }
    
    }catch (MalformedURLException e) {
      System.out.println("URL 주소 오류");
    } catch (IOException e) {
      System.out.println("URL 접속 오류"); 
    } finally {
      try {
        // 생성의 역순으로 닫기
        if(bout != null) { bout.close(); }
        if(bin != null) { bin.close(); }
        if(con != null) { con.disconnect(); }
      } catch(IOException e) {
        e.printStackTrace();
      }
    }
  }
}

