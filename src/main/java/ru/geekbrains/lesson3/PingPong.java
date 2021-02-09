package ru.geekbrains.lesson3;

public class PingPong {
  public static void main(String[] args) {
    final var TURNS_COUNT = 10;
    new Thread(() -> play("ping", TURNS_COUNT)).start();
    new Thread(() -> play("pong", TURNS_COUNT)).start();
  }

  private static synchronized void play(String name, int turnsCount) {

    while (true) {
      System.out.println(name);

      try {
        PingPong.class.notify();
        -- turnsCount;

        if (turnsCount > 0) {
          PingPong.class.wait();
        } else {
          break;
        }

      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
