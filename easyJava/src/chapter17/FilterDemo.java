package easyJava.src.chapter17;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class FilterDemo {
  public static void main(String[] args) {
    String[] sa = {"a1", "b1", "c1", "c2", "c3"};
//    Stream<String> stream = Arrays.stream(sa);
    Arrays.stream(sa)
        .filter(s -> s.startsWith("c"))   // "c1", "c2", "c3"만 true
        .skip(1)
        .forEach(System.out::println);

    IntStream ints = new Random().ints(0, 10);
    ints.limit(10)
        .filter(x -> x % 2 == 0)
        .forEach(System.out::println);

    // nations 중 인구가 1억 이상인 나라 2개만 출력하기
    List<Nation> nation = Nation.nations;
    nation.stream()
        .filter(x -> x.getPopulation() >= 100)
        .limit(2)
        .forEach(x -> System.out.println(x.getName() + ":" + x.getPopulation()));
  }
}
