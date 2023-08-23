package easyJava.src.chapter09.Exception;

import java.util.Scanner;

public class ThrowsDemo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
//    ctrl + alt + t
    try {
      square(sc.nextLine());
    } catch (NumberFormatException e) {
      System.out.println("정수가 아닙니다.");
    }
  }

  private static void  square(String s) throws NumberFormatException {
    int n = Integer.parseInt(s);
    System.out.println("정수입니다. : " + n * n);
  }
}
