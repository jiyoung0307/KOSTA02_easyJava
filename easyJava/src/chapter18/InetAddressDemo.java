package easyJava.src.chapter18;

import java.net.InetAddress;

/* 1. InetAddress 클래스 임포트 */
//  InetAddress 클래스와 UnknownHostException 예외를 사용하기 위해 필요한 패키지를 임포트
import java.net.InetAddress;
import java.net.UnknownHostException;

import java.util.Scanner;

/* Java를 사용하여 호스트 이름을 입력 받고, 해당 호스트의 IP 주소와 로컬 시스템의 IP 주소를 출력하는 간단한 예제 */
// 사용자로부터 호스트 이름을 입력받아 해당 호스트의 IP 주소와 로컬 시스템의 IP 주소를 출력하는 간단한 네트워크 관련 예제
public class InetAddressDemo {

  /* 2. main() */
  public static void main(String[] args) {
    InetAddress addr1 = null, addr2 = null;   // 메인 메서드에서는 두 개의 InetAddress 객체 addr1과 addr2를 선언

    System.out.print("호스트 이름을 입력하세요 : ");
    Scanner in = new Scanner(System.in);    // 사용자로부터 호스트 이름을 입력받기 위해 Scanner를 사용
    String url = in.nextLine();


    try {
      // InetAddress.getByName(url) 메서드를 사용하여 입력받은 호스트 이름에 대한 InetAddress 객체를 얻어옴
      // 이 메서드는 해당 호스트의 IP 주소를 찾아옴
      addr1 = InetAddress.getByName(url);

      // InetAddress.getLocalHost() 메서드를 사용하여 로컬 시스템의 InetAddress 객체를 얻어옴
      addr2 = InetAddress.getLocalHost();
    } catch (UnknownHostException e) {    // 호스트 이름을 찾지 못한 경우에 대한 오류 처리
      throw new RuntimeException(e);
    }
    // 입력한 호스트 이름과 해당 호스트의 IP 주소, 로컬 시스템의 IP 주소를 출력
    System.out.println(url + ":" + addr1.getHostAddress());
    System.out.println("local IP : " + addr2.getHostAddress());
  }
}