package us.fatehi.crack4.chapter02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static us.fatehi.crack4.chapter02.Question02_3.deleteNode;
import static us.fatehi.crack4.testutil.LinkedListNodeUtil.linkedList;
import static us.fatehi.crack4.testutil.LinkedListNodeUtil.toList;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import us.fatehi.crack4.util.LinkedListNode;

public class TestQuestion02_3 {

  @Test
  public void test1Question02_3() {
    final LinkedListNode linkedList = linkedList(1, 2, 3, 1, 4, 5, 1);

    LinkedListNode nodeToDelete = linkedList;
    for (int i = 0; i < 5; i++) {
      nodeToDelete = nodeToDelete.next;
    }

    final boolean deleted = deleteNode(nodeToDelete);

    assertTrue(deleted);
    assertEquals(Arrays.asList(1, 2, 3, 1, 4, 1), toList(linkedList));
  }

  @Test
  public void test2Question02_3() {
    final LinkedListNode linkedList = linkedList(1, 2, 3, 1, 4, 5, 1);

    LinkedListNode nodeToDelete = linkedList;
    for (int i = 0; i < 6; i++) {
      nodeToDelete = nodeToDelete.next;
    }

    final boolean deleted = deleteNode(nodeToDelete);

    assertTrue(!deleted);
    assertEquals(Arrays.asList(1, 2, 3, 1, 4, 5, 1), toList(linkedList));
  }
}
