package ex06_GameUnit;

public class Marine extends GameUnit {

  private final int POWER = 5; 
  
  public Marine(String name) {
    super(name);
  }  
  @Override
  public void attack(GameUnit other) {  // unit1.attack(unit2)
    System.out.println(getName() + "의 공격!");
    if(POWER >= other.getHp()) {
      other.setHp(0);
    } else {
    other.setHp(other.getHp() - POWER);  ///상대방의 에너지를 나의 파워만큼 줄어든다.
  }
 }
}
