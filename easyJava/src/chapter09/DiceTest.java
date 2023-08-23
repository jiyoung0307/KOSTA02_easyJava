package easyJava.src.chapter09;

import java.util.Random;

public class DiceTest {
  public static void main(String[] args) {
    System.out.println(new Dice().roll());
  }
}

class Dice {
  int roll() {
    return (int) (Math.random() * 6 + 1);
  }
}
