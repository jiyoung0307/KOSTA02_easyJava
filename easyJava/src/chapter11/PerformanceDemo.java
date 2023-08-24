package easyJava.src.chapter11;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * [ArrayList]
 *
 * get()연산 - 빠름
 * add(), remove() 연산 - 느림
 * 값을 뒤에 넣을 때 효과적
 *
 * [LinkedList]
 * get() 연산 - smfla
 * add(), remove() 연산 - 빠름
 * 앞 뒤를 바꿀 경우 효과적
 *
 * 둘이 비교해보자
 */
public class PerformanceDemo {
  public static void main(String[] args) {
    ArrayList<Integer> al = new ArrayList<>();
    LinkedList<Integer> ll = new LinkedList<>();

    long start = System.nanoTime();
    for (int i = 0; i < 100_000 ; i++) {
      al.add(i);
    }
    long end = System.nanoTime();
    long arrayList = end - start;
    System.out.println("arrayList로 처리한 시간 : " + arrayList);

    start = System.nanoTime();
    for (int i = 0; i < 100_000 ; i++) {
      al.add(0,i);
    }
    end = System.nanoTime();
    arrayList = end - start;
    System.out.println("arrayList로 처리한 시가 : " + arrayList);

    start = System.nanoTime();
    for (int i = 0; i < 100_000 ; i++) {
      ll.add(i);
    }
    end = System.nanoTime();
    long linkedList = end - start;
    System.out.println("linkedList로 처리한 시간 : " + linkedList);

    start = System.nanoTime();
    for (int i = 0; i < 100_000 ; i++) {
      ll.add(0,i);
    }
    end = System.nanoTime();
    linkedList = end - start;
    System.out.println("linkedList로 처리한 시간 : "+ linkedList);
  }
}