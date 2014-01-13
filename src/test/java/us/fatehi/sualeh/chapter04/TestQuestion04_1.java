package us.fatehi.sualeh.chapter04;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import us.fatehi.sualeh.util.TreeNode;

public class TestQuestion04_1
{

  @Test
  public void test1Question04_1()
  {

    final TreeNode balancedRoot = new TreeNode();
    makeBalancedTree(balancedRoot, 4);

    final TreeNode unbalancedRoot = new TreeNode();
    makeUnbalancedTree(unbalancedRoot, 4);

    assertTrue(Question04_1.isBalanced(balancedRoot));
    assertEquals(4, Question04_1.maxDepth(balancedRoot));
    assertEquals(4, Question04_1.minDepth(balancedRoot));

    assertTrue(!Question04_1.isBalanced(unbalancedRoot));
    assertEquals(4, Question04_1.maxDepth(unbalancedRoot));
    assertEquals(2, Question04_1.minDepth(unbalancedRoot));

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
    node.left = nodeL;
    node.right = nodeR;

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
    node.left = nodeL;
    node.right = nodeR;

    makeUnbalancedTree(nodeL, maxDepth - 1);
  }

}
