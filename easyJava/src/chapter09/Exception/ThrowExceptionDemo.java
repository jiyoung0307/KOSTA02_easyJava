package easyJava.src.chapter09.Exception;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;

public class ThrowExceptionDemo {
  public static void main(String[] args) throws IOException, InterruptedException {
    write("a.txt");
  }

  static void write(String filename) throws IOException, InterruptedException {
    try {
      System.out.println(filename + "파일을 저장합니다.");
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
