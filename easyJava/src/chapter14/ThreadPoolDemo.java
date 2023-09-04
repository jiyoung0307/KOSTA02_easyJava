package easyJava.src.chapter14;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
  /* Java에서 쓰레드 풀을 사용하여 간단한 다중 스레딩을 시연하는 예제 */
  public static void main(String[] args) {
    Runnable task = () -> {   // Runnable 객체 생성
      for (int i = 0; i < 5; i++) {
        System.out.println("안녕~");   // 안녕~ 5번 출력
        try {
          Thread.sleep(500);    // 출력 사이에 500 밀리초(0.5초)의 대기 시간
        } catch (InterruptedException e) {
        }
      }
    };

    /* ExecutorService 생성 */
    // 캐시된 스레드 풀은 필요에 따라 스레드를 동적으로 생성하고 재사용함
    ExecutorService ex = Executors.newCachedThreadPool();   // CachedThreadPool()메서드를 사용하여 캐시된 스레드 풀을 생성

    /* 작업 제출 */
    ex.submit(task);
    // 생성한 스레드 풀에 앞에서 정의한 작업을 제출

    for (int i = 0; i < 5; i++) {
      System.out.println("메인입니다.");   // 메인입니다를 5번 출력
      try {
        Thread.sleep(500);          // 출력 사이에 500 밀리초(0.5초)의 대기 시간
      } catch (InterruptedException e) {
      }
    }

    /* 스레드 풀 종료 */
    //ex.shutdown();    // 스레드 풀을 사용한 후에는 명시적으로 종료해주어야 함
  }


}