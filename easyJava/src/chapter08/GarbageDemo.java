package easyJava.src.chapter08;

public class GarbageDemo {
  public static void main(String[] args) {
    for (int i = 0; i < 4; i++) {
      new Garbage(i);   // 만들어짐
      System.gc();      // 삭제함 (요청했다고 바로 오지는 않음)
    }
  }
}

class Garbage {
  int no;
  public Garbage (int no) {
    this.no = no;
    System.out.println("Garbage(" + no + ")가 생성됨");
  }

// finalize
  @Override
  protected void finalize() throws Throwable {
    System.out.println("Garbage(" + no + ")가 수거됨");
  }
}
