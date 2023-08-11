package ex04_Lotto;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Lotto {
  
  /**
   * 로또 구매<br>
   * 로또 구매를 위해서 사용자로부터 money를 입력 받는 메소드<br>
   * 로또 구매 비용은 최소 1000, 최대 100000이다.<br>
   * @return money 사용자가 입력한 로또 구매 비용에서 1000 미만 단위는 버리고 반환. ex) 5999 입력 시 5000 반환
   * @return 0 로또 구매 실패 시 반환
   */
  public int buyLotto() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Lotto를 얼마나 구입하시겠습니까?(최대 10만원) >>>");
    int money = sc.nextInt();
    sc.close();
    if(money < 1000 || money > 100000) {
      System.out.println(money + "원 Lotto 구매는 불가능합니다.");
      return 0;
    }
    return money / 1000 * 1000;
  }
  
  /**
   * 로또 번호 생성<br>
   * 로또 구매 비용만큼 로또 번호를 생성하는 메소드<br>
   * 5게임씩 끊어서 생성된 로또 번호를 출력한다.<br>
   * @param money 로또 구매 비용
   */
  public void generateLotto(int money) {
    // 로또 구매 용지 : 5개임 기록
    /*
     * row=1 1 2 3 4 5 6 
     * row=2 3 1 2 4 5 6
     * row=3 1 3 6 2 4 5
     * row=4 5 3 6 2 4 1
     * row=5 1 2 6 3 4 5
     */
    while(money > 0) {  
      int row = (money >= 5000) ? 5 : money / 1000;
      int[][] lotto = new int[row][6];
      for(int i = 0; i < lotto.length; i++) {
        SecureRandom secureRandom = new SecureRandom();
        Set<Integer> set = new HashSet<Integer>();
        while(set.size() != 6) {          
          set.add(secureRandom.nextInt(45) + 1);
        }
        Iterator<Integer> arm = set.iterator();
        for(int j = 0; j < lotto[i].length; j++) {
          lotto[i][j] = arm.next();
        }
            
      }
      for(int i = 0; i < lotto.length; i++) {
        System.out.print(String.format("%02d", i + 1));
        for(int j = 0; j < lotto.length; j++) {
          System.out.print(String.format("%4d", lotto[i][j]));
        }
        System.out.println();
      }
      System.out.println("--------------------------------");
      money -= 5000;
    }
    
  }
  
}