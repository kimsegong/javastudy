package ex06_Member;

public class MainWrapper {

  public static void main(String[] args) {
        
    Address address = new Address();
    // 정보 추가 (Setter 활용)
    address.setPostCode("5465");
    address.setRoadAddr("위례성대로 40길 35");
    address.setJibunAddr("58-6");
    address.setDetailAddr("1103호");
    
    
    Contact contact = new Contact();    
    // 정보 추가 (Setter 활용)
    contact.setHomeTel("02-4546-4541");
    contact.setMobile("010-5845-8954");
    contact.setAddress(address);
    
    Member member = new Member();
    // 정보 추가 (Setter 활용)
    member.setContact(contact);
    member.setName("내이름은 김세연");
    
    // Member member 객체 정보 확인 (Getter 활용)
    System.out.println("내이름" + member.getName());
    System.out.println("집전화번호" + member.getContact().getHomeTel());
    System.out.println("모바일" + member.getContact().getMobile());
    System.out.println("우편번호:" + member.getContact().getAddress().getPostCode());
    System.out.println("도로명 주소:" + member.getContact().getAddress().getRoadAddr());
    System.out.println("상세주소:" + member.getContact().getAddress().getDetailAddr());
    
  }
 
  

}
