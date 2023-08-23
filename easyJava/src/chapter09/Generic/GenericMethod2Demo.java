package easyJava.src.chapter09.Generic;

public class GenericMethod2Demo {
  public static void main(String[] args) {
    Integer[] ia = {1, 2, 3, 4, 5};
    Double[] da = {1.0, 2.0, 3.0, 4.0, 5.0};
    Character[] ca = {'a', 'b', 'c', 'd', 'e'};

    Utils2.showArray(ia);    // {1,2,3,4,5}
    Utils2.showArray(da);     // [1.0, 2.0, 3.0, 4.0, 5.0]
//    Utils2.showArray(ca);    // error

    System.out.println(Utils2.getLast(ia));
    System.out.println(Utils2.getLast(da));
    System.out.println(Utils2.getLast(ca));
  }
}

class Utils2 {
  static <T extends Number> void showArray(T[] array){
//    System.out.println(Arrays.toString(array));
    for (T t : array) {
      System.out.printf("%s ",t);
    }
    System.out.println();
  }

  static <T> T getLast(T[] array){    // 매개변수, return 모두 제네릭
    return array[array.length - 1];
  }

}

