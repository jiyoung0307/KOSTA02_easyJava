package easyJava.src.Example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {
  public static void main(String[] args) {
    // Set 컬렉션 생성
    Set<String> set = new HashSet<>();
    // Set 요소 넣기
    set.add("홍길동");
    set.add("신용권");
    set.add("김자바");

    /**
     * 외부 반복자는 향상된 for문 Or Iterator 반복자를 사용해서 하나씩 처리한다.
     */
    // 외부 반복자 이용 (foreach문)
    for (String item : set) {
      System.out.println("for문을 이용한 item = " + item);
    }
    // 외부 반복자 이용 (iterator)
    Iterator<String> iterator = set.iterator();
    while (iterator.hasNext()) {
      String item = iterator.next();
      System.out.println("iterator를 이용한 item = " + item);
    }

    // 내부 반복자
    Stream<String> stream = set.stream();
    stream.forEach((t) -> {
      System.out.println("t (내부 반복자) = " + t);
    });

    System.out.println();

    // stream 객체는 한번 사용하면 재사용 못함!! 다시 선언해주어야 함
    stream = set.stream();
    stream.forEach((item) -> System.out.println(item));
  }
}
