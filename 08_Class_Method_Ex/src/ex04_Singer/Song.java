package ex04_Singer;

import ex03_Soldier.Gun;

/*song.setTitle("");
song.setGenre("");
song.setPlayTime(3.5);

song.info();  //
*/


public class Song {

  private String title;
  private String genre;
  private double playTime;
  

  
  public void setTitle(String title) {
    this.title = title;
    
  }
  public void setGenre(String genre) {
   this.genre = genre;
    
  }
  public void setPlayTime(double playTime) {
    
    this.playTime = playTime;
  }
  public double getPlayTime() {
    return playTime;
  }
  public void info( ) {
    System.out.println("제목:" + title + "장르:" + genre + "재생시간:" + playTime);
  }
  
  
  
}
