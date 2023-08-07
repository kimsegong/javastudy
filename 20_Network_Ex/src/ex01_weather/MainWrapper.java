package ex01_weather;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainWrapper {

  public static void main(String[] args) {
    
    // C:/storage/sfc_web_map.xml �뙆�씪濡� ���옣�븯湲�

    // 1�떆媛꾨쭏�떎 媛깆떊�릺�뒗 �쟾援� �궇�뵪 �젙蹂� URL
    String spec = "http://www.kma.go.kr/XML/weather/sfc_web_map.xml";

    // URL 媛앹껜 �꽑�뼵
    URL url = null;
    
    // HttpURLConnection 媛앹껜 �꽑�뼵
    HttpURLConnection con = null;
    
    // �엯�젰�뒪�듃由� �꽑�뼵 (�쟾援� �궇�뵪 �젙蹂대�� �씫�뒗 �뒪�듃由�)
    BufferedReader br = null;
    
    // 異쒕젰�뒪�듃由� �꽑�뼵 (C:/storage/sfc_web_map.xml �뙆�씪�쓣 留뚮뱶�뒗 �뒪�듃由�)
    BufferedWriter bw = null;
    
    try {
      
      // URL 媛앹껜 �깮�꽦
      url = new URL(spec);
      
      // HttpURLConnection 媛앹껜 �깮�꽦
      con = (HttpURLConnection) url.openConnection();
      
      // �엯�젰�뒪�듃由� �깮�꽦 (�쟾援� �궇�뵪 �젙蹂대�� �씫�뒗 �뒪�듃由�)
      br = new BufferedReader(new InputStreamReader(con.getInputStream()));
      
      // 異쒕젰�뒪�듃由� �깮�꽦 (C:/storage/sfc_web_map.xml �뙆�씪�쓣 留뚮뱶�뒗 �뒪�듃由�)
      bw = new BufferedWriter(new FileWriter("C:/storage/sfc_web_map.xml"));
      
      // �엯�젰�맂 臾몄옄�뿴�쓣 ���옣�븷 蹂��닔
      String line = null;      
      
      // 諛섎났臾� : �씫�� �궡�슜�씠 null�씠 �븘�땲硫� 怨꾩냽 �씫�뼱�꽌 �뙆�씪濡� 蹂대궦�떎.
      while((line = br.readLine()) != null) {
        bw.write(line);
        bw.newLine();
      }
      
      // 硫붿떆吏�
      System.out.println("�뙆�씪 �깮�꽦 �셿猷�");
      
    } catch(MalformedURLException e) {
      System.out.println(e.getMessage());
    } catch(IOException e) {
      System.out.println(e.getMessage());
    } finally {
      try {
        if(bw != null) bw.close();
        if(br != null) br.close();
        if(con != null) con.disconnect();
      } catch (IOException e) {
        System.out.println(e.getMessage());
      }
    }
    
  }
  asdfghj
}