package easyJava.src.challenge11;

import java.util.*;

/**
 * 3.Hashtable을 이용해 4개의 이름과 점수를 저장하시오.
 * 그리고 키보드로 이름을 입력하면 대응하는 점수를 알려 주는 프로그램을 작성하시오.
 */

public class HashTableScoreExample {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Map<String, Integer> map = new Hashtable<>();
    String name = "";

    map.put("김열공", 80);
    map.put("최고봉", 9);
    map.put("우등생", 96);
    map.put("나자바", 88);

    while (true) {
      System.out.printf("이름을 입력하세요. 종료하려면 Enter : ");
      name = sc.nextLine();

      if (name.isBlank()) break;
      if (map.get(name) != null)
        System.out.println(name + "의 점수는 " + map.get(name) + "입니다.");
      else
        System.out.println(name + "의 점수는 존재하지 않습니다.");
    }
  }
}