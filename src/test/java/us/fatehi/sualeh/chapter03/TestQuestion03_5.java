package us.fatehi.sualeh.chapter03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import us.fatehi.sualeh.chapter03.Question03_5.MyQueue;

public class TestQuestion03_5 {

  @Test
  public void test1Question03_5() {

    final MyQueue<Integer> queue = new MyQueue<>();

    queue.add(1);
    queue.add(2);
    queue.add(3);
    queue.add(4);
    queue.add(5);

    assertEquals(5, queue.size());
    assertEquals(1, (int) queue.peek());

    int remove;

    remove = queue.remove();

    assertEquals(4, queue.size());
  final Object two = remove;
    assertEquals(1, two);
    assertEquals(2, (int) queue.peek());

    remove = queue.remove();

    assertEquals(3, queue.size());
  final Object two1 = remove;
    assertEquals(2, two1);
    assertEquals(3, (int) queue.peek());

    queue.add(6);

    assertEquals(4, queue.size());
    assertEquals(3, (int) queue.peek());

    remove = queue.remove();

    assertEquals(3, queue.size());
  final Object two2 = remove;
    assertEquals(3, two2);
    assertEquals(4, (int) queue.peek());
  }
}
