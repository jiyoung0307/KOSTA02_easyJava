package easyJava.src.Example;

public class HashCodeExample {
  public static void main(String[] args) {
    Student s1 = new Student(1, "홍길동");
    Student s2 = new Student(1, "홍길동");

    if (s1.hashCode() == s2.hashCode()) {   // 해시코드가 동일한지 검사
      if (s1.equals(s2)) {                  // 데이터가 동일한지 검사
        System.out.println("동등 객체입니다.");
      } else {
        System.out.println("데이터가 다르므로 동등 객체가 아닙니다.");
      }
    } else {
      System.out.println("해시코드가 다르므로 동등 객체가 아닙니다.");
    }
  }
}

class Student {
  private int no;
  private String name;


  public Student(int no, String name) {
    this.no = no;
    this.name = name;
  }

  public int getNo() {
    return no;
  }

  public String getName() {
    return name;
  }

  // hashCode를 확인해보자

  /**
   * Object의 hashCode() 메소드를 재정의해서 학생 번호와 이름 해시코드를 합한 새로운 해시코드를 리턴하도록 함
   * (번호와 이름이 같으면 동일한 해시코드가 생성됨)
   */
  @Override
  public int hashCode() {
    int hashCode = no + name.hashCode();
    return hashCode;
  }

  // equals로 동등 비교

  /**
   * Object의 equals() 메소드를 재정의해서 Student 객체인지를 확인하고,
   * 학생 번호와 이름이 같으면 true를 리턴하도록 함.
   */
  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Student target) {
      if (no == target.getNo() && name.equals(target.getName())) {
        return true;
      }
    }
    return false;
  }
}