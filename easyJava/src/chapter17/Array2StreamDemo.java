package easyJava.src.chapter17;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Array2StreamDemo {
  public static void main(String[] args) {
    int[] ia = {1, 2, 3, 4, 5};
//    Ctrl + Alt + v
    IntStream stream = Arrays.stream(ia);

    String[] sa = {"a", "b", "c", "d"};
//    Ctrl + Alt + v
    Stream<String> sa1 = Stream.of(sa);

    double[] da = {1.2, 3.14, 5.2};
//    Ctrl + Alt + v
    DoubleStream da1 = DoubleStream.of(da);
  }
}
