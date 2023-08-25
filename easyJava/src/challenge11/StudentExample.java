package easyJava.src.challenge11;

import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * 4. 키보드로 입력한 정수 값을 학생의 점수로 사용하며 ArrayList에 저장한다. 입력된 정수값이 음수면 입력의 끝이다.
 * 점수 중에서 최고 점수부터 최고 점수 -10점 이상은 A, 최고점수 -10 미만부터
 * 최고 점수 -20점 이상은 B처럼 등급을 배정한 후 출력하는 프로그램을 작성하시오
 */
public class StudentExample {
  public static void main(String[] args) {
    int input, max;
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> score = new ArrayList<>();

    do{
      System.out.print("점수를 입력하세요 : ");
      input = sc.nextInt();
      if(input >= 0) {
        score.add(input);
      }
    } while (input >= 0);

    System.out.println("전체 학생은 " + score.size() + "명이다.");
    System.out.print("학생들의 성적");
    for (int scores : score) {
      System.out.println(scores + " ");
      System.out.println();
      max = Collections.max(score);

      StudentExample check = new StudentExample();

      for (int i = 0; i < score.size(); i++) {
        System.out.println(i + "번 학생의 성적은 " + score.get(i) + "점이며 등급은 " +  check.rating(score.get(i),max) + "이다.");
      }
    }
  }
  public String rating(int score, int max) {
    if(score >= max - 10) {
      return "A";
    } else if (score < max-10 && score >= max-20) {
      return "B";
    } else if (score < max-20 && score >= max-30) {
      return "C";
    } else if (score < max-30 && score >= max-40) {
      return "D";
    } else {
      return "F";
    }
  }
}

/*강사님 답*/

//  public class ArrayListScoreExample {
//    static ArrayList<Integer> scoreArray = new ArrayList<>();
//    public static void main(String[] args) {
//      Scanner in = new Scanner(System.in);
////    ArrayList<Integer> scoreArray = new ArrayList<>();
//      int score = 0;
//      while(true){
//        System.out.print("학생의 점수를 입력하세요. (종료하려면 -1 입력) : ");
//        score = in.nextInt();
//        if(score < 0) {
//          // 학생의 정보 출력
//          printScore();
//          // 최고 점수 구하기
//          int maxScore = getMaxScore();
//          // 성적 처리
//          printGrade(maxScore);
//          break;
//        }
//        // 학생의 정보 추가
//        scoreArray.add(score);
//      }
//    }
//
//    static void printScore(){
//      // 학생의 정보 출력
//      System.out.printf("전체 학생은 %d 명이다.\n", scoreArray.size());
//      System.out.print("학생들의 성적 : ");
//      for (int score : scoreArray) {
//        System.out.print(score + " ");
//      }
//      System.out.println();
//    }
//
//    static void printGrade(int maxScore){
//      // 학생의 성적 처리
//      int score = 0;
//      for (int i = 0; i < scoreArray.size() ; i++) {
//        score = scoreArray.get(i);
//        if(score - maxScore > -10)
//          System.out.printf("%d 번 학생의 성적은 %d 이며 등급은 A이다.\n", i, score);
//        else if(score - maxScore > -20)
//          System.out.printf("%d 번 학생의 성적은 %d 이며 등급은 B이다.\n", i, score);
//        else
//          System.out.printf("%d 번 학생의 성적은 %d 이며 등급은 C이다.\n", i, score);
//      }
//
//      System.out.println();
//    }
//
//    static int getMaxScore(){
//      Integer[] sArray = scoreArray.toArray(new Integer[0]);
//      Arrays.sort(sArray);
//      return sArray[sArray.length -1];    // 맨 뒤에 있는 값 리턴
//    }
//  }