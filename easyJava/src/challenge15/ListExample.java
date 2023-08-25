package easyJava.src.challenge15;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * 이것이 자바다
 * chap 15 7번 문제
 */

public class ListExample {
  public static void main(String[] args) {
    BoardDao dao = new BoardDao();
    List<Board> list = dao.getBoardList();
    for (Board board : list) {
      System.out.println(board.getTitle() + "-" + board.getContent());
    }

  }
}

/* 이 부분 추가 */
class BoardDao {
  public List<Board> getBoardList() {
//    ArrayList<Board> boardList = new ArrayList<>()
    List<Board> list = new ArrayList<Board>();    // 인터페이스를 반환타입으로 쓰는 게 좋다. (v) 이 방법이 위 방법보다 좋다.
    list.add(new Board("제목1", "내용1"));
    list.add(new Board("제목2", "내용2"));
    list.add(new Board("제목3", "내용3"));
    return list;
  }
}

class Board {
  private String title;
  private String content;

  public Board(String title, String content) {
    this.title = title;
    this.content = content;
  }

  public String getTitle() {
    return title;
  }

  public String getContent() {
    return content;
  }
}
