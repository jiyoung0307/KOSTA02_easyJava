package easyJava.src.chapter17;

import java.util.List;
import java.util.Optional;

public class Reduce1Demo {
  public static void main(String[] args) {
    List<Integer> list = List.of(3, 4, 5, 1, 2);

//    초기값을 주지 않을 경우
    int i = list.stream().reduce((x, y) -> x + y).get();  // Ctrl + Alt + V
//    초기값을 주었을 경우
    int i1 = list.stream().reduce(0, (x, y) -> x + y);  // Ctrl + Alt + V

    int i2 = list.stream().reduce(1, (x, y) -> x * y);
    System.out.println(i2);
  }
}
