package ex04_Chair;

public class Chair {

  // Person, Student, Alba 객체를 모두 저장할 수 있다.
  private Person person;

  public Person getPerson() {
    return person;
  }

  public void setPerson(Person person){// 업캐스팅이 시작되는 시점 
    this.person = person;
  }

  
  
}
