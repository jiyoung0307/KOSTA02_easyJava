package easyJava.src.chapter17;

import java.util.Optional;

public class Optional2Demo {
  public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = null;
    Optional<String> o1 = Optional.ofNullable(s1);
    Optional<String> o2 = Optional.ofNullable(s2);

//    Util.print(Optional.ofNullable(s1));  // Optional[Hello] 출력
    // null이면 empty로 바꿔서 출력해줘
//    Util.print(Optional.ofNullable(s2));  // Optional.empty 객체 출력

    if(o1.isPresent()) {
      Util.print(o1.get());
    } else {
      System.out.println("Data가 없습니다.");
    }

    String s = o2.orElse("데이터가 없음");
    System.out.println(s);
  }
}
