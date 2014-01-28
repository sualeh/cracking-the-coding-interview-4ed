package us.fatehi.sualeh.chapter04;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static us.fatehi.sualeh.chapter04.Question04_1.isBalanced;
import static us.fatehi.sualeh.chapter04.Question04_1.maxDepth;
import static us.fatehi.sualeh.chapter04.Question04_1.minDepth;

import org.junit.Test;

import us.fatehi.sualeh.testutil.TreeNodeTest;

public class TestQuestion04_1
  extends TreeNodeTest
{

  @Test
  public void test1Question04_1()
  {

    assertTrue(isBalanced(balancedRoot));
    assertEquals(4, maxDepth(balancedRoot));
    assertEquals(4, minDepth(balancedRoot));

    assertTrue(!isBalanced(unbalancedRoot));
    assertEquals(5, maxDepth(unbalancedRoot));
    assertEquals(2, minDepth(unbalancedRoot));

  }

}
