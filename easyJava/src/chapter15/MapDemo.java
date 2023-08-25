package easyJava.src.chapter15;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class MapDemo {
  public static void main(String[] args) {
    Map<String, Integer> fruits = Map.of("사과", 5, "바나나", 3, "딸기", 10, "배", 1);
    System.out.println(fruits);
    System.out.println(fruits.size() + "종류의 과일이 있습니다.");

//    fruits.put("키위", 100);  Immutable 이므로 수정, 추가 불가
//    fruits.remove("사과");
//    fruits.clear();

    System.out.println(fruits.get("사과"));
    System.out.println("사과는 " + fruits.get("사과") + "개 있습니다.");

//    모든 키를 Set 타입으로 반환
//    Ctrl + Alt + v
    Set<String> keys = fruits.keySet();
    for (String key : keys) {
      System.out.println(key);
    }

    // 컬렉션 반환
//    Ctrl + Alt + v
    Collection<Integer> values = fruits.values();
    System.out.println(values);
  }
}
