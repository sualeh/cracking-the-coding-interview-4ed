package us.fatehi.sualeh.chapter04;


import static org.junit.Assert.assertEquals;
import static us.fatehi.sualeh.util.TreeNodePrinter.print;

import org.junit.Before;
import org.junit.Test;

import us.fatehi.sualeh.util.TreeNode;

public class TestQuestion04_6
{

  private TreeNode[] nodes;

  @Before
  public void setup()
  {
    nodes = makeUnbalancedTree();
    final TreeNode root = nodes[0];
    print(root);
  }

  @Test
  public void test1Question04_6_2()
  {
    // Parent is common ancestor
    assertEquals(nodes[6],
                 Question04_6_2.commonAncestor(nodes[0], nodes[8], nodes[5]));
    // Common ancestor a few levels up
    assertEquals(nodes[7],
                 Question04_6_2.commonAncestor(nodes[0], nodes[8], nodes[2]));
    // Common ancestor is root
    assertEquals(nodes[0],
                 Question04_6_2.commonAncestor(nodes[0], nodes[8], nodes[4]));
    // One node is the parent of another
    assertEquals(nodes[6],
                 Question04_6_2.commonAncestor(nodes[0], nodes[8], nodes[6]));
    // Same nodes
    assertEquals(nodes[8],
                 Question04_6_2.commonAncestor(nodes[0], nodes[8], nodes[8]));
  }

  @Test
  public void test1Question04_6_3()
  {
    // Parent is common ancestor
    assertEquals(nodes[6],
                 Question04_6_3.commonAncestor(nodes[0], nodes[8], nodes[5]));
    // Common ancestor a few levels up
    assertEquals(nodes[7],
                 Question04_6_3.commonAncestor(nodes[0], nodes[8], nodes[2]));
    // Common ancestor is root
    assertEquals(nodes[0],
                 Question04_6_3.commonAncestor(nodes[0], nodes[8], nodes[4]));
    // One node is the parent of another
    assertEquals(nodes[6],
                 Question04_6_3.commonAncestor(nodes[0], nodes[8], nodes[6]));
    // Same nodes
    assertEquals(nodes[8],
                 Question04_6_3.commonAncestor(nodes[0], nodes[8], nodes[8]));
  }

  private TreeNode[] makeUnbalancedTree()
  {
    final TreeNode[] nodes = {
        new TreeNode(0),
        new TreeNode(1),
        new TreeNode(2),
        new TreeNode(3),
        new TreeNode(4),
        new TreeNode(5),
        new TreeNode(6),
        new TreeNode(7),
        new TreeNode(8),
        new TreeNode(9)
    };

    nodes[0].addLeft(nodes[7]);
    nodes[0].addRight(nodes[3]);
    nodes[7].addLeft(nodes[2]);
    nodes[7].addRight(nodes[6]);
    nodes[6].addLeft(nodes[5]);
    nodes[6].addRight(nodes[8]);
    nodes[3].addRight(nodes[9]);
    nodes[9].addLeft(nodes[4]);
    nodes[4].addLeft(nodes[1]);

    return nodes;
  }

}
