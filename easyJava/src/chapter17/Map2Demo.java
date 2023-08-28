package easyJava.src.chapter17;

public class Map2Demo {
  public static void main(String[] args) {
    Nation.nations.stream()
        .map(x -> x.getName())
        .limit(4)
        .forEach(Util::printWithParenthesis);

    //GdpRank를 찍어보자
    Nation.nations.stream()
        .map(x -> x.getGdpRank())
        .forEach(Util::print);
  }
}
