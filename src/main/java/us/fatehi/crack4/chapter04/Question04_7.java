package us.fatehi.crack4.chapter04;

import us.fatehi.crack4.util.TreeNode;

/**
 * 4.7 You have two very large binary trees: T1, with millions of nodes, and T2, with hundreds of
 * nodes. Create an algorithm to decide if T2 is a subtree of T1.
 */
public class Question04_7 {

  /*
   * The treeMatch procedure visits each node in the small tree at most
   * once and is called no more than once per node of the large tree.
   * Worst case runtime is at most O(n * m), where n and m are the sizes
   * of trees T1 and T2, respectively. If k is the number of occurrences
   * of T2's root in T1, the worst case runtime can be characterized as
   * O(n + k * m).
   */

  public static boolean containsTree(final TreeNode t1, final TreeNode t2) {
    // The empty tree is always a subtree
    if (t2 == null) {
      return true;
    } else {
      return subTree(t1, t2);
    }
  }

  private static boolean matchTree(final TreeNode r1, final TreeNode r2) {
    // nothing left in the subtree
    if (r2 == null && r1 == null) {
      return true;
    }

    // big tree empty & subtree still not found
    // data doesn't match
    if (r1 == null || r2 == null || (r1.value() != r2.value())) {
      return false;
    }

    return matchTree(r1.left(), r2.left()) && matchTree(r1.right(), r2.right());
  }

  private static boolean subTree(final TreeNode r1, final TreeNode r2) {
    // big tree empty subtree still not found
    if (r1 == null) {
      return false;
    }
    if (r1.value() == r2.value()) {
      if (matchTree(r1, r2)) {
        return true;
      }
    }
    return subTree(r1.left(), r2) || subTree(r1.right(), r2);
  }
}
