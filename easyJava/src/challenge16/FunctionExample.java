package easyJava.src.challenge16;

import java.util.function.Function;

public class FunctionExample {
  public static double calc(FunctionEx fun) {
    double x = 10;
    double y = 4;
    return fun.apply(x, y);
  }
  public static void main(String[] args) {
    double div = calc( (x, y) -> x / y );
    double plus = calc( (x,y) -> x + y);
    double minus = calc( (x,y) -> x - y);
    double multiply = calc((x,y) -> x * y );

    System.out.println("result: " + div);
    System.out.println("result: " + plus);
    System.out.println("result: " + minus);
    System.out.println("result: " + multiply);
  }
}

@FunctionalInterface
interface FunctionEx{
  double apply(double x, double y);
}
