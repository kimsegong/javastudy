package naver.api;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

public class NaverApiSearchBook {
  
  private void generateImage(String spec) {
    
    URL url = null;
    HttpURLConnection con = null;
    BufferedInputStream bin = null;
    BufferedOutputStream bout = null;
    
try {
                
    url = new URL(spec);
    con = (HttpURLConnection) url.openConnection();

    con.setRequestMethod("GET");

    int responseCode = con.getResponseCode();
    if (responseCode != HttpURLConnection.HTTP_OK) {
    throw new RuntimeException(responseCode + "발생");
    }
    bin = new BufferedInputStream(con.getInputStream());

    File dir = new File("C:/download");
    if (!dir.exists()) {
      dir.mkdirs();
    }
    File file = new File(dir, System.currentTimeMillis() + ".jpg");
    bout = new BufferedOutputStream(new FileOutputStream(file));

    byte[] b = new byte[1024];
    int readByte = 0;
    while ((readByte = bin.read(b)) != -1) {
      bout.write(b, 0, readByte);
    } 
    System.out.println(file.getPath() + "파일 생성 완료");
  
    } catch (Exception e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
    } finally {
      try {
        if(bout != null) bout.close();
        if(bin != null) bin.close();
        if(con != null) con.disconnect();
      } catch (Exception e) {
        e.printStackTrace();
      }
   }    
  }
  
  public void getSearchList() throws IOException {
    
    URL url = null;
    HttpURLConnection con = null;
    BufferedReader reader = null;
      
    try {
      
      // 책 검색 OpenAPI를 사용해서 응답 결과 중 이미지(image) 결과만 추출하여
      // generateImage 메소드에 전달한다.
      // 10번의 generateImage 메소드 호출이 필요하다.
      Scanner sc = new Scanner(System.in);
      System.out.println("책 관련 검색어를 입력하시오>>>");
      String book = sc.nextLine();
            
      String spec = "https://openapi.naver.com/v1/search/book.json";
      String query = book;
      String clientId = "7MIsaANptnNc8wIoGbBN";
      String clientSecret = "AV6X2G17vd";
          
      StringBuilder sburl = new StringBuilder();
      sburl.append(spec);
      sburl.append("?query=").append(URLEncoder.encode(query, "UTF-8"));
      
      url = new URL(sburl.toString());
      con = (HttpURLConnection) url.openConnection();
      con.setRequestMethod("GET");
      con.setRequestProperty("X-Naver-Client-Id", clientId);
      con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
      
      int responseCode = con.getResponseCode();
      if(responseCode != HttpURLConnection.HTTP_OK) {
        throw new RuntimeException(responseCode + "발생");
      }
      
      reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
      
      StringBuilder sb = new StringBuilder();
      String line = null;
      while((line = reader.readLine()) != null) {
        sb.append(line + "\n");
      }
      JSONObject obj = new JSONObject(sb.toString());
      JSONArray items = obj.getJSONArray("items");
      for (int i = 0; i < items.length(); i++) {
          JSONObject item = items.getJSONObject(i);
          String imageUrl = item.getString("image");
          generateImage(imageUrl);
        
      }
            
    } catch (Exception e) {
      
      e.printStackTrace();
      LocalDateTime now = LocalDateTime.now();
      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
      String time = dtf.format(now);
      
      String message = e.getMessage();
      
      String clazz = e.getClass().getName();
      
      File dir = new File("C:/download");
      
      File file= new File (dir, "log.txt");
      
      try(BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))){
        
        bw.write(time + "  "+ message + "  " + clazz);
        bw.newLine();
        
        System.out.println(file.getPath() + "파일 생성 완료");
      }
      
    } finally {
      try {
        if(reader != null) reader.close();
        if(con != null) con.disconnect();
      } catch (Exception e1) {
        e1.printStackTrace();
      }
    }
    
  }
  
}