package us.fatehi.crack4.chapter02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static us.fatehi.crack4.chapter02.Question02_1.deleteDups;
import static us.fatehi.crack4.chapter02.Question02_1.deleteDups2;
import static us.fatehi.crack4.testutil.LinkedListNodeUtil.linkedList;
import static us.fatehi.crack4.testutil.LinkedListNodeUtil.toList;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import us.fatehi.crack4.util.LinkedListNode;

public class TestQuestion02_1 {

  @Test
  public void test1Question02_1() {
    final LinkedListNode linkedList = linkedList(1, 2, 3, 1, 4, 5, 1);
    deleteDups(linkedList);

    assertEquals(Arrays.asList(1, 2, 3, 4, 5), toList(linkedList));
  }

  @Test
  public void test2Question02_1() {
    final LinkedListNode linkedList = linkedList(1, 2, 3, 1, 4, 5, 1);
    deleteDups2(linkedList);

    assertEquals(Arrays.asList(1, 2, 3, 4, 5), toList(linkedList));
  }
}
