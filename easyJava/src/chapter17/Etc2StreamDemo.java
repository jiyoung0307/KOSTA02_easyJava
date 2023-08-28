package easyJava.src.chapter17;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Etc2StreamDemo {
  public static void main(String[] args) {
    //    Ctrl + Alt + V
    IntStream iterate = IntStream.iterate(1, x -> x + 2);
    /* 무한 출력 */
//    iterate.forEach(System.out::println);
    //    Ctrl + Alt + V
    // 무한대로 만들어보자
    IntStream ints = new Random().ints(0, 10);
    /* 무한 출력 */
//    ints.forEach(System.out::println);

    Stream<Double> generate = Stream.generate(Math::random);
    /* 무한 출력 */
//    generate.forEach(System.out::println);

    IntStream range = IntStream.range(1, 5);
    range.forEach(System.out::println);

    IntStream rangeClosed = IntStream.rangeClosed(1, 5);
    rangeClosed.forEach(System.out::print);
  }
}
