package easyJava.src.chapter09.Generic;

public class PersonTest {
  public static void main(String[] args) {
    Person p1 = new Person("111111", "홍길동");
    Person p2 = new Person("111111", "손흥민");

    if(p1.equals(p2))
      System.out.println("같은 사람이다.");
    else
      System.out.println("다른 사람이다.");
  }
}

class Person {
  // 멤버
  String no;
  String name;

  // 생성자
  public Person(String no, String name) {
    this.no = no;
    this.name = name;
  }

  // 메서드
  @Override
  public boolean equals(Object obj) {
    if(obj instanceof Person person) {
      if(person != null && this.no.equals(person.no) && this.name.equals(person.name)){
        return true;
      }
    }
    return false;
  }
}
