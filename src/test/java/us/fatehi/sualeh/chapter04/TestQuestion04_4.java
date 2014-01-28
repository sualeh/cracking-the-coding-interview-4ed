package us.fatehi.sualeh.chapter04;


import static org.junit.Assert.assertEquals;
import static us.fatehi.sualeh.chapter04.Question04_4.findLevelLinkList;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import us.fatehi.sualeh.testutil.TreeNodeTest;
import us.fatehi.sualeh.util.TreeNode;

public class TestQuestion04_4
  extends TreeNodeTest
{

  @Test
  public void test1Question04_4()
  {

    final List<LinkedList<TreeNode>> levelLinkList = findLevelLinkList(unbalancedRoot);
    assertEquals("[[0], [7, 3], [2, 6, 9], [5, 8, 4], [1]]", levelLinkList.toString());

  }

}
