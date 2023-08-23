package easyJava.src.chapter09.Generic;

/* 제네릭 타입 응용 */
public class EntryDemo {
  // 구현
  public static void main(String[] args) {
    Entry<String, Integer> entry = new Entry<>();
    // 값을 넣어보자
    entry.setKey("123");
    entry.setValue(20);
    System.out.println(entry.getKey());
    System.out.println(entry.getValue() * 10);

    // 2번째 Entry(뒤집어서)
    Entry<Integer, String> entry1 = new Entry<>();
    entry1.setKey(10);
    entry1.setValue("123");
    System.out.println(entry1.getKey() / 10);
    String str = entry1.getValue();

    boolean isNumeric = true;
    if (str != null) {
      for (int i = 0; i < str.length(); i++) {
        if (!Character.isDigit(str.charAt(i))) {
          isNumeric = false;
          break;
        }
      }
    } else {
      isNumeric = false;
    }


    if (isNumeric)
      System.out.println(Integer.parseInt(str));
    else
      System.out.println(str);

  }
}

// 설계
class Entry<K, V>{
  private K key;
  private V value;

  public K getKey() {
    return key;
  }

  public void setKey(K key) {
    this.key = key;
  }

  public V getValue() {
    return value;
  }

  public void setValue(V value) {
    this.value = value;
  }
}