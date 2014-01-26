package us.fatehi.sualeh.chapter04;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static us.fatehi.sualeh.chapter04.Question04_1.isBalanced;
import static us.fatehi.sualeh.chapter04.Question04_1.maxDepth;
import static us.fatehi.sualeh.chapter04.Question04_1.minDepth;

import org.junit.Before;
import org.junit.Test;

import us.fatehi.sualeh.util.TreeNode;
import us.fatehi.sualeh.util.TreeNodePrinter;

public class TestQuestion04_1
{

  private TreeNode balancedRoot;
  private TreeNode unbalancedRoot;

  @Before
  public void setup()
  {
    balancedRoot = new TreeNode();
    makeBalancedTree(balancedRoot, 4);
    TreeNodePrinter.print(balancedRoot);

    unbalancedRoot = new TreeNode();
    makeUnbalancedTree(unbalancedRoot, 4);
    TreeNodePrinter.print(unbalancedRoot);
  }

  @Test
  public void test1Question04_1()
  {

    assertTrue(isBalanced(balancedRoot));
    assertEquals(4, maxDepth(balancedRoot));
    assertEquals(4, minDepth(balancedRoot));

    assertTrue(!isBalanced(unbalancedRoot));
    assertEquals(4, maxDepth(unbalancedRoot));
    assertEquals(2, minDepth(unbalancedRoot));

  }

  private void makeBalancedTree(final TreeNode node, final int maxDepth)
  {
    if (maxDepth == 1 || node == null)
    {
      return;
    }

    TreeNode nodeL, nodeR;

    nodeL = new TreeNode();
    nodeR = new TreeNode();
    node.addLeft(nodeL);
    node.addRight(nodeR);

    makeBalancedTree(nodeL, maxDepth - 1);
    makeBalancedTree(nodeR, maxDepth - 1);
  }

  private void makeUnbalancedTree(final TreeNode node, final int maxDepth)
  {
    if (maxDepth == 1 || node == null)
    {
      return;
    }

    TreeNode nodeL, nodeR;

    nodeL = new TreeNode();
    nodeR = new TreeNode();
    node.addLeft(nodeL);
    node.addRight(nodeR);

    makeUnbalancedTree(nodeL, maxDepth - 1);
  }

}
