package easyJava.src.chap08;

public class StstemDemo {
  public static void main(String[] args) {
    int[] numbers = new int[1000];
    System.out.println(System.currentTimeMillis());
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = i + 1;
    }
  }
}