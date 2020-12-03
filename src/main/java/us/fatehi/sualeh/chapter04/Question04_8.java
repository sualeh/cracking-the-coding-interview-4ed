package us.fatehi.sualeh.chapter04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import us.fatehi.sualeh.util.TreeNode;

/**
 * 4.8 You are given a binary tree in which each node contains a value. Design an algorithm to print
 * all paths which sum up to that value. Note that it can be any path in the tree - it does not have
 * to start at the root.
 */
public class Question04_8 {

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
   * sum. That is — rather than asking “does this node start a path with
   * the sum?,” we ask “does this node complete a path with the sum?”
   */

  public static Collection<List<Integer>> findSum(final TreeNode head, final int sum) {
    return findSum(head, sum, new ArrayList<Integer>());
  }

  private static Collection<List<Integer>> findSum(
      final TreeNode head, final int sum, final List<Integer> path) {
    final Collection<List<Integer>> sumPaths = new HashSet<>();

    if (head == null) {
      return sumPaths;
    }

    path.add(head.value());
    final int pathLength = path.size();

    int tmp = sum;
    for (int i = pathLength - 1; i > -1; i--) {
      tmp -= path.get(i);
      if (tmp == 0) {
        sumPaths.add(path.subList(i, pathLength));
      }
    }

    // Traverse left and right, with copies of the current path
    final Collection<List<Integer>> sumPathsLeft = findSum(head.left(), sum, new ArrayList<>(path));
    final Collection<List<Integer>> sumPathsRight =
        findSum(head.right(), sum, new ArrayList<>(path));

    sumPaths.addAll(sumPathsLeft);
    sumPaths.addAll(sumPathsRight);

    return sumPaths;
  }
}
