package easyJava.src.chapter11;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueDemo {
  public static void main(String[] args) {
    Queue<String> q = new LinkedList<>();   // 인터페이스이므로 new 사용 불가
    q.add("바나나");
    q.add("사과");
    q.add("배");
    System.out.println(q.element());

    while (!q.isEmpty()) {
      System.out.println(q.remove() + "가 삭제되었습니다.");;
    }
    try {
      q.element();   // stack의 peek과 비슷
      q.remove();   // NoSuchElementException 발생
    } catch (NoSuchElementException e) {
      System.out.println("큐가 비어있습니다.");
    }


  }
}
