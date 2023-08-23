package easyJava.src.chapter09;

public class ExceptionHandlingDemo {
  public static void main(String[] args) {
    int i = 0;
    String s = null;
//    Ctrl + Alt + T => 문장 자동완성 단축키
    try {
      s.length();       // NullPointerException 발생
      int res = 10/i;   // ArithmeticException 발생
    } catch (ArithmeticException e) {
      // 직접 처리
      System.out.println("ArithmeticException 처리 : 0으로 나눌 수 없습니다.");
    } catch (NullPointerException e) {
      System.out.println("NullPointerException 처리 : 문자열의 내용이 없습니다.");
    } finally {
      // finally => error에서 걸리던 안걸리던 무조건 실행
      System.out.println("프로그램을 종료합니다.");
    }
  }
}
