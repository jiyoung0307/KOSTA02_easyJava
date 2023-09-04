package easyJava.src.chapter18;

import java.sql.*;

public class DBDemo3 {
  /*  Java를 사용하여 MySQL 데이터베이스에 연결하고, PreparedStatement를 사용하여 데이터를 추가하고 수정하는 예제 */

  /* 2. main() */
  public static void main(String[] args) throws SQLException {
    // makeConnection 메서드를 호출하여 데이터베이스 연결을 설정
    Connection conn = makeConnection();

    /* 3. 데이터 추가 */
    // 데이터베이스에 데이터를 추가하는 SQL 쿼리를 실행
    // PreparedStatement를 사용하여 쿼리를 준비
    // setString 메서드를 통해 매개변수에 값을 설정한 후 executeUpdate를 호출하여 쿼리를 실행
    String sql = "insert into person (name, phone, email) values (?, ?, ?);";

    PreparedStatement preparedStatement = conn.prepareStatement(sql);

    preparedStatement.setString(1, "김연아");
    preparedStatement.setString(2, "015");
    preparedStatement.setString(3, "kya1@naver.com");

    int i = preparedStatement.executeUpdate();

    /* 5. 결과 출력 */
    // 각각의 SQL 쿼리 실행 결과에 따라 성공 또는 실패 메시지를 출력
    if (i == 1) System.out.println("데이터 추가 성공");
    else System.out.println("데이터 추가 실패");

    /* 4. 데이터 수정 */
    // 데이터베이스의 데이터를 수정하는 SQL 쿼리를 실행
    // PreparedStatement를 사용하여 쿼리를 준비
    // setString 메서드를 통해 매개변수에 값을 설정한 후 execute를 호출하여 쿼리를 실행
    String sql1 = "update person set email = ? where phone = ?;";
    PreparedStatement ps = conn.prepareStatement(sql1);
    ps.setString(1, "hkd@naver.com");
    ps.setString(2, "013");

    boolean execute = ps.execute();
    if (!execute) System.out.println("데이터 수정 성공");
    else System.out.println("데이터 수정 실패");

    /* 6. 연결 및 자원 관리 */
    // 데이터베이스 연결과 PreparedStatement 객체를 사용한 후에는 명시적으로 닫아주어야 함
    // 이렇게 하면 리소스 누수를 방지
    conn.close();
    ps.close();
    preparedStatement.close();
  }

  /* 1. makeConnection() */
  static Connection makeConnection() {
    String url = "jdbc:mysql://127.0.0.1/sample?serverTimezone=Asia/Seoul";   // 데이터베아스에 연결하는 역할
    // DriverManager를 사용하여 MySQL JDBC 드라이버를 로드하고, 데이터베이스에 연결을 시도
    // 연결이 성공하면 Connection 객체를 반환

    Connection conn = null;

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      System.out.println("데이터베이스 연결중....");
      conn = DriverManager.getConnection(url, "root", "1111");
      System.out.println("데이터베이스 연결 성공!!!");
      //conn.close();
    } catch (SQLException e) {
      //throw new RuntimeException(e);
      System.out.println("JDBC 드라이버를 찾지 못함");
    } catch (ClassNotFoundException e) {
//      throw new RuntimeException(e);
      System.out.println("데이터베이스 연결 실패");
    }
    return conn;
  }
}