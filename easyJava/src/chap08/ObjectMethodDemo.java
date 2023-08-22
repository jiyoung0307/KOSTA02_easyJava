package easyJava.src.chap08;

public class ObjectMethodDemo {
  public static void main(String[] args) {
//    Mouse mouse = new Mouse("Samsung");
//    System.out.println(mouse.name);
//    System.out.println(mouse);

//    마우스 제조사가 같은지 확인해보자
    Mouse mouse1 = new Mouse("Samsung");
    Mouse mouse2 = new Mouse("Samsung");
    System.out.println("mouse2 == mouse1 ? : " + (mouse2 == mouse1));   // false 출력(참조변수가 다르기 때문에)

    System.out.println("제조사가 같은가 ? : " + (mouse2.equals(mouse1)));


    Keyboard keyboard = new Keyboard("Samsung");
    System.out.println(keyboard.name);
    System.out.println(keyboard);

    // 키보드 제조사가 같은지 확인해보자
    Keyboard keyboard1 = new Keyboard("Samsung");
    Keyboard keyboard2 = new Keyboard("Samsung");
    System.out.println("keyboard2 == keyboard1 ? : " + (keyboard2 == keyboard1));

    System.out.println("제조사가 같은가 ? " + (keyboard2.equals(keyboard1)));

    System.out.println("keyboard2.equals(mouse2) : " + (keyboard2.equals(mouse2)));

    // GetClass
    Class c = keyboard1.getClass();
    System.out.println("c.getName() : " + (c.getName()));
    System.out.println("c.getSimpleName() : " + (c.getSimpleName()));
    System.out.println("c.getTypeName() : " + (c.getTypeName()));
    System.out.println("c.getPackage().getName() : " + (c.getPackage().getName()));
  }
}

class Mouse {
  String name;

  public Mouse(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "제조사가 " + name + "인 마우스입니다.";
  }

  // 제조사가 같은지 확인해보자
  // Method does not override method from its superclass 발생 -> upCasting DownCasting 사용
//  @Override
//  public boolean equals(Mouse mouse) {
//    return super.equals(mouse);
//  }

  // UpCasting DownCasting 사용
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;      // 참조 변수가 같아?
//    if(obj.getClass() = this.getClass())        // null도 넘어올 수 있으므로 NullPointerException 발생
    if (obj == null || this.getClass() != obj.getClass()) return false;    // 서로 다른 클래스 정보일때 false
    if (this.name.equalsIgnoreCase(((Mouse) obj).name)) {
      return true;
    }
    return false;
//    if (obj instanceof Mouse mouse) {
//      if(this.name.equalsIgnoreCase(mouse.name)) {   // 대문자나 소문자로 적어도 같은지 확인해라
//        return true;
//      }
//    }
//    return false;
  }
}

class Keyboard {
  String name;

  public Keyboard(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "제조사가 " + name + "인 키보드입니다.";
  }

  // 키보드도 제조사가 같은지 확인해보자
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;    // 참조 변수가 같니?
//    if(obj.getClass() = this.getClass()) // null도 넘어올 수 있으므로 NullPointerException 발생
    if (obj == null || this.getClass() != obj.getClass()) return false;  // 서로 다른 클래스 정보일 때 false
    if (this.name.equalsIgnoreCase(((Keyboard) obj).name))
      return true;
    return false;
  }
}