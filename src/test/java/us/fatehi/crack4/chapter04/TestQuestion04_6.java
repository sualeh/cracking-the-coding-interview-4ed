package us.fatehi.crack4.chapter04;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Comparator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import us.fatehi.crack4.chapter04.Question04_6_2;
import us.fatehi.crack4.chapter04.Question04_6_3;
import us.fatehi.crack4.testutil.TreeNodeTest;
import us.fatehi.crack4.util.TreeNode;

public class TestQuestion04_6 extends TreeNodeTest {

  protected TreeNode[] nodes;

  @Override
  @BeforeEach
  public void setup() {
    super.setup();

    nodes = new TreeNode[unbalancedNodes.length];
    System.arraycopy(unbalancedNodes, 0, nodes, 0, unbalancedNodes.length);
    Arrays.sort(
        nodes,
        new Comparator<TreeNode>() {

          @Override
          public int compare(final TreeNode node1, final TreeNode node2) {
            return node1.value() - node2.value();
          }
        });
  }

  @Test
  public void test1Question04_6_2() {
    // Parent is common ancestor
    assertEquals(nodes[6], Question04_6_2.commonAncestor(unbalancedRoot, nodes[8], nodes[5]));
    // Common ancestor a few levels up
    assertEquals(nodes[7], Question04_6_2.commonAncestor(unbalancedRoot, nodes[8], nodes[2]));
    final Object one = unbalancedRoot;
    // Common ancestor is root
    assertEquals(one, Question04_6_2.commonAncestor(unbalancedRoot, nodes[8], nodes[4]));
    // One node is the parent of another
    assertEquals(nodes[6], Question04_6_2.commonAncestor(unbalancedRoot, nodes[8], nodes[6]));
    // Same nodes
    assertEquals(nodes[8], Question04_6_2.commonAncestor(unbalancedRoot, nodes[8], nodes[8]));
  }

  @Test
  public void test1Question04_6_3() {
    // Parent is common ancestor
    assertEquals(nodes[6], Question04_6_3.commonAncestor(unbalancedRoot, nodes[8], nodes[5]));
    // Common ancestor a few levels up
    assertEquals(nodes[7], Question04_6_3.commonAncestor(unbalancedRoot, nodes[8], nodes[2]));
    final Object one = unbalancedRoot;
    // Common ancestor is root
    assertEquals(one, Question04_6_3.commonAncestor(unbalancedRoot, nodes[8], nodes[4]));
    // One node is the parent of another
    assertEquals(nodes[6], Question04_6_3.commonAncestor(unbalancedRoot, nodes[8], nodes[6]));
    // Same nodes
    assertEquals(nodes[8], Question04_6_3.commonAncestor(unbalancedRoot, nodes[8], nodes[8]));
  }
}
