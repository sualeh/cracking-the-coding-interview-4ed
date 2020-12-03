package us.fatehi.sualeh.chapter02;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;
import static us.fatehi.sualeh.chapter02.Question02_1.deleteDups;
import static us.fatehi.sualeh.chapter02.Question02_1.deleteDups2;
import static us.fatehi.sualeh.testutil.LinkedListNodeUtil.linkedList;
import static us.fatehi.sualeh.testutil.LinkedListNodeUtil.toList;

import org.junit.jupiter.api.Test;

import us.fatehi.sualeh.util.LinkedListNode;

public class TestQuestion02_1 {

  @Test
  public void test1Question02_1() {
    final LinkedListNode linkedList = linkedList(1, 2, 3, 1, 4, 5, 1);
    deleteDups(linkedList);

    assertThat(toList(linkedList), hasItems(1, 2, 3, 4, 5));
  }

  @Test
  public void test2Question02_1() {
    final LinkedListNode linkedList = linkedList(1, 2, 3, 1, 4, 5, 1);
    deleteDups2(linkedList);

    assertThat(toList(linkedList), hasItems(1, 2, 3, 4, 5));
  }
}
