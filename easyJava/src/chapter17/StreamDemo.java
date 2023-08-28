package easyJava.src.chapter17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class StreamDemo {
  public static void main(String[] args) {
    /* 별도의 저장 공간 1 */
    List<Integer> list = new ArrayList<>();
//    기본 패키지에 있는 Random을 꺼내보자
    Random r = new Random();

    for (int i = 0; i < 10; i++) {
      list.add(r.nextInt(30));
    }

    /* 별도의 저장 공간 2 */
    // 10보다 큰 값들을 별도로 저장해보자
    List<Integer> gt10 = new ArrayList<>();
    for (Integer i : list) {
      if (i > 10) gt10.add(i);
    }

    Collections.sort(gt10);
    System.out.println(gt10);


    list.stream()
        .filter(i -> i > 10)
        .sorted()
        .forEach(x -> System.out.print(x + " "));
  }
}
