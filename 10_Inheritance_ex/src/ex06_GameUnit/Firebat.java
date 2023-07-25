package ex06_GameUnit;

public class Firebat extends GameUnit {

  private final int POWER = 10;
    
  public Firebat(String name) {
    super(name);
  }
  @Override
  public void attack(GameUnit other) { // unit2.attack(unit)
    System.out.println(getName() + "의 공격!");
    if(POWER >= other.getHp()) {
      other.setHp(0);
    }else {
      other.setHp(other.getHp() - POWER);
    }
  }
  
  
}
