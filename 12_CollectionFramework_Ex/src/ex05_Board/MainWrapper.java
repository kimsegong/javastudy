package ex05_Board;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MainWrapper {

  public static void main(String[] args) {
  
    // 게시판(제목, 작성자, 조회수)을 저장하는 ArrayList만들기
    // Map  : 게시글
    // List : 게시글 목록
    
    // 3개 게시글을 만들고, ArrayList에 저장하기 
    Map<String, Object> gesi1 = new HashMap<String, Object>();    
    gesi1.put("게시글", "자바상");
    gesi1.put("작성자", "작성자1");
    gesi1.put("조회수", "10");
    Map<String, Object> gesi2 = new HashMap<String, Object>();   
    gesi2.put("게시글", "자바중");
    gesi2.put("작성자", "작성자2");
    gesi2.put("조회수", "12");
    Map<String, Object> gesi3 = new HashMap<String, Object>();
    gesi3.put("게시글", "자바하");
    gesi3.put("작성자", "작성자3");
    gesi3.put("조회수", "45");    
    // ArrayList 선언 & 생성   목록으로 옮기기위해서 ArrayList로 옮겼다  
    List<Map<String, Object>> gesiList = new ArrayList<Map<String, Object>>();    
    gesiList.add(gesi1);
    gesiList.add(gesi2);
    gesiList.add(gesi3);
    
    // 정보 확인 
    for(int i = 0, length = gesiList.size(); i < length; i++) {
      Map<String, Object> gesi = gesiList.get(i);
      System.out.println("게시글:" + gesi.get("게시글"));
      System.out.println("작성자:" + gesi.get("작성자"));
      System.out.println("조회수:" + gesi.get("조회수"));
      
    for(Entry<String, Object> entry : gesi.entrySet()) {
      System.out.println(entry.getKey() + ":" + entry.getValue());
    }
   
    }

    
    
  }

}
