package easyJava.src.chapter09;

public class UnChecked2Demo {
  public static void main(String[] args) {
    int[] array = {1, 2, 3};

//    ArrayIndexOutOfBoundsException 발생
    System.out.println(array[3]);
  }
}
