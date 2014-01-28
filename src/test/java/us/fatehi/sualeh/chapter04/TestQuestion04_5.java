package us.fatehi.sualeh.chapter04;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static us.fatehi.sualeh.chapter04.Question04_5.inorderSucc;

import org.junit.Test;

import us.fatehi.sualeh.testutil.TreeNodeTest;
import us.fatehi.sualeh.util.TreeNode;

public class TestQuestion04_5
  extends TreeNodeTest
{

  @Test
  public void test1Question04_5()
  {

    for (final TreeNode node: unbalancedNodes)
    {
      final TreeNode inorderSucc = inorderSucc(node);
      final int indexSucc = indexOf(node) + 1;
      if (indexSucc < unbalancedNodes.length)
      {
        assertEquals(unbalancedNodes[indexSucc], inorderSucc);
      }
      else
      {
        assertNull(inorderSucc);
      }
    }
  }

  private int indexOf(final TreeNode node)
  {
    for (int i = 0; i < unbalancedNodes.length; i++)
    {
      if (node.value() == unbalancedNodes[i].value())
      {
        return i;
      }
    }
    return -1;
  }

}
