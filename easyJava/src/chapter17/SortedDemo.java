package easyJava.src.chapter17;

import java.util.Comparator;
import java.util.stream.Stream;

public class SortedDemo {
  public static void main(String[] args) {
    Stream<String> s1 = Stream.of("a1", "a2", "d2", "b1", "c1");
    System.out.print("순서대로 정렬하기 : ");
    s1.sorted()
        .forEach(Util::print);
    System.out.println();

    // d2, c2, b1, a2, a1
    s1 = Stream.of("a1", "a2", "d2", "b1", "c1");
    System.out.print("반대로 정렬하기 (방법1) : ");
    s1.sorted(new Comparator<String>() {
          @Override
          public int compare(String o1, String o2) {
            // Natural Sort의 경우 o1 - o2 이므로 오버라이드해서 o2 - o1이 되게 만듦
            return o2.hashCode() - o1.hashCode();
          }
        })
        .forEachOrdered(Util::print);
    System.out.println();

    System.out.print("반대로 정렬하기 (방법2) : ");
    s1 = Stream.of("a1", "a2", "d2", "b1", "c1");
    s1.sorted((x, y) -> y.hashCode() - x.hashCode())
        .forEach(Util::print);

    System.out.print("\n나라 이름 순서 : ");
    Nation.nations.stream()
        .sorted(Comparator.comparing(x -> x.getName()))
        .map(x -> x.getName())
        .forEach(Util::printWithParenthesis);

    System.out.print("\nGDP 순서 : ");
    Nation.nations.stream()
        .sorted(Comparator.comparing(x -> x.getGdpRank()))
        .map(x -> x.getName())
        .forEach(Util::printWithParenthesis);
    System.out.println();

  }
}
