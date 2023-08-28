package easyJava.src.chapter17;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Map1Demo {
  public static void main(String[] args) {
    Stream<String> s1 = Stream.of("a1", "b1", "b2", "c1", "c2");
    s1.map(x -> x.toUpperCase())
        .forEach(System.out::println);

    Stream<Integer> i1 = Stream.of(1, 2, 3, 4, 5);
    i1.map(x -> x * 10)
        .forEach(System.out::println);

    Stream<String> s2 = Stream.of("a1", "a2", "a3");
    s2.map(s -> s.substring(1))   // IntStream에만 mapToObj 존재함
        .mapToInt(x -> Integer.parseInt(x))
        .mapToObj(x -> "b" + x)
        .forEach(System.out::println);

    // Stream.of(a1,a2,a3); ==> a1.0, a2.0, a3.0으로 변환
    s2 = Stream.of("a1", "a2", "a3");
    s2.map(s -> s.substring(1))
        .mapToInt(Integer::parseInt)
        .mapToDouble(i -> i * 1.0)
        .mapToObj(i -> "a" + i)
        .forEach(System.out::println);

  }
}
