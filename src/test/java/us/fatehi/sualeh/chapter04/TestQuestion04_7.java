package us.fatehi.sualeh.chapter04;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static us.fatehi.sualeh.chapter04.Question04_7.containsTree;

import org.junit.jupiter.api.Test;

import us.fatehi.sualeh.testutil.TreeNodeTest;
import us.fatehi.sualeh.util.TreeNode;

public class TestQuestion04_7 extends TreeNodeTest {

  @Test
  public void test1Question04_7() {
    assertTrue(containsTree(unbalancedRoot, unbalancedNodes[2]));
    assertTrue(containsTree(unbalancedRoot, unbalancedNodes[8]));

    assertTrue(!containsTree(unbalancedRoot, new TreeNode()));
    assertTrue(!containsTree(unbalancedRoot, balancedRoot.left()));

    assertTrue(containsTree(unbalancedRoot, null));
  }
}
