package easyJava.src.chapter18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/* Java를 사용하여 MySQL 데이터베이스에 데이터를 추가하고 수정하는 예제 */
public class DBDemo5 {
  /* 2. main() */
  // select 구현
  public static void main(String[] args) throws SQLException {
    Connection conn = makeConnection();   // makeConnection 메서드를 호출하여 데이터베이스 연결을 설정

    /* 3. 데이터 추가 */
    // 데이터베이스에 데이터를 추가하는 SQL 쿼리를 실행
    String sql = "insert into person (name, phone, email) values (?, ?, ?);";
    PreparedStatement preparedStatement = conn.prepareStatement(sql);   // PreparedStatement를 사용하여 쿼리를 준비
    preparedStatement.setString(1, "김연아");            // setString 메서드를 통해 매개변수에 값을 설정
    preparedStatement.setString(2, "015");              // setString 메서드를 통해 매개변수에 값을 설정
    preparedStatement.setString(3, "kya1@naver.com");   // setString 메서드를 통해 매개변수에 값을 설정
    int i = preparedStatement.executeUpdate();                          // executeUpdate를 호출하여 쿼리를 실행

    /* 5. 결과 출력 */
    // SQL 쿼리 실행 결과에 따라 성공 또는 실패 메시지를 출력
    if (i == 1) System.out.println("데이터 추가 성공");
    else System.out.println("데이터 추가 실패");

    /* 4. 데이터 수정 */
    String sql1 = "update person set email = ? where phone = ?;";   // 데이터베이스의 데이터를 수정하는 SQL 쿼리를 실행
    PreparedStatement ps = conn.prepareStatement(sql1);  // PreparedStatement를 사용하여 쿼리를 준비
    ps.setString(1, "hkd@naver.com")  ;  // setString 메서드를 통해 매개변수에 값을 설정
    ps.setString(2, "013");              // setString 메서드를 통해 매개변수에 값을 설정
    boolean execute = ps.execute();   // execute를 호출하여 쿼리를 실행

    /* 5. 결과 출력 */
    // SQL 쿼리 실행 결과에 따라 성공 또는 실패 메시지를 출력
    if (!execute) System.out.println("데이터 수정 성공");
    else System.out.println("데이터 수정 실패");

    /* 6. 연결 및 자원 관리 */
    conn.close();   // 데이터베이스 연결 후 사용이 끝나면 닫아줌
    ps.close();     // PreparedStatement 객체를 사용한 후에는 명시적으로 닫아주어야 함. 이렇게 하면 리소스 누수를 방지 가능
    preparedStatement.close();
  }

  /* 1. makeConnection() */
  static Connection makeConnection() {    // 데이터베이스에 연결하는 역할
    String url = "jdbc:mysql://127.0.0.1/sample?serverTimezone=Asia/Seoul";   // DriverManager를 사용하여 MySQL JDBC 드라이버를 로드하고, 데이터베이스에 연결을 시도
    Connection conn = null;   // 연결이 성공하면 Connection 객체를 반환

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