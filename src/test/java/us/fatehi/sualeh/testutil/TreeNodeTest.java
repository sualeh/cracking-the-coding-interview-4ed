package us.fatehi.sualeh.testutil;


import static us.fatehi.sualeh.util.TreeNodePrinter.print;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;

import us.fatehi.sualeh.util.TreeNode;

public class TreeNodeTest
{

  protected TreeNode balancedRoot;
  protected TreeNode unbalancedRoot;
  protected TreeNode[] unbalancedNodes;

  @Before
  public void setup()
  {
    balancedRoot = new TreeNode();
    makeBalancedTree(balancedRoot, 4);
    System.out.println("Balanced tree:");
    print(balancedRoot);

    unbalancedRoot = makeUnbalancedTree();
    System.out.println("Unbalanced tree:");
    print(unbalancedRoot);
    final List<TreeNode> knownTreeNodesList = new ArrayList<>();
    inOrder(knownTreeNodesList, unbalancedRoot);
    unbalancedNodes = knownTreeNodesList.toArray(new TreeNode[0]);
    System.out
      .println("Unbalanced tree nodes, in-order: " + knownTreeNodesList);
  }

  private void inOrder(final List<TreeNode> list, final TreeNode node)
  {
    if (node == null)
    {
      return;
    }

    inOrder(list, node.left());

    list.add(node);

    inOrder(list, node.right());
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
    node.addLeft(nodeL);
    node.addRight(nodeR);

    makeBalancedTree(nodeL, maxDepth - 1);
    makeBalancedTree(nodeR, maxDepth - 1);
  }

  private TreeNode makeUnbalancedTree()
  {
    final TreeNode[] nodes = new TreeNode[10];
    for (int i = 0; i < 10; i++)
    {
      nodes[i] = new TreeNode(i);
    }

    nodes[0].addLeft(nodes[7]);
    nodes[0].addRight(nodes[3]);
    nodes[7].addLeft(nodes[2]);
    nodes[7].addRight(nodes[6]);
    nodes[6].addLeft(nodes[5]);
    nodes[6].addRight(nodes[8]);
    nodes[3].addRight(nodes[9]);
    nodes[9].addLeft(nodes[4]);
    nodes[4].addLeft(nodes[1]);

    return nodes[0];
  }

}
