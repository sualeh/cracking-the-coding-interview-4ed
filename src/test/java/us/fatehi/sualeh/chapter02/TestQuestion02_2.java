package us.fatehi.sualeh.chapter02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static us.fatehi.sualeh.chapter02.Question02_2.nthToLast;
import static us.fatehi.sualeh.testutil.LinkedListNodeUtil.linkedList;

import org.junit.jupiter.api.Test;

import us.fatehi.sualeh.util.LinkedListNode;

public class TestQuestion02_2 {

  @Test
  public void test1Question02_2() {
    final LinkedListNode linkedList1 = linkedList(1, 2, 3, 1, 4, 5, 1);

    final LinkedListNode nthToLast_2 = nthToLast(linkedList1, 2);
    assertEquals(5, nthToLast_2.data);

    final LinkedListNode nthToLast_4 = nthToLast(linkedList1, 4);
    assertEquals(1, nthToLast_4.data);

    final LinkedListNode nthToLast_100 = nthToLast(linkedList1, 100);
    assertEquals(null, nthToLast_100);
  }
}
