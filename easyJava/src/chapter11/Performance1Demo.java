package easyJava.src.chapter11;
/* pull 해올 것 */
import java.util.ArrayList;
import java.util.LinkedList;

public class Performance1Demo {
  public static void main(String[] args) {
    ArrayList<Integer> arrayList = new ArrayList<>();
    LinkedList<Integer> linkedList = new LinkedList<>();

//    # ArrayList 추가 -> 뒤
    long start = System.nanoTime();
    for (int i = 0; i < 100_000; i++) {
      arrayList.add(i);
    }
    long end = System.nanoTime();
    long arrayListTime = end - start;
    System.out.println("arrayList 뒤에 값을 추가할 때, " + arrayListTime);


    System.out.println("-------------------------------");

//    # ArrayList 추가 -> 앞
    start = System.nanoTime();
    for (int i = 0; i < 100_000; i++) {
      arrayList.add(0, i);
    }
    end = System.nanoTime();
    arrayListTime = end - start;
    System.out.println("arrayList 앞에 값을 추가할 때, " + arrayListTime);


    System.out.println("-------------------------------");

//    # ArrayList 삭제 -> 뒤
    start = System.nanoTime();
    for (int i = 0; i < 100_000; i++) {
      arrayList.remove(arrayList.size() - 1);
    }
    end = System.nanoTime();
    arrayListTime = end - start;
    System.out.println("arrayList 뒤에 값을 삭제할 때, " + arrayListTime);


    System.out.println("-------------------------------");

//    # ArrayList 삭제 -> 앞
    start = System.nanoTime();
    for (int i = 0; i < 100_000; i++) {
      arrayList.remove(0);
    }
    end = System.nanoTime();
    arrayListTime = end - start;
    System.out.println("arrayList 앞에 값을 삭제할 때, " + arrayListTime);


    System.out.println("-------------------------------");

//    # LinkedList 추가 -> 뒤
    start = System.nanoTime();
    for (int i = 0; i < 100_000; i++) {
      linkedList.add(i);
    }
    end = System.nanoTime();
    long linkedListTime = end - start;
    System.out.println("linkedList 뒤에 값을 추가할 때, " + linkedListTime);


    System.out.println("-------------------------------");

//    # LinkedList 추가 -> 앞
    start = System.nanoTime();
    for (int i = 0; i < 100_000; i++) {
      linkedList.add(0, i);
    }
    end = System.nanoTime();
    linkedListTime = end - start;
    System.out.println("linkedList 앞에 값을 추가할 때, " + linkedListTime);


    System.out.println("-------------------------------");

//    # LinkedList 삭제 -> 뒤
    for (int i = 0; i < 100_000; i++) {
      linkedList.add(0, i);
    }

    start = System.nanoTime();
    for (int i = 0; i < 100_000; i++) {
      linkedList.removeLast();
    }
    end = System.nanoTime();
    linkedListTime = end - start;
    System.out.println("linkedList 뒤에서 값을 삭제할 때, " + linkedListTime);


    System.out.println("-------------------------------");

//    # LinkedList 삭제 -> 앞
    start = System.nanoTime();
    for (int i = 0; i < 100_000; i++) {
      linkedList.removeFirst();
    }
    end = System.nanoTime();
    linkedListTime = end - start;
    System.out.println("linkedList 앞에서 값을 삭제할 때, " + linkedListTime);


  }
}