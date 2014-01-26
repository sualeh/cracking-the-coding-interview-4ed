package us.fatehi.sualeh.chapter04;


import static org.junit.Assert.assertEquals;
import static us.fatehi.sualeh.chapter04.Question04_4.findLevelLinkList;
import static us.fatehi.sualeh.util.TreeNodePrinter.print;

import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import us.fatehi.sualeh.util.TreeNode;

public class TestQuestion04_4
{

  private TreeNode root;

  @Before
  public void setup()
  {
    root = new TreeNode(0);
    makeUnbalancedTree(root, 5, 0);
    print(root);
  }

  @Test
  public void test1Question04_4()
  {

    final List<LinkedList<TreeNode>> levelLinkList = findLevelLinkList(root);
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
    node.addLeft(nodeL);

    if (maxDepth % 2 == 0)
    {
      value++;
      nodeR = new TreeNode(value);
      node.addRight(nodeR);
    }

    makeUnbalancedTree(nodeL, maxDepth - 1, value);
  }

}
