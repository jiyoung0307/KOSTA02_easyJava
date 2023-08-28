package easyJava.src.chapter17;

import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MatchDemo {
  public static void main(String[] args) {
    // Stream을 반환하지 않으면 최종 연산임
    boolean b = Stream.of("a1", "b1", "c1").anyMatch(x -> x.startsWith("c"));
    System.out.println(b);

    boolean b1 = IntStream.of(1, 3, 5, 7, 9).allMatch(n -> n % 2 == 1);
    System.out.println(b1);

    // 스트림 사용 X, 배열, for, if문으로 전부 홀수인지 증명하는 프로그램 작성
    int[] arr = {1, 3, 5, 7, 9};
    boolean odd = true;
    for (int i : arr) {
      if(i % 2 != 1) {
        odd = false;
        break;
      }
    }
    System.out.println(odd);

    boolean b2 = IntStream.of(1, 3, 5, 7, 9).noneMatch(n -> n % 2 == 1);
    System.out.println(b2);
  }
}
