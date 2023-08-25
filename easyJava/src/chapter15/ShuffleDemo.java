package easyJava.src.chapter15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleDemo {
  public static void main(String[] args) {
    List<Character> list = new ArrayList<>();   // 인터페이스 - 구현체
    for (char c = 'A'; c <= 'G' ; c++) {
      list.add(c);    // 객체 c로 Wapping되서 들어감
    }
    System.out.println(list);

    Collections.rotate(list,3);   // 3칸 뒤로 가라
    System.out.println(list);

    Collections.shuffle(list);    // Random 섞기
    System.out.println(list);
  }
}
