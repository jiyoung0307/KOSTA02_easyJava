package easyJava.src.challenge17;

import java.util.Arrays;
import java.util.List;

public class StringStreamExample {
  public static void main(String[] args) {
    List<String> list = Arrays.asList(
        "This is a java book",
        "Lambda Expression",
        "Java8 suppoerts lambda expretions"
    );
    list.stream()
//        .map(x -> x.toLowerCase())    // 비교 기준 맞추기
//        .filter(x -> x.contains("java"))
        .filter(x -> x.toLowerCase().contains("java"))    // 한번에 작성하기
        .forEach(System.out::println);
  }
}
