package easyJava.src.chapter18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBDemo1 {
  public static void main(String[] args) {
    /* 1. JDBC URL 설정 */
    // MySQL 데이터베이스에 연결하기 위한 JDBC URL을 설정
    // URL은 "jdbc:mysql://"로 시작하며, 데이터베이스 서버의 주소와 포트, 데이터베이스 이름, 그리고 시간대 설정을 포함함
    String url = "jdbc:mysql://127.0.0.1/sample?serverTimezone=Asia/Seoul";

    /* 2. Connection 객체 생성 */
    // Connection 객체는 데이터베이스 연결을 나타내는 객체
    // 초기에는 null로 초기화
    Connection conn = null;

    /* 3. JDBC 드라이버 로드 및 연결 */
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");    // MySQL JDBC 드라이버를 로드함
      System.out.println("데이터베이스 연결중....");

      conn = DriverManager.getConnection(url, "root", "1111");    // 데이터베이스에 연결
      // "root"는 데이터베이스 사용자 이름
      // "1111"은 해당 사용자의 비밀번호
      System.out.println("데이터베이스 연결 성공!!!");    // 연결이 성공하면 "데이터베이스 연결 성공!!!" 메시지를 출력
      conn.close();   // 연결을 닫음

      /* 4. 예외처리 */
    } catch (SQLException e) {    // SQLException은 데이터베이스 연결 관련 문제를 처리
      //throw new RuntimeException(e);
      System.out.println("JDBC 드라이버를 찾지 못함");
    } catch (ClassNotFoundException e) {    // ClassNotFoundException은 JDBC 드라이버 클래스를 찾지 못할 때 처리
//      throw new RuntimeException(e);
      System.out.println("데이터베이스 연결 실패");
    }
    /* 5. 프로그램 종료 메세지 */
    System.out.println("프로그램 종료");
  }
}