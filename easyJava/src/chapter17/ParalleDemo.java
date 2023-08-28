package easyJava.src.chapter17;

import java.util.stream.IntStream;

public class ParalleDemo {
  public static void main(String[] args) {
    long start, end, total;
//    Ctrl + Alt + V
    IntStream sequential = IntStream.rangeClosed(1, 100_000_000);
    start = System.currentTimeMillis();
    total = sequential.sum();
    end = System.currentTimeMillis();
    System.out.println("순차 처리 시간 : " + (end - start));

//    Ctrl + Alt + V
    IntStream parallel = IntStream.rangeClosed(1, 100_000_000).parallel();
    start = System.currentTimeMillis();
    total = parallel.sum();
    end = System.currentTimeMillis();
    System.out.println("병렬 처리 시간 : " + (end - start));

  }
}
