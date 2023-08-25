package easyJava.src.chapter15;

import java.util.HashMap;
import java.util.Map;

public class HashMap1Demo {
  public static void main(String[] args) {
    Map<Fruit, Integer> fruits = new HashMap<>();
    System.out.println(fruits.size());
    fruits.put(new Fruit("사과"), 10);
    fruits.put(new Fruit("바나나"), 5);
    fruits.put(new Fruit("딸기"), 3);

    fruits.put(new Fruit("사과"), 3);
    fruits.put(null, 3);    // Hashtable일 경우 null 입력을 허용하지 않으므로 NullPointerException 발생
                            // HashMap은 null 허용
    System.out.println(fruits);

  }
}

class Fruit {
  String name;

  public Fruit(String name) {
    this.name = name;
  }

  //  Ctrl + O
  @Override
  public int hashCode() {
    return name.hashCode();
  }

  //hashCode가 사용하지 않음에도 불구하고 hashCode는 있어야 함!!
  @Override
  public boolean equals(Object obj) {
    if (obj != null && obj instanceof Fruit fruit) {
//      if(fruit.hashCode() == this.hashCode())
      if (this.name.equals(fruit.name))
        return true;
    }
    return false;
  }

  @Override
  public String toString() {
    return "[" + name + "]";
  }
}
