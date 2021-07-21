package us.fatehi.crack4.chapter04;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static us.fatehi.crack4.chapter04.Question04_4.findLevelLinkList;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

import us.fatehi.crack4.testutil.TreeNodeTest;
import us.fatehi.crack4.util.TreeNode;

public class TestQuestion04_4 extends TreeNodeTest {

  @Test
  public void test1Question04_4() {

    final List<LinkedList<TreeNode>> levelLinkList = findLevelLinkList(unbalancedRoot);
    assertEquals("[[0], [7, 3], [2, 6, 9], [5, 8, 4], [1]]", levelLinkList.toString());
  }
}
