package easyJava.src.chapter09.Generic;

import javax.swing.*;
import java.util.ArrayList;

public class BoxTest {
  public static void main(String[] args) {
/**
 * Generic T로 선언
 *
 * class 클래스이름<타입매개변수> {
 * 필드;
 * 메서드;
 * }
 *
 * Generic T로 사용
 * 제네릭클래스 <적용할 타입> 변수 = new 제네릭틀래스<적용할 타입>();
 */
    Box<Integer> i = new Box<>();


  }
}


class Box<T> {
  private T value;

  public T getValue() {
    return value;
  }

  public void setValue(T value) {
    this.value = value;
  }
}