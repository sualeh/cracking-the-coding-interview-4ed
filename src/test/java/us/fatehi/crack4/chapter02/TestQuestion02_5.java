package us.fatehi.crack4.chapter02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static us.fatehi.crack4.chapter02.Question02_5.findBeginning;
import static us.fatehi.crack4.testutil.LinkedListNodeUtil.linkedList;

import org.junit.jupiter.api.Test;

import us.fatehi.crack4.util.LinkedListNode;

public class TestQuestion02_5 {

  @Test
  public void test1Question02_5() {
    final LinkedListNode head = linkedList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

    LinkedListNode result;

    result = findBeginning(head);
    final Object two = result;

    assertEquals(null, two);

    // Introduce loop
    LinkedListNode startLoopNode = head;
    for (int i = 0; i < 5; i++) {
      startLoopNode = startLoopNode.next;
    }

    LinkedListNode lastNode = head;
    while (lastNode.next != null) {
      lastNode = lastNode.next;
    }

    lastNode.next = startLoopNode;

    result = findBeginning(head);
    final Object one = startLoopNode;
    final Object two1 = result;

    assertEquals(one, two1);
  }
}
