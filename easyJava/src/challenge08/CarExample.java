package easyJava.src.challenge08;

// 이것이 자바다
// 9장 4번 문제 p422
public class CarExample {
  public static void main(String[] args) {
    Car myCar = new Car();
    Car.Tire tire = myCar.new Tire();
    Car.Engine engine = new Car.Engine();
  }

}

class Car {
  // 인스턴스 멤버 클래스
  // A 객체를 생성해야만 B 객체를 생성할 수 있음
  class Tire {
  }

  // 정적 멤버 클래스
  // A 객체를 생성하지 않아도 B 객체를 생성할 수 있음
  static class Engine {
  }
}
