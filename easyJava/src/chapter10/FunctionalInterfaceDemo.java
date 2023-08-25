package easyJava.src.chapter10;

public class FunctionalInterfaceDemo {
  public static void main(String[] args) {
    MyFunction f = (a, b) -> a > b ? a : b ;

    int max = f.max(4, 6);
    System.out.println(max);
  }
}

// 함수형 인터페이스임을 보장하기 위해 @FunctionalInterface 어노테이션을 붙임
// 컴파일 과정에서 추상 메소득 하나인지 검사하기 때문에 정확한 함수형 인터페이스를 작성할 수 있게 도와주는 역할
@FunctionalInterface
interface MyFunction {
  int max(int a, int b);
//  int min(int a, int b);
}
