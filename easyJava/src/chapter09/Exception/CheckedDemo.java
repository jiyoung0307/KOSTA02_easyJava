package easyJava.src.chapter09.Exception;

public class CheckedDemo {
  public static void main(String[] args) throws InterruptedException {
//    방법1) try~catch (Alt + Enter)
//    try {
//      System.out.println("1초간 쉽니다.");
//      Thread.sleep(3000);   // Unhandled exception: java.lang.InterruptedException 발생 -> 예외처리
//      System.out.println("3초간 쉽니다.");
//    } catch (InterruptedException e) {
//      throw new RuntimeException(e);
//    }

//    방법2) throw (Alt + Enter)
    Thread.sleep(1000);
    System.out.println("throw 체크");
  }
}
