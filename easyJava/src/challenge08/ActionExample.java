package easyJava.src.challenge08;

// 이것이 자바다
// 9장 5번 문제 p423
public class ActionExample {
  public static void main(String[] args) {
    Action action = new Action() {
      @Override
      public void work() {
        System.out.println("복사를 합니다.");
      }
    };
    action.work();
  }
}

interface Action {
  public void work();
}
