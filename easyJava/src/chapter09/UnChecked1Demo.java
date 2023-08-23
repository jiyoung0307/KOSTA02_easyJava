package easyJava.src.chapter09;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class UnChecked1Demo {
  public static void main(String[] args) {
    String s = "Time is money";
    StringTokenizer st = new StringTokenizer(s);
    while (st.hasMoreTokens()) {
      System.out.println(st.nextToken());
    }
//    NoSuchElementException 객체
//    System.out.println(st.nextToken());
  }
}
