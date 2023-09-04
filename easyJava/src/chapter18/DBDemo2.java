package easyJava.src.chapter18;

import java.sql.*;

public class DBDemo2 {
  /*  Java를 사용하여 MySQL 데이터베이스에 연결하고, SQL 쿼리를 실행하여 데이터를 추가하는 예제 */

  /* 2. 메인 메서드 */
  public static void main(String[] args) throws SQLException {
    Connection conn = makeConnection();              // makeConnection 메서드를 호출하여 데이터베이스 연결을 설정
    Statement statement = conn.createStatement();    // Statement 객체를 생성 (Statemebt 객체는 SQL 문장을 실행하기 위해 사용)

    /* 3. SQL 쿼리 실행 */
    String sql = "insert into person (name, phone, email) values ('홍길동', '013' , 'kya@naver.com');";

//    PreparedStatement preparedStatement = conn.prepareStatement(sql);
//    preparedStatement.setString(1, "김연아");
//    preparedStatement.setString(2, "012");
//    preparedStatement.setString(3, "kya@naver.com");

    int i = statement.executeUpdate(sql);  // executeUpdate 메서드를 사용하여 쿼리를 실행하고, 실행 결과로 영향을 받는 레코드 수를 반환함

    /* 4. 결과 출력 */
    // executeUpdate 메서드의 반환값을 통해 데이터 추가가 성공했는지 여부를 판단하고 그에 따른 메시지를 출력
    if (i == 1) System.out.println("데이터 추가 성공");
    else System.out.println("데이터 추가 실패");

    /* 5. 연결 및 Statement 객체 닫기 */
    // 데이터베이스 연결과 Statement 객체를 사용한 후에는 명시적으로 닫아주어야 함. 이렇게 하면 리소스 누수를 방지 가능

    conn.close();
    statement.close();
  }

  /* 1. makeConnection() : 데이터베이스에 연결하는 역할 */
  static Connection makeConnection() {
    // DriverManager를 사용하여 MySQL JDBC 드라이버를 로드하고,
    // 데이터베이스에 연결을 시도합니다. 연결이 성공하면 Connection 객체를 반환
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