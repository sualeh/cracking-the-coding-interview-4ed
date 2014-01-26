package us.fatehi.sualeh.chapter04;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Test;

import us.fatehi.sualeh.util.TreeNode;
import us.fatehi.sualeh.util.TreeNodePrinter;

public class TestQuestion04_5
{

  @Test
  public void test1Question04_5()
  {

    final Collection<TreeNode> nodes = new ArrayList<>();

    final TreeNode root = new TreeNode(0);
    nodes.add(root);
    makeUnbalancedTree(nodes, root, 5, 0);
    TreeNodePrinter.print(root);

    // Get list of nodes in order
    final List<Integer> list = new ArrayList<>();
    inOrder(list, root);
    System.out.println("in-order traversal: " + list);

    for (final TreeNode node: nodes)
    {
      final TreeNode inorderSucc = Question04_5.inorderSucc(node);
      final int indexSucc = list.lastIndexOf(node.value()) + 1;
      if (indexSucc < list.size())
      {
        assertEquals(list.get(indexSucc).intValue(), inorderSucc.value());
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

  private void makeUnbalancedTree(final Collection<TreeNode> nodes,
                                  final TreeNode node,
                                  final int maxDepth,
                                  final int lastValue)
  {
    TreeNode _2 = new TreeNode(2), _4 = new TreeNode(4), _3 = new TreeNode(3), _5 = new TreeNode(5), _7 = new TreeNode(7), _6 = new TreeNode(6), _8 = new TreeNode(8), _9 = new TreeNode(9);
    node.addLeft(_7);
    node.addRight(_3);
    _7.addLeft(_2);
    _7.addRight(_6);
    _6.addLeft(_5);
    _6.addRight(_8);
    _3.addRight(_9);
    _9.addLeft(_4);
    
    nodes.add(node);
    nodes.add(_2);
    nodes.add(_3);
    nodes.add(_4);
    nodes.add(_5);
    nodes.add(_6);
    nodes.add(_7);
    nodes.add(_8);
    nodes.add(_9);
  }

}
