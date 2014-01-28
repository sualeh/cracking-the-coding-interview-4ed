package us.fatehi.sualeh.chapter04;


import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Comparator;

import org.junit.Before;
import org.junit.Test;

import us.fatehi.sualeh.testutil.TreeNodeTest;
import us.fatehi.sualeh.util.TreeNode;

public class TestQuestion04_6
  extends TreeNodeTest
{

  protected TreeNode[] nodes;

  @Override
  @Before
  public void setup()
  {
    super.setup();
    
    nodes = new TreeNode[unbalancedNodes.length];
    System.arraycopy(unbalancedNodes, 0, nodes, 0, unbalancedNodes.length);
    Arrays.sort(nodes, new Comparator<TreeNode>()
    {

      @Override
      public int compare(final TreeNode node1, final TreeNode node2)
      {
        return node1.value() - node2.value();
      }
    });
  }

  @Test
  public void test1Question04_6_2()
  {
    // Parent is common ancestor
    assertEquals(nodes[6], Question04_6_2.commonAncestor(unbalancedRoot,
                                                         nodes[8],
                                                         nodes[5]));
    // Common ancestor a few levels up
    assertEquals(nodes[7], Question04_6_2.commonAncestor(unbalancedRoot,
                                                         nodes[8],
                                                         nodes[2]));
    // Common ancestor is root
    assertEquals(unbalancedRoot, Question04_6_2.commonAncestor(unbalancedRoot,
                                                               nodes[8],
                                                               nodes[4]));
    // One node is the parent of another
    assertEquals(nodes[6], Question04_6_2.commonAncestor(unbalancedRoot,
                                                         nodes[8],
                                                         nodes[6]));
    // Same nodes
    assertEquals(nodes[8], Question04_6_2.commonAncestor(unbalancedRoot,
                                                         nodes[8],
                                                         nodes[8]));
  }

  @Test
  public void test1Question04_6_3()
  {
    // Parent is common ancestor
    assertEquals(nodes[6], Question04_6_3.commonAncestor(unbalancedRoot,
                                                         nodes[8],
                                                         nodes[5]));
    // Common ancestor a few levels up
    assertEquals(nodes[7], Question04_6_3.commonAncestor(unbalancedRoot,
                                                         nodes[8],
                                                         nodes[2]));
    // Common ancestor is root
    assertEquals(unbalancedRoot, Question04_6_3.commonAncestor(unbalancedRoot,
                                                               nodes[8],
                                                               nodes[4]));
    // One node is the parent of another
    assertEquals(nodes[6], Question04_6_3.commonAncestor(unbalancedRoot,
                                                         nodes[8],
                                                         nodes[6]));
    // Same nodes
    assertEquals(nodes[8], Question04_6_3.commonAncestor(unbalancedRoot,
                                                         nodes[8],
                                                         nodes[8]));
  }

}
