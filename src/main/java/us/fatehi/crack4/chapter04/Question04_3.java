package us.fatehi.crack4.chapter04;

import us.fatehi.crack4.util.TreeNode;

/**
 * 4.3 Given a sorted (increasing order) array, write an algorithm to create a binary tree with
 * minimal height.
 */
public class Question04_3 {

  /*
   * We will try to create a binary tree such that for each node, the
   * number of nodes in the left subtree and the right subtree are
   * equal, if possible. Algorithm: 1. Insert into the tree the middle
   * element of the array. 2. Insert (into the left subtree) the left
   * subarray elements 3. Insert (into the right subtree) the right
   * subarray elements 4. Recurse
   */

  public static TreeNode createMinimalBST(final int array[]) {
    return addToTree(array, 0, array.length - 1);
  }

  private static TreeNode addToTree(final int arr[], final int start, final int end) {
    if (end < start) {
      return null;
    }

    final int mid = (start + end) / 2;
    final TreeNode n = new TreeNode(arr[mid]);

    n.addLeft(addToTree(arr, start, mid - 1));
    n.addRight(addToTree(arr, mid + 1, end));

    return n;
  }
}
