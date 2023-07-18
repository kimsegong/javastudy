package ex02_two_dim;

public class MainWrapper {

  public static void ex01() {
    // 2~9단까지 전체 구구단 결과 저장하고 출력하기
    //      0   1   2   3   4   5   6   7   8   <---- j
    //  i   
    //  0   2   4   6   8  10  12  14  16  18
    //  1   3   6   9  12  15  18  21  24  27
    //  2   4   8  12  16  20  24  28  32  36
    //  3   5  10  15  20  25  30  35  40  45
    //  4   6  12  18  24  30  36  42  48  54
    //  5   7  14  21  28  35  42  49  56  63
    //  6   8  16  24  32  40  48  56  64  72
    //  7   9  18  27  36  45  54  63  72  81
    int[][] gugudan = new int[8][9];
    gugudan[0][0] = 2*1;
    gugudan[0][1] = 2*2;
    
    for(int i = 0; i < gugudan.length; i++) {
      for(int j = 0; j < gugudan.length; j++ ) {
        gugudan[i][j] = (i + 2) * (j + 1);
        
        System.out.print(String.format("%4d", gugudan[i][j]));
      }
      System.out.println();
      }
   
  }
  
  public static void ex02() {
    // 아파트 출력하기 - 1
    // 101호: 3명
    // 102호: 4명
    // 201호: 2명
    // 202호: 2명
    // 301호: 4명
    
    // 302호: 6명
    // 401호: 3명
    // 402호: 5명
    // 501호: 4명
    // 502호: 4명
    int[][] apt = {
        {3, 4},  // 101호, 102호
        {2, 2},  // 201호, 202호
        {4, 6},  // 301호, 302호
        {3, 5},  // 401호, 402호
        {4, 4}   // 501호, 502호
    };
    
    for(int i = 0; i < apt.length; i++) {
      for(int j = 0; j < apt[i].length; j++) {
        System.out.println(((i + 1) * 100 + ( j + 1) + "호" + apt[i][j]));
      }
    }
    
    
    
  }
  
  public static void ex03() {
    // 아파트 출력하기 - 2
    // 1층: 7명
    // 2층: 4명
    // 3층: 10명
    // 4층: 8명
    // 5층: 8명
    int[][] apt = {
        {3, 4},  // 1층
        {2, 2},  // 2층
        {4, 6},  // 3층
        {3, 5},  // 4층
        {4, 4}   // 5층
    };
    
    for(int i = 0; i < apt.length; i++) {
      int total = 0;
      for(int j = 0 ; j < apt.length; j++) {
        total += apt[i][j];
      } 
      System.out.println(( i + 1 ) + "층" + total + "명");
    }
    
 /*
    int total = 0;
    total = total + apt[0][0];
    total = total + apt[0][1];
    System.out.println("1층 :" + total + "명");
   
    
 */
    
    
    
  }
  
  public static void ex04() {
    // 시간표 출력하기
    // 월요일: 국어 윤리 수학 체육
    // 화요일: 미술 수학 영어
    // 수요일: 사회 한자 수학 국어 영어
    // 목요일: 음악 국어 윤리
    // 금요일: 수학 영어 체육 과학
    String[] weekname = {"월요일", "화요일", "수요일", "목요일", "금요일"};
    String[][] timeTable = {
        {"국어", "윤리", "수학", "체육"},
        {"미술", "수학", "영어"},
        {"사회", "한자", "수학", "국어", "영어"},
        {"음악", "국어", "윤리"},
        {"수학", "영어", "체육", "과학"}
    };
    for(int i = 0; i < timeTable.length; i++) {
      System.out.print(weekname[i] + ":");
      for(int j = 0; j < timeTable.length; j++) {
        System.out.print(String.format("%3s", timeTable[i][j]));
      }
      System.out.println();
    }
    
  }

  public static void ex05() {
    // 2차원 배열 90도 회전하기(배열 a의 90도 회전된 모습을 배열 b에 저장한 뒤, 배열 a가 배열 b를 그대로 가져가기)
    //   1 1 1 1 1          0 0 0 0 1
    //   0 0 1 0 0          0 0 0 0 1
    //   0 0 1 0 0   --->   1 1 1 1 1
    //   0 0 1 0 0          0 0 0 0 1
    //   0 0 1 0 0          0 0 0 0 1
    // 배열 a의 출력결과
    //   00001
    //   00001
    //   11111
    //   00001
    //   00001
    int[][] a = {
        {1, 1, 1, 1, 1},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0}
    };
    int[][] b = new int[5][5];
    for(int i = 0; i < a.length; i++) {
      for(int j = 0; j < a[i].length; j++) {
        b[j][4 - i] = a[i][j];
        
      }
    }
    a = b;
    for(int i = 0; i <a.length; i++) {
      for(int j = 0; j < a[i].length; j++) {
        System.out.print(a[i][j]);
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    
//ex01();
//ex02();
   //ex03();
   //ex04();
    ex05();
  }

}
