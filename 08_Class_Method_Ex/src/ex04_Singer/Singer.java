package ex04_Singer;

public class Singer {

  private String name;
  private Song titleSong;
  
 
  public void setName(String name) {
    this.name = name;
  }
  public void setTitleSong(Song titleSong) {
    this.titleSong = titleSong;
  }
  public void info() {
    System.out.println("제목:" + name );
    titleSong.info();
  }
  
  
  
}
