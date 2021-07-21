package us.fatehi.sualeh.chapter02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static us.fatehi.sualeh.chapter02.Question02_4.addLists;
import static us.fatehi.sualeh.testutil.LinkedListNodeUtil.linkedList;
import static us.fatehi.sualeh.testutil.LinkedListNodeUtil.toList;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import us.fatehi.sualeh.util.LinkedListNode;

public class TestQuestion02_4 {

  @Test
  public void test1Question02_4() {
    final LinkedListNode num1 = linkedList(3, 1, 5);
    final LinkedListNode num2 = linkedList(5, 9, 2);

    LinkedListNode result = addLists(num1, num2, false);

    assertEquals(Arrays.asList(8, 0, 8), toList(result));

    result = addLists(num2, num1, false);

    assertEquals(Arrays.asList(8, 0, 8), toList(result));
  }

  @Test
  public void test2Question02_4() {
    final LinkedListNode num1 = linkedList(3, 1, 5, 7);
    final LinkedListNode num2 = linkedList(5, 9, 2);

    final LinkedListNode result = addLists(num1, num2, false);

    assertEquals(Arrays.asList(8, 0, 8, 7), toList(result));
  }

  @Test
  public void test3Question02_4() {
    final LinkedListNode num1 = linkedList(3, 1, 5, 7);

    final LinkedListNode result = addLists(num1, null, false);

    assertEquals(Arrays.asList(3, 1, 5, 7), toList(result));
  }
}
