package easyJava.src.challenge15;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
  public static void main(String[] args) {
    Set<Student> set = new HashSet<Student>();

    set.add(new Student(1, "홍길동"));
    set.add(new Student(2, "신용권"));
    set.add(new Student(1, "조민우"));

    System.out.println("저장된 객체 수 : " + set.size());
    for (Student s : set) {
      System.out.println(s.studentNum + ":" + s.name);
    }
  }
}

class Student{
  int studentNum;
  String name;

  public Student (int studentNum, String name) {
    this.studentNum = studentNum;
    this.name = name;
  }

  // 여기에 코드를 작성하세요
  @Override
  public int hashCode() {
    // int의 해시코드는 자기 자신임!!
    return studentNum;
  }

  @Override
  public boolean equals(Object obj) {
    if(obj != null && obj instanceof Student student) {
      if(student.hashCode() == this.hashCode())
        return true;
    }
    return false;
  }
}
