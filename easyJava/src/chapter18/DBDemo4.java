package easyJava.src.chapter18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/* Java를 사용하여 MySQL 데이터베이스에서 데이터를 삭제하는 예제 */
public class DBDemo4 {
  // Delete 구현
  /* 2. main() */
  public static void main(String[] args) throws SQLException {
    Connection conn = makeConnection();                                 // makeConnection 메서드를 호출하여 데이터베이스 연결을 설정

    /* 3. 데이터 삭제 */
    String sql = "delete from person where phone = ? ;";                // 데이터베이스에서 데이터를 삭제하는 SQL 쿼리를 실행

    PreparedStatement preparedStatement = conn.prepareStatement(sql);   // PreparedStatement를 사용하여 쿼리를 준비
    preparedStatement.setString(1, "014");              // setString 메서드를 통해 매개변수에 값을 설정
    int i = preparedStatement.executeUpdate();                          // executeUpdate를 호출하여 쿼리를 실행

    /* 4. 결과 출력 */
    // SQL 쿼리 실행 결과에 따라 데이터 삭제가 성공했는지 여부를 판단하고 그에 따른 메시지를 출력
    if (i == 1) System.out.println("데이터 삭제 성공");
    else System.out.println("데이터 삭제 실패");

    /* 5. 연결 및 자원 관리 */
    conn.close();   // 데이터베이스 연결과 PreparedStatement 객체를 사용한 후에는 명시적으로 닫아주어야 함. 이렇게 하면 리소스 누수를 방지
    preparedStatement.close();
  }

  /* 1. makeConnection()  */
  static Connection makeConnection() {    // 데이터베이스에 연결하는 역할
    // DriverManager를 사용하여 MySQL JDBC 드라이버를 로드
    // 데이터베이스에 연결을 시도
    // 연결이 성공하면 Connection 객체를 반환
    String url = "jdbc:mysql://127.0.0.1/sample?serverTimezone=Asia/Seoul";

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