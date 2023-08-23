package easyJava.src.chap08;

import java.util.Date;

public class SystemDemo {
  public static void main(String[] args) {
    int[] numbers = new int[1000];
    System.out.println(System.currentTimeMillis());
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = i + 1;
    }
    System.out.println(System.currentTimeMillis());   //1970.01.01부터~
    Date date = new Date(1692751573118L);
    System.out.println(date);
  }
}