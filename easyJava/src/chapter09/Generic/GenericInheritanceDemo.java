package easyJava.src.chapter09.Generic;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GenericInheritanceDemo {
  public static void main(String[] args) {
    ArrayList<Beer> a1 = new ArrayList<>();
    ArrayList<Boricha> a2 = new ArrayList<>();
    ArrayList<Beverage> a3 = new ArrayList<>();
    a3.add(new Beverage());
    a3.add(new Beer());
    a3.add(new Boricha());
    // 강제 형변환
    // Ctrl + Alt + V
    Beer beverage = (Beer) a3.get(1);
    System.out.println(beverageTest(a3));

//    ArrayList<Beverage>와는 다른것이기 때문에 상속관계가 없다 (사용 X)
//    beverageTest(a2);   두 ArrayList의 경우 상속 관계가 없다.
  }

  static boolean beverageTest(ArrayList<Beverage> array) {
    return true;
  }
}
