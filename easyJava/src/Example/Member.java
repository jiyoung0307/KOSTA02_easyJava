package easyJava.src.Example;

/* 객체 동등 비교 */
public class Member {
  public String id;

  public Member(String id) {
    this.id = id;
  }

  /* equals 오버라이딩 */
  @Override
  public boolean equals(Object obj) {    // Object의 equals() 메소드 재정의
    if (obj instanceof Member target) {  // obj가 Member 타입인지 검사하고 타입 변환 후 target 변수에 대입
      if (id.equals(target.id)) {        // id 문자열이 같은지 비교
        return true;
      }
    }
    return false;
  }
}
