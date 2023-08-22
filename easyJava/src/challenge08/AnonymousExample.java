package easyJava.src.challenge08;

// 이것이 자바다
// 9장 6번 문제 p423
public class AnonymousExample {
  public static void main(String[] args) {
    Anonymous anony = new Anonymous();
//    익명의 객체 필드 사용
    anony.field.run();

//    익명 객체 로컬변수 사용
    anony.method1();

//    익명 객체 매개값 사용
    anony.method2(new Vehicle() {
      @Override
      public void run() {
        System.out.println("트럭이 달립니다.");
      }
    });
  }
}

interface Vehicle {
  public void run();
}

class Anonymous {
  Vehicle field = new Vehicle() {
    @Override
    public void run() {
      System.out.println("자전거가 달립니다.");
    }
  };

  void method1() {
    Vehicle localVar = new Vehicle() {
      @Override
      public void run() {
        System.out.println("승용차가 달립니다.");
      }
    };
    localVar.run();
  }

  void method2(Vehicle v) {
    v.run();
  }
}