package easyJava.src.chapter09.Generic;

import java.util.ArrayList;

public class GenericClass1Demo {
  public static void main(String[] args) {
    /**
     * 제네릭 : 포괄적인, 타입을 결정하지 않고 클래스를 설계
     * - 필드선언할때 타입이 필요, 생성자의 매개변수 등에 타입이 들어감
     *  - 실제로 사용을 할때는 구체적인 타입이 결정이 되어야 하지만 설계할때는 구체적 타입을 언급하지않고 사용할 때 구체적인 타입을 결정함
     * 제네릭 타입 의미)
     * - 하나의 코드로 다양한 타입의 객체에 재사용하는 객체지향 기법
     * - 결정되지 않은 타입을 파라미터를 갖는 클래스와 인터페이스를 제네릭 타입이라고 함
     * - 클래스, 인터페이스, 메서드를 정의할 떄 타입을 변수로 사용
     *
     * 장점)
     * - 컴파일할 때 실행 도중 발생할 오류 사전 방지(타입의 안정성 제공)
     * - 불필요한 타입 변환이 없어 플로그램 성능 향상(타입체크와 형변환 생략 가능 / 코드 간결해짐)
     *
     * 필요성)
     * - 자바는 다양한 종류의 객체를 관리하는 컬렉션이라는 자료구조를 제공
     * - 초기에는 Object 타입(모든 객체의 최상위 부모 클래스)의 컬렉션을 사용
     * - 사용할 때는 형변환해서 체크
     */

    ArrayList<Boricha> arrayListBoricha = new ArrayList<>();
    arrayListBoricha.add(new Boricha());
    //arrayListBoricha.add(new Beer());

    ArrayList<Beer> arrayListBeer = new ArrayList<>();
    arrayListBeer.add(new Beer());
    //arrayListBeer.add(new Boricha())


    Cup c = new Cup();    // Raw 타입
    c.setBeverage(new Boricha());
    if (c.getBeverage() instanceof Boricha) {
      Boricha boricha = (Boricha) c.getBeverage();
    } else if (c.getBeverage() instanceof Beer) {
      Beer beer = (Beer) c.getBeverage();
    }

    c.setBeverage(new Beer());
//    Beer beer = (Beer) c.getBeverage();
    Boricha bori = (Boricha) c.getBeverage();   // 동적 바인딩
    bori.drink();

    c.setBeverage(new Beverage());
//    c.setBeverage(new Object());     // 범위를 한정했으므로 error 발생
    //beer= (Beer) c.getBeverage();    // error 발생
    Boricha bev = (Boricha) c.getBeverage();

    Cup<Boricha> borichaCup = new Cup();
    borichaCup.setBeverage(new Boricha());
    Boricha boricha = borichaCup.getBeverage();

    Cup<Beer> beerCup = new Cup<>();
    beerCup.setBeverage(new Beer());
    //beerCup.setBeverage(new Boricha());
    Beer beverage = beerCup.getBeverage();
  }
}

/* Generic T로 선언 */

class Beverage {
}

class Boricha extends Beverage {
  void drink() {
    System.out.println("어린아이만 마실 수 있다.");
  }
}

class Beer extends Beverage {
  void cheers() {
    System.out.println("어른만 마실 수 있다.");
  }
}

class Cup<T extends Beverage> {   // Beverage를 상속 받은 애들로만 범위 한정
  private T beverage;

  public T getBeverage() {
    return beverage;
  }

  public void setBeverage(T beverage) {
    this.beverage = beverage;
  }
}
