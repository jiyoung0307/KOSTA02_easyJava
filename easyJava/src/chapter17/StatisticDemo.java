package easyJava.src.chapter17;

import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StatisticDemo {
  public static void main(String[] args) {
    IntStream is = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    System.out.println("sum : " + is.sum());

    is = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    System.out.println("avg : " + is.average().getAsDouble());

    Stream<String> ss = Stream.of("a", "b", "c", "d", "e");
    System.out.println("count : " + ss.count());

    ss = Stream.of("a", "b", "c", "d", "e");
    System.out.println("max : " + ss.max((x,y) -> x.hashCode() - y.hashCode()).get());

//    글자의 길이가 제일 긴 애가 max가 되도록
//    max값의 결과가 ccc가 나오도록
    Stream<String> ss1 = Stream.of("a", "bb", "ccc", "d", "ee"); // max ==> "ccc"
    System.out.println("글자수가 가장 긴 문자 : " + ss1.max((x,y) -> x.length() - y.length()).get());
  }
}
