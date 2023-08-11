package naver.api;

import java.io.IOException;

public class MainWrapper {

  public static void main(String[] args) throws IOException {
    
    NaverApiSearchBook app = new NaverApiSearchBook();
    app.getSearchList();
    
  }

}
