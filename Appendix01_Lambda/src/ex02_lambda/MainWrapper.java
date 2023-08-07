package ex02_lambda;

public class MainWrapper {

  public static void main(String[] args) {

    GasStation station = new GasStation();
    station.setTotalOil(1000);  // 1000L
    station.setPayPerLiter(2000);  // 1L당 2000원

    // 기름팔기
    station.sellOil("모닝", 50);  // 모닝 50L 주유 완료
    station.sellOil("레이", 50);  // 레이 50L 주유 완료
    
    // 주유소 상태
    System.out.println("남은Oil:" + station.getTotalOil());  // 900L
    System.out.println("번돈:" + station.getEarning());      // 200000원
  }

}
