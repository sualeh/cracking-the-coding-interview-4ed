package us.fatehi.sualeh.chapter04;


import us.fatehi.sualeh.util.TreeNode;

/**
 * 4.1 Implement a function to check if a tree is balanced. For the
 * purposes of this question, a balanced tree is defined to be a tree
 * such that no two leaf nodes differ in distance from the root by more
 * than one.
 */
public class Question04_1
{
  public static boolean isBalanced(final TreeNode root)
  {
    return maxDepth(root) - minDepth(root) <= 1;
  }

  public static int maxDepth(final TreeNode root)
  {
    if (root == null)
    {
      return 0;
    }
    return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
  }

  public static int minDepth(final TreeNode root)
  {
    if (root == null)
    {
      return 0;
    }
    return 1 + Math.min(minDepth(root.left), minDepth(root.right));
  }

}
