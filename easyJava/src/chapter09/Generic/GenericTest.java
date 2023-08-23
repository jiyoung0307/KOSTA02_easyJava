package easyJava.src.chapter09.Generic;

import java.util.ArrayList;
public class GenericTest {
  public static void main(String[] args) {
    /**
     * SOLID원칙 중 OCP 원칙 어김
     *
     */
    ArrayList nums = new ArrayList();
    nums.add(10);          // Integer로 10이 auto-Boxing 됨
    nums.add(3.14);        // Double로 3.14가 auto-Boxing 됨
    nums.add("hello");

    for (int i = 0; i < nums.size(); i++) {
      if (nums.get(i) instanceof Integer)
        System.out.println((Integer)(nums.get(i)) * 2);    // Object가 들어가있으므로 Integer로 형변환해야 함
      else if (nums.get(i) instanceof Double) {
        System.out.println((Double)(nums.get(i)) * 2);    // Object가 들어가있으므로 Integer로 형변환해야 함
      } else System.out.println("숫자 타입이 아닙니다.");
    }
  }
}
