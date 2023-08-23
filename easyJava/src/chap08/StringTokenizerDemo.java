package easyJava.src.chap08;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
  public static void main(String[] args) {
    String s = "of the people, by the people, for the people";
    StringTokenizer st = new StringTokenizer(s);
    System.out.println("st.countTokens() : " + st.countTokens());   // blank제외하고 count

    StringTokenizer st1 = new StringTokenizer(s, ",");
    System.out.println("st1.countTokens() : " + st1.countTokens());

    while (st.hasMoreTokens()) {
      System.out.println("st.nextToken() : " + st.nextToken());
    }

    while (st1.hasMoreTokens()) {
      System.out.println("st1.nextToken() : " + st1.nextToken());
    }

//    st1 = new StringTokenizer(s, ",");
    while (st1.hasMoreTokens()) {
      System.out.println("st1.nextToken() : " + st1.nextToken());
    }
  }
}
