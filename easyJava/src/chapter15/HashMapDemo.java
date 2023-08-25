package easyJava.src.chapter15;

import java.util.HashMap;
import java.util.Map;

/* 구현체 */
public class HashMapDemo {
  public static void main(String[] args) {
    //Set으로 저장하였으므로 저장에 순서가 없음
    Map<String, Integer> fruits = Map.of("사과", 5, "바나나", 3, "딸기", 10, "배", 1);
    Map<String, Integer> hashFruits = new HashMap<>(fruits);

    // 새로운 값 넣기
    hashFruits.put("키위", 10);
    System.out.println(hashFruits);

    // Key는 변경하지 않고 Value에 변경된 값을 넣음
    hashFruits.put("키위", 1);
    System.out.println(hashFruits);

//    비어있는지 확인
    hashFruits.remove("키위");
    System.out.println(hashFruits);
    hashFruits.clear();
    System.out.println(hashFruits.size());
    System.out.println(hashFruits.isEmpty());
  }
}
