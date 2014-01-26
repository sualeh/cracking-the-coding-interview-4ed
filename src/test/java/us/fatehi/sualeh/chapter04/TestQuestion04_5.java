package us.fatehi.sualeh.chapter04;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static us.fatehi.sualeh.chapter04.Question04_5.inorderSucc;
import static us.fatehi.sualeh.util.TreeNodePrinter.print;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import us.fatehi.sualeh.util.TreeNode;

public class TestQuestion04_5
{

  private List<Integer> inorderNodes;
  private TreeNode[] nodes;

  @Before
  public void setup()
  {
    nodes = makeUnbalancedTree();
    final TreeNode root = nodes[0];
    print(root);

    inorderNodes = new ArrayList<>();
    inOrder(inorderNodes, root);
    System.out.println("in-order traversal: " + inorderNodes);
  }

  @Test
  public void test1Question04_5()
  {

    for (final TreeNode node: nodes)
    {
      final TreeNode inorderSucc = inorderSucc(node);
      final int indexSucc = inorderNodes.lastIndexOf(node.value()) + 1;
      if (indexSucc < inorderNodes.size())
      {
        assertEquals(inorderNodes.get(indexSucc).intValue(),
                     inorderSucc.value());
      }
      else
      {
        assertNull(inorderSucc);
      }
    }
  }

  private void inOrder(final List<Integer> list, final TreeNode root)
  {
    if (root == null)
    {
      return;
    }

    inOrder(list, root.left());

    list.add(root.value());

    inOrder(list, root.right());
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
