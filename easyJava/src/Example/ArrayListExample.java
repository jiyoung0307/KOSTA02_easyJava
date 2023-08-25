package easyJava.src.Example;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
  public static void main(String[] args) {
    // ArrayList 컬렉션 생성
    List<Board> list = new ArrayList<>();

    // 객체 추가
    list.add(new Board("제목1","내용1","글쓴이1"));
    list.add(new Board("제목2","내용2","글쓴이2"));
    list.add(new Board("제목3","내용3","글쓴이3"));
    list.add(new Board("제목4","내용4","글쓴이4"));
    list.add(new Board("제목5","내용5","글쓴이5"));

    // 저장된 총 객체 수 얻기
    int size = list.size();
    System.out.print("총 객체 수 : " + size);
    System.out.println();

    // 특정 인덱스의 객체 가져오기
    Board board = list.get(2);
    System.out.println(board.getSubject() + "\t" + board.getContent() + "\t" + board.getWriter());    // \t = 수평 탭
    System.out.println();

    // 모든 객체를 하나씩 가져오기
    for (int i = 0; i < list.size(); i++) {
      Board b = list.get(i);
      System.out.println(board.getSubject() + "\t" + board.getContent() + "\t" + board.getWriter());    // \t = 수평 탭
    }
    System.out.println();

    // 객체 삭제
    list.remove(2);   // 2번 인덱스를 삭제하면 3번 인덱스가 2번 인덱스로 변경되므로 다시 2번 인덱스를 제거할 수 있음
    list.remove(2);

    // 향상된 for 문으로 모든 객체를 하나씩 가져오기
    for (Board bd : list) {
      System.out.println(board.getSubject() + "\t" + board.getContent() + "\t" + board.getWriter());
    }
  }
}

class Board {
  // 필드
  private String subject;
  private String content;
  private String writer;

  // 생성자

  public Board(String subject, String content, String writer) {
    this.subject = subject;
    this.content = content;
    this.writer = writer;
  }

  // getter

  public String getSubject() {
    return subject;
  }

  public String getContent() {
    return content;
  }

  public String getWriter() {
    return writer;
  }

  // setter

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public void setWriter(String writer) {
    this.writer = writer;
  }
}
