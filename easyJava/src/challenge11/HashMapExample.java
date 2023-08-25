package easyJava.src.challenge11;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
  public static void main(String[] args) {
    Map<String, String> animals = Map.of("호랑이", "tiger", "표범", "leopard", "사자", "lion");
    Map<String, String> map = new HashMap<>(animals);

    System.out.println("변경 전 : " + animals);

//    모든 value에 대해 소문자를 대문자로 바꿔주기
    map.replaceAll((k, v) -> v.toUpperCase());
    System.out.println("변경 후 : " + map);
  }
}
