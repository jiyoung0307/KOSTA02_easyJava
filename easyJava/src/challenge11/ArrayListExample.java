package easyJava.src.challenge11;

import java.util.ArrayList;

/**
 * 1. ArrayList를 이용해 '갈매기', '나비', '다람쥐', '라마'를 원소로 입력한 후 각 원소에서
 *    문자열 크기가 2인 단어만 출력하는 프로그램을 작성하시오.
 *
 * 1. ArrayList 선언
 * 2. add함수로 '동물' 추가
 * 3. for-each문과 if 조건문으로 길이 2인 동물만 출력!
 */
public class ArrayListExample {
  public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<>();

    arrayList.add("갈매기");
    arrayList.add("나비");
    arrayList.add("다람쥐");
    arrayList.add("라마");

    for (String animal : arrayList) {
      if(animal.length() == 2) {
        System.out.println(animal);
      }
    }
  }
}
