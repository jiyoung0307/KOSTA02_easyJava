package easyJava.src.chapter17;

public class Reduce2Demo {
  public static void main(String[] args) {
    Nation.nations.stream()
        .reduce((x,y) -> x.getPopulation() > y.getPopulation() ? x : y)
        .ifPresent(System.out::println);
  }
}
