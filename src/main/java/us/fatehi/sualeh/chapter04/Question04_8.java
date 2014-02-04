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
                              final List<Integer> path,
                              final int level)
  {
    if (head == null)
    {
      return;
    }

    path.add(head.value());
    int tmp = sum;
    for (int i = level; i > -1; i--)
    {
      tmp -= path.get(i);
      if (tmp == 0)
      {
        printSubPath(path, i, level);
      }
    }
    final List<Integer> path1 = new ArrayList<>(path);
    final List<Integer> path2 = new ArrayList<>(path);
    findSum(head.left(), sum, path1, level + 1);
    findSum(head.right(), sum, path2, level + 1);
  }

  private static void printSubPath(final List<Integer> path,
                                   int from,
                                   final int to)
  {
    System.out.println(path.subList(from, to + 1));
  }

}
