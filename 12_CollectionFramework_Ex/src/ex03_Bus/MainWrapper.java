package ex03_Bus;

public class MainWrapper {

  public static void main(String[] args) {
        
        Bus bus = new Bus();
     
        bus.getOn(1, new Person ("가길동"));
        bus.getOn(25, new Student ("나길동"));
        bus.getOn(25, new Student("라길동")); //오류
        bus.getOn(30, new Student ("다길동"));//오류 이미앉았으니
        
        bus.getOff(1);
        bus.getOff(10);  // 오류 메시지 출력
        bus.getOff(30);  
        
        bus.info(); //전체 좌석 정보
      }
      

}

