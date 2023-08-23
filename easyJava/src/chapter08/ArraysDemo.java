package easyJava.src.chapter08;

import java.util.Arrays;

public class ArraysDemo {
  public static void main(String[] args) {
    char[] c1 = {'J', 'a', 'v', 'a'};
    char[] c2 = Arrays.copyOf(c1, c1.length);
    Character[] c3 = {'J', 'a', 'v', 'a'};  // AutoBoxing
    print(c3);

    System.out.println(c1);
    System.out.println(c2);

    String[] s1 = {"A", "B", "C", "D"};
    int d = Arrays.binarySearch(s1, "D");
    System.out.println("d = " + d);
    for (String s : s1) {
      if(s.equalsIgnoreCase("d")) {
        System.out.println("찾았습니다.");   // d와 같을 경우
      }
    }
    System.out.println(d);
    print(s1);
  }

  static void print(Object[] objArray){
    for (Object obj : objArray) {
      System.out.print(obj);
      System.out.print(",");
    }
    System.out.println();
  }
}
