package easyJava.src.chapter11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
  public static void main(String[] args) {
    List<String> cars = List.of("소나타", "아반테", "캐스퍼", "모닝");
    List<String> list = new ArrayList<>(cars);

    Iterator<String> iterator = list.iterator();
    while (iterator.hasNext()) {
      System.out.print(iterator.next() + ",");
    }
    System.out.println();

//    맨 뒤에 소울을 넣어보자
    list.add("소울");
    for (String car:list) {
      System.out.print(car + " : ");
    }
    System.out.println();

//    맨 처음에 뉴 그랜저를 넣어 보자
    list.add(0,"뉴 그랜저");
    System.out.println(list);   // ArrayList에 toString 구현 되어 있음

//    소울을 제네시스로 바꿔보자
    list.set(5, "제네시스");
    System.out.println(list);

    list.remove(5);        // index
    list.remove("뉴 그랜저");   // Object
    list.remove(list.get(0));
    list.remove("아반테");
    System.out.println("remove 후 : " + list);
    System.out.println(list.size());

    list.indexOf("캐스퍼");
    list.contains("싼타페");
    System.out.println(list);
  }
}
