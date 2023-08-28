package easyJava.src.chapter17;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class Optional1Demo {
  public static OptionalDouble divide(double x, double y) {
    // 1. 정상적인 경우
    // 2. null인경우 (Optional인 경우)
    return (y == 0) ? OptionalDouble.empty() : OptionalDouble.of(x / y);  // 계산시 오류까지 처리
//    return OptionalDouble.of(x / y);    // OptionalDouble[Infinity] 출력
  }

  public static OptionalInt divide(int x, int y) {
    return y == 0 ? OptionalInt.empty() : OptionalInt.of(x / y);
  }

  public static void main(String[] args) {
    OptionalInt divide = divide(10, 2);
    System.out.println("OptionalInt : " + divide);
    System.out.println("divide.getAsInt() : " + divide.getAsInt());

    OptionalDouble divide1 = divide(10.0, 2.0);
    // Wrapper 클래스처럼 자동으로 감싸져서 나옴
    System.out.println("OptionalDouble divide : " + divide1);
    // 값만 가져오고 싶을 경우
    System.out.println(divide1.getAsDouble());
    System.out.println(10 / 2.0);

    OptionalDouble divideZero = divide(10.0, 0.0);
    System.out.println("divideZero : " + divideZero);   // OptionalDouble.empty

    Optional<String> apple = Optional.of("apple");
    System.out.println("apple : " + apple);   // Optional[apple]
    System.out.println (apple.get());         // apple


  }
}
