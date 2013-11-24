package us.fatehi.sualeh.chapter02;


import static org.junit.Assert.assertEquals;
import static us.fatehi.sualeh.chapter02.Question02_5.findBeginning;
import static us.fatehi.sualeh.testutil.LinkedListNodeUtil.linkedList;

import org.junit.Test;

import us.fatehi.sualeh.util.LinkedListNode;

public class TestQuestion02_5
{

  @Test
  public void test1Question02_5()
  {
    final LinkedListNode head = linkedList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

    LinkedListNode result;

    result = findBeginning(head);

    assertEquals(null, result);

    // Introduce loop
    LinkedListNode startLoopNode = head;
    for (int i = 0; i < 5; i++)
    {
      startLoopNode = startLoopNode.next;
    }

    LinkedListNode lastNode = head;
    while (lastNode.next != null)
    {
      lastNode = lastNode.next;
    }

    lastNode.next = startLoopNode;

    result = findBeginning(head);

    assertEquals(startLoopNode, result);
  }

}
