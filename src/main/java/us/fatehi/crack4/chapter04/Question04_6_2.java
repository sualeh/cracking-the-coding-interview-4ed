package us.fatehi.crack4.chapter04;

import us.fatehi.crack4.util.TreeNode;

/**
 * 4.6 Design an algorithm and write code to find the first common ancestor of two nodes in a binary
 * tree. Avoid storing additional nodes in a data structure. NOTE: This is not necessarily a binary
 * search tree.
 */
public class Question04_6_2 {
  /*
   * Alternatively, you could follow a chain in which p and q are on the
   * same side. That is, if p and q are both on the left of the node,
   * branch left to look for the common ancestor. When p and q are no
   * longer on the same side, you must have found the first common
   * ancestor.
   */
  public static TreeNode commonAncestor(final TreeNode root, final TreeNode p, final TreeNode q) {
    if (covers(root.left(), p) && covers(root.left(), q)) {
      return commonAncestor(root.left(), p, q);
    }
    if (covers(root.right(), p) && covers(root.right(), q)) {
      return commonAncestor(root.right(), p, q);
    }
    return root;
  }

  private static boolean covers(final TreeNode root, final TreeNode p) {
    /* is p a child of root? */
    if (root == null) {
      return false;
    }
    if (root == p) {
      return true;
    }
    return covers(root.left(), p) || covers(root.right(), p);
  }

  /*
   * What is the running time of this algorithm? One way of looking at
   * this is to see how many times each node is touched. Covers touches
   * every child node, so we know that every single node in the tree
   * must be touched at least once, and many nodes are touched multiple
   * times.
   */
}
