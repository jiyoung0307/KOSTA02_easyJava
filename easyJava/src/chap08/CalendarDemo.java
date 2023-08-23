package easyJava.src.chap08;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
  public static void main(String[] args) {
    Date now = new Date();
    System.out.println(now);

    /**
     *   Calendar는 abstract라서 new 사용 불가
     *
     *   public static Calendar getInstance()
     *     {
     *         Locale aLocale = Locale.getDefault(Locale.Category.FORMAT);
     *         return createCalendar(defaultTimeZone(aLocale), aLocale);
     *     }
     */
    Calendar c = Calendar.getInstance();
    System.out.println(c);    // java.util.GregorianCalendar 출력

    System.out.printf("%d년 %d월 %d일 입니다. \n" ,
        c.get(Calendar.YEAR),
        c.get(Calendar.MONTH) +1,
        c.get(Calendar.DATE)
    );

    Calendar c1 = Calendar.getInstance();
    System.out.println(c.compareTo(c1));
  }
}
