package us.fatehi.crack4.chapter02;

import us.fatehi.crack4.util.LinkedListNode;

/**
 * 2.4 You have two numbers represented by a linked list, where each node contains a single digit.
 * The digits are stored in reverse order, such that the 1's digit is at the head of the list. Write
 * a function that adds the two numbers and returns the sum as a linked list. EXAMPLE Input: (3 -> 1
 * -> 5), (5 -> 9 -> 2) Output: 8 -> 0 -> 8
 */
public class Question02_4 {

  /*
   * We can implement this recursively by adding node by node, just as
   * we would digit by digit. 1. result.data = (node1 + node2 + any
   * earlier carry) % 10 2. if node1 + node2 > 10, then carry a 1 to the
   * next addition. 3. add the tails of the two nodes, passing along the
   * carry.
   */
  public static LinkedListNode addLists(
      final LinkedListNode l1, final LinkedListNode l2, final boolean carry) {
    if (l1 == null && l2 == null) {
      return null;
    }

    int value = carry ? 1 : 0;
    if (l1 != null) {
      value = value + l1.data;
    }
    if (l2 != null) {
      value = value + l2.data;
    }

    final LinkedListNode result = new LinkedListNode(value % 10);

    final LinkedListNode more =
        addLists(l1 == null ? null : l1.next, l2 == null ? null : l2.next, value >= 10);
    result.next = more;

    return result;
  }
}
