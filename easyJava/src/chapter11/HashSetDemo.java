package easyJava.src.chapter11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
  public static void main(String[] args) {
    Set<String> set = Set.of("A", "B", "C", "D", "E");
    HashSet<String> hashSet = new HashSet<>(set);

//    set.add("F");   // imutable 객체
    hashSet.add("F");
    Iterator<String> iterator = hashSet.iterator();
    while (iterator.hasNext()) {
      System.out.print(iterator.next());
    }
    System.out.println();
    System.out.println(set);
    System.out.println(hashSet);

    /* 메소드로 반복 */
    boolean e = hashSet.add("E");     // HashCode같은 비교해서 값이 같다면 중복이므로 저장 안됨
    if (!e) {
      System.out.println("추가하지 못했습니다.");
      System.out.println("E의 hashCode 값 : " + "E".hashCode());    // 유니코드 반환

      boolean isExist = false;
      for (String elements : hashSet) {
        if (elements.hashCode() == "F".hashCode()) {
          isExist = true;
          break;
        }
      }
      if (!isExist) hashSet.add("F");
      else
        System.out.println("F가 이미 존재하여 추가할 수 없습니다.");

      System.out.println("E의 hashCode 값 : " + "E".hashCode());
      System.out.println("F의 hashCode 값 : " + "F".hashCode());

      isExist = false;
      for (String elements : hashSet) {
        if (elements.hashCode() == "G".hashCode()) {
          isExist = true;
          break;
        }
      }
      if (!isExist) hashSet.add("G");
      else
        System.out.println("G가 이미 존재하여 추가할 수 없습니다.");
    }
  }
}
