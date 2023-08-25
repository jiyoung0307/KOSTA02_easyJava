package easyJava.src.chapter15;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo1 {
  public static void main(String[] args) {
    Queue<String> q = new LinkedList<>();   // 인터페이스이므로 new 사용 불가
    q.offer("바나나");
    q.offer("사과");
    q.offer("배");
    System.out.println(q.peek());

    while (!q.isEmpty()) {
      System.out.println(q.poll() + "가 삭제되었습니다.");
      ;
    }
    // 예외처리 필요 없음
    System.out.println("q.peek() : " + (q.peek()));
    System.out.println("q.poll() : " + (q.poll()));

  }
}
