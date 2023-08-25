package easyJava.src.challenge15;

import java.util.*;

public class Map1Example {
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<String, Integer>();
    map.put("blue", 96);
    map.put("hong", 86);
    map.put("white", 92);
    System.out.println(map);

    String name = null;   // 최고 점수를 받은 아이디를 저장하는 변수
    int maxScore = 0;     // 최고 점수를 저장하는 변수
    int totalScore = 0;   // 점수 합계를 저장하는 변수

    // 여기에 코드를 작성하세요
    // 최고 점수
    Collection<Integer> values = map.values();
    maxScore = Collections.max(values);
    System.out.println("최고 점수 : " + maxScore);

    // 점수 합계, 평균
    for (Integer value : values) {
      totalScore += value;
    }
    System.out.println("평균 점수 : " + totalScore / values.size());

    // 이 부분에 Map.Entry 활용하기
    Set<String> keys = map.keySet();
    System.out.println(keys);
    for (String key : keys) {
      if (map.get(key) == maxScore) {
        name = key;
        System.out.println("최고 점수를 받은 아이디 : " + name);
        break;
      }
    }

    // Map.Entry<String, Integer> entry
    Set<Map.Entry<String, Integer>> entries = map.entrySet();
    for (Map.Entry<String, Integer> entry:entries) {
      if(entry.getValue() == maxScore) {
        name = entry.getKey();
        System.out.println("최고 점수를 받은 아이디 : " + name);
        break;
      }
    }
  }
}

