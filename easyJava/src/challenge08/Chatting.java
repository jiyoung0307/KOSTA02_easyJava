package easyJava.src.challenge08;

// 이것이 자바다
// 9장 7번 문제
// p425
public class Chatting {
  class Chat {
    void start() {
    }
    void sendMessage(String message) {
    }
  }

  void startChat(String chatId) {
    /**
     * nickName은 final의 특성을 갖기 때문에 nickName = chatId처럼 값을 변경할 수 없다.
     * 따라서 String nickName = null;과 nickName = chatId;를 제거하고 대신
     * String nickMame = chatId;를 넣어햐 한다.
     */
//    String nickName = null;
//    nickName = chatId;
    String nickName = chatId;

    Chat chat = new Chat() {
      @Override
      public void start() {
        while (true) {
          String inputData = "안녕하세요";
          String message = "[" + nickName + "]" + inputData;
          sendMessage(message);
        }
      }
    };

    chat.start();
  }
}
