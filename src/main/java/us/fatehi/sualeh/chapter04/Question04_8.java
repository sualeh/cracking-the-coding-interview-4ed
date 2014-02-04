package us.fatehi.sualeh.chapter04;


import java.util.ArrayList;
import java.util.List;

import us.fatehi.sualeh.util.TreeNode;

/**
 * 4.8 You are given a binary tree in which each node contains a value.
 * Design an algorithm to print all paths which sum up to that value.
 * Note that it can be any path in the tree - it does not have to start
 * at the root.
 */
public class Question04_8
{

  /*
   * Let’s approach this problem by simplifying it. What if the path had
   * to start at the root? In that case, we would have a much easier
   * problem: Start from the root and branch left and right, computing
   * the sum thus far on each path. When we find the sum, we print the
   * current path. Note that we don’t stop just because we found the
   * sum. Why? Because we could have the following path (assume we are
   * looking for the sum 5): 2 + 3 + –4 + 3 + 1 + 2. If we stopped once
   * we hit 2 + 3, we’d miss several paths (2 + 3 + -4 + 3 + 1 and 3 +
   * -4 + 3 + 1 + 2). So, we keep going along every possible path. Now,
   * what if the path can start anywhere? In that case, we make a small
   * modification. On every node, we look “up” to see if we’ve found the
   * sum. That is—rather than asking “does this node start a path with
   * the sum?,” we ask “does this node complete a path with the sum?”
   */

  public static void findSum(final TreeNode head, final int sum)
  {
    findSum(head, sum, new ArrayList<Integer>(), 0);
  }

  private static void findSum(final TreeNode head,
                              final int sum,
                              final List<Integer> buffer,
                              final int level)
  {
    if (head == null)
    {
      return;
    }

    int tmp = sum;
    buffer.add(head.value());
    for (int i = level; i > -1; i--)
    {
      tmp -= buffer.get(i);
      if (tmp == 0)
      {
        print(buffer, i, level);
      }
    }
    final List<Integer> c1 = new ArrayList<>(buffer);
    final List<Integer> c2 = new ArrayList<>(buffer);
    findSum(head.left(), sum, c1, level + 1);
    findSum(head.right(), sum, c2, level + 1);
  }

  private static void print(final List<Integer> buffer,
                            final int level,
                            final int i2)
  {
    for (int i = level; i <= i2; i++)
    {
      System.out.print(buffer.get(i) + " ");
    }
    System.out.println();
  }

}
