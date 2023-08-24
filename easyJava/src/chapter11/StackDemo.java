package easyJava.src.chapter11;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {
  public static void main(String[] args) {
    Stack<String> stack = new Stack<>();  // stack은 클래스이므로 new 사용 가능
    System.out.println("stack.empty() : " + (stack.empty()));

    stack.push("main");
    stack.push("add");
    stack.push("println");

    Iterator<String> iterator = stack.iterator();
    while (iterator.hasNext()) {
      System.out.print(iterator.next() + ",");
    }
    System.out.println();
    System.out.println(stack.size());

//    for (int i = 0; i < stack.size(); i++) {
//      System.out.println(stack);
//      stack.pop();
//    }

    while (!stack.empty()) {
      System.out.println(stack);
      System.out.println(stack.pop() + "이 종료되었습니다.");   // 뭐가 삭제되었는지 확인해보자
    }
    if(!stack.empty()) {
      System.out.println("프로그램을 종료합니다.");
    }
    stack.add("Vector");
    stack.add("List");
    System.out.println(stack);
    System.out.println(stack.peek());
    System.out.println(stack.pop() + "를 삭제했습니다.");
  }
}
