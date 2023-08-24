package easyJava.src.chapter11;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratoeDemo {
  public static void main(String[] args) {
    Collection<String> list = Arrays.asList("다람쥐", "개구리", "나비");    // new 사용 불가

//    Ctrl + Alt + V
    Iterator<String> iterator = list.iterator();
    while (iterator.hasNext()) {
      System.out.print("iterator.next() : "+ (iterator.next() + "-"));
    }
    System.out.println();

//    iterrator는 일회성이므로 다시 작성
    iterator = list.iterator();
    while (iterator.hasNext()) {
      System.out.print("iterator.next() : "+ (iterator.next() + "="));
    }
    System.out.println();
  }
}
