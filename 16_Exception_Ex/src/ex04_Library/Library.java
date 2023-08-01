package ex04_Library;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Library {

  private List<Book> books;  // 선언
  private Scanner sc;        // 선언
  
  // new Library
  public Library() {
    books = new ArrayList<Book>();
    sc = new Scanner(System.in);
  }
  /**
   * 등록<br>
   */
  public void addBook() throws InputMismatchException {    
    System.out.println("=== 등록 ===");
    System.out.println("책 제목 입력");
    String title = sc.next();
    System.out.println("책 가격 입력");
    int price = sc.nextInt();
    books.add(new Book(title, price));
    System.out.println(title + "책이 등록되었습니다.");
  }
  /**
   * 삭제<br>
   */
  public void deleteBook() {
    
  }
  /**
   * 수정<br>
   */
  public void modifyBook() {
    
  }
  /**
   * 조회<br>
   */
  public void queryBook() {
    
  }
  /**
   * 전제조회<br>
   */
  public void queryAllBook() throws RuntimeException {   
    System.out.println("=== 전체조회 ===");
    System.out.println("전체 보유 도서수:" + books.size() + "권");
    if(books.isEmpty()) {
    throw new RuntimeException("책이없네?");
    }
  }
  /**
   * 운영<br>
   */
  public void manage() {
    // 사용자가 종료 명령을 내릴때까지 프로그램은 종료되지 않는다.
    
    
    while(true) {
      
      try {
      System.out.println("1.등록 2.삭제 3.수정 4. 조회 5.전체조회 0.종료");
      String choice = sc.next();
   
      
      switch(choice) {
      case "1": addBook(); break;
      case "2": deleteBook(); break;
      case "3": modifyBook(); break;
      case "4": queryBook(); break;
      case "5": queryAllBook(); break;
      case "0": System.out.println("도서관리프로그램을 종료합니다."); 
      default : System.out.println("잘못된 입력입니다. 다시 시도하세요.");
      }      
      }  catch(Exception e) {
        System.out.println(e.getMessage());
      }
      
      } //while(true)
    }// manage()
  
}
