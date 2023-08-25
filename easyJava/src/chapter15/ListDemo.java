package easyJava.src.chapter15;

import java.util.*;

public class ListDemo {
  public static void main(String[] args) {
    String[] animals = {"호랑이", "사자", "사슴", "곰"};

//    Ctrl + Alt + V
    List<String> list = Arrays.asList(animals);   // 배열로 리스트를 만듦
    System.out.println(list);

    list.set(3, "앵무새");   // 곰을 앵무새로 바꿔보자
    Iterator<String> iterator = list.iterator();
    while (iterator.hasNext()) {
      System.out.print(iterator.next() + ",");
    }
    System.out.println();

    // 맨 뒤에 다른 아이를 넣어보자
//    list.add(0,"바다표범");   abstractList라 사용 불가
    String[] animals2 = list.toArray(new String[0]);
    System.out.println(Arrays.toString(animals2));
    for (String ani : animals2) {
      System.out.print(ani + " : ");
    }
    System.out.println();
    Arrays.sort(animals2);
    System.out.println(Arrays.toString(animals2));


    /* 23.08.24 람다를 배우고나서 람다식으로 고쳐보자 */
    list.set(1, "바다표범");
    list.sort(new Comparator<String>() {
      // 익명 객체 생성
      @Override
      public int compare(String o1, String o2) {
        return o1.length() - o2.length();   // Natural Sort(길이가 짧은 순으로 sort)
      }
    });

      // lambda식으로 바꿔보자



    System.out.println(list);
  }
}
