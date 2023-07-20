package ex02_Watch;

/**
 * 시, 분, 초 정보를 가지고 있는 시계 클래스
 * addHour, addMinutem, addSecond 메소드를 이용해서 시, 분, 초를 조작할 수 있다.
 * @author 콩이엄마
 * @since 2023.07.20
 * @version 1.0
 *
 */
public class Watch {
  /**
   * 시간 정보를 저장하는 필드로 0 ~ 23사이 값을 가진다.
   */
  private int hour;
  /**
   * 분 정보를 저장하는 필드로 0 ~ 59사이 값을 가진다.
   */
  private int minute;
  /**
   * 초 정보를 저장하는 필드로 0 ~ 59 사이 값을 가진다.
   */
  private int second;
  
  //setter
  public void setHour(int hour) {
    this.hour = hour;
  }
  public void setMinute(int minute) {
    this.minute = minute;
  }
  public void setSecond(int second) {
    this.second = second;
  }
  //getter
  public int getHour() {
    return hour;
  }
  public int getMinute() {
    return minute;
  }
  public int getSecond() {
    return second;
  }
  
  /**
   * 필드 hour에 파라미터 param을 더하는 메소드<br>
   * 필드 hour값은 0 ~ 23 사이의 값을 가질 수 있도록 처리해야 한다.<br>
   * 파라미터 값이 0보다 작거나 같으면 처리하지 않는다.
   * @param param 증가시킬 시간 정보
   */
  public void addHour(int param) {
    if(param <= 0) {
      return;
    }
    hour += param;    
    hour %= 24;    
  }
  /**
   * 필드 minute에 파라미터 param을 더하는 메소드<br>
   * 필드 minute 값은 0 ~ 59 사이의 값을 가질 수 있도록 처리해야 한다.<br>
   * 필드 minute값이 60보다 크거나 같으면 필드 hour값도 증가시켜야 한다.<br>
   * @param param
   */
  public void addMinute(int param) {
    
      if (param <= 0) {
          return;
      }
      minute += param;
      addHour(minute / 60);//누적된 minute을 60으로 나눈 몫을addHour 에게 전달한다
      minute %= 60;     
  }  
  /**
   * 필드 second에 파라미터 param을 더하는 메소드<br>
   * 필드 second 값은 0 ~ 59 사이의 값을 가질 수 있도록 처리해야 한다.<br>
   * 필드 second값이 60보다 크거나 같으면 필드 minute값도 증가시켜야 한다.<br>
   * @param param
   */
  public void addSecond(int param) {
    if (param <= 0) {
      return;
  }
    second += param;
    addMinute(second / 60);//누적된 second을 60으로 나눈 몫을addMinute 에게 전달한다
    second %= 60;
    
    
  }
 
}
