package easyJava.src.chapter08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
  public static void main(String[] args) {
    Date date = new Date();
    System.out.println(date);
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    System.out.printf("sdf.format(date) : " + sdf.format(date));
  }
}
