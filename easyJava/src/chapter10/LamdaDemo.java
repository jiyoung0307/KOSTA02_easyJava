package easyJava.src.chapter10;

public class LamdaDemo {
  public static void main(String[] args) {
    Object obj = new Object() {
      int max(int a, int b) {
        return a > b ? a : b;
      }
    };

    // max는 자식의 메소드이므로 부모(obj)에서는 나오지 않음
    // 부모가 자식의 메소드를 사용하고 싶을 경우 함수형 인터페이스를 사용하면 된다.
//    int max = obj.max(3, 5);
  }
}
