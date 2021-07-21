package us.fatehi.crack4.chapter03;

import java.util.Stack;

/**
 * 3.6 Write a program to sort a stack in ascending order. You should not make any assumptions about
 * how the stack is implemented. The following are the only functions that should be used to write
 * this program: push | pop | peek | isEmpty.
 */
public class Question03_6 {

  /*
   * Sorting can be performed with one more stack. The idea is to pull
   * an item from the original stack and push it on the other stack. If
   * pushing this item would violate the sort order of the new stack, we
   * need to remove enough items from it so that it’s possible to push
   * the new item. Since the items we removed are on the original stack,
   * we’re back where we started. The algorithm is O(N^2) and appears
   * below.
   */
  public static void sort(final Stack<Integer> s) {
    final Stack<Integer> r = new Stack<>();

    // Sort in descending order
    while (!s.isEmpty()) {
      final int tmp = s.pop();
      while (!r.isEmpty() && r.peek() < tmp) {
        s.push(r.pop());
      }
      r.push(tmp);
    }

    // Rebuild the stack in ascending order
    while (!r.isEmpty()) {
      s.push(r.pop());
    }
  }
}
