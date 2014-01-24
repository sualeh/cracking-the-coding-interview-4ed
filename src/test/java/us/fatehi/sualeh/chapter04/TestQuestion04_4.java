package us.fatehi.sualeh.chapter04;


import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import us.fatehi.sualeh.util.TreeNode;
import us.fatehi.sualeh.util.TreeNodePrinter;

public class TestQuestion04_4
{

  @Test
  public void test1Question04_3()
  {

    final TreeNode root = new TreeNode(0);
    makeUnbalancedTree(root, 5, 0);
    TreeNodePrinter.print(root);

    final List<LinkedList<TreeNode>> levelLinkList = Question04_4
      .findLevelLinkList(root);
    System.out.println(levelLinkList);
    assertEquals(levelLinkList.toString(), "[[0], [1], [2, 3], [4], [5, 6]]");

  }

  private void makeUnbalancedTree(final TreeNode node,
                                  final int maxDepth,
                                  final int lastValue)
  {
    if (maxDepth == 1 || node == null)
    {
      return;
    }

    int value = lastValue;

    TreeNode nodeL, nodeR;

    value++;
    nodeL = new TreeNode(value);
    node.left = nodeL;

    if (maxDepth % 2 == 0)
    {
      value++;
      nodeR = new TreeNode(value);
      node.right = nodeR;
    }

    makeUnbalancedTree(nodeL, maxDepth - 1, value);
  }

}
