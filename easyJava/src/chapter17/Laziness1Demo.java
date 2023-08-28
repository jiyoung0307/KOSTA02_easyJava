package easyJava.src.chapter17;

import java.util.stream.IntStream;

public class Laziness1Demo {
  public static void main(String[] args) {
    IntStream is = IntStream.rangeClosed(1, 5);

//  느긋한 연산
    is.filter(x -> {
      System.out.println("filter(느긋한 연산): " + x);
      return x % 2 == 0;
    }).map(x -> {
      System.out.println("map(느긋한 연산) : " + x);
      return x * x;
    }).forEach(x -> System.out.println("forEach(조급한 연산) : " + x));    // 조급한 연산
  }
}
