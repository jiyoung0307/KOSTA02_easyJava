package easyJava.src.chapter10;

public class LamdaParameterDemo {
  public static void main(String[] args) {
    MyFunction f = (a, b) -> a > b ? a : b;     // 익명객체를 이용해서 참조 변수를 만들고
    myMethod(f);
    MyFunction myFunction = myFunction2();
    myFunction.max(10,20);
    System.out.println("myFunction.max(10,20) : " + (myFunction.max(10,20)));
  }

  static void myMethod(MyFunction f) {
    System.out.println("f.max(3, 5) : " + (f.max(3, 5)));
  }

  static MyFunction myFunction2(){
    MyFunction f = (a, b) -> a > b ? a : b;
    return f;
  }
}