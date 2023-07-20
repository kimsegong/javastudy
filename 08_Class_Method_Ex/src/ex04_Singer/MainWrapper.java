package ex04_Singer;

public class MainWrapper {

  public static void main(String[] args) {
    
    Song song = new Song();
    
    song.setTitle("");
    song.setGenre("");
    song.setPlayTime(3.5);
    
    song.info();  //제목: ㅌ, 장르: ㅌ, 재생시간: 3.5분

    
    Singer singer = new Singer();
    
    singer.setName("김흥국");
    singer.setTitleSong(song);
    
    singer.info();
  }

}
