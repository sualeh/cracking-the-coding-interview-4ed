package us.fatehi.sualeh.chapter02;


import java.util.HashMap;
import java.util.Map;

import us.fatehi.sualeh.util.LinkedListNode;

/**
 * 2.1 Write code to remove duplicates from an unsorted linked list.
 * FOLLOW UP How would you solve this problem if a temporary buffer is
 * not allowed?
 */
public class Question02_1
{

  // If we can use a buffer, we can keep track of elements in a
  // hashtable and remove any dupes
  public static void deleteDups(LinkedListNode n)
  {
    final Map<Integer, Boolean> table = new HashMap<>();
    LinkedListNode previous = null;
    while (n != null)
    {
      if (table.containsKey(n.data))
      {
        previous.next = n.next;
      }
      else
      {
        table.put(n.data, true);
        previous = n;
      }
      n = n.next;
    }
  }

  // Without a buffer, we can iterate with two pointers: “current” does
  // a normal iteration, while “runner” iterates through all prior nodes
  // to check for dups. Runner will only see one dup per node, because
  // if there were multiple duplicates they would have been removed
  // already.
  public static void deleteDups2(final LinkedListNode head)
  {
    if (head == null)
    {
      return;
    }
    LinkedListNode previous = head;
    LinkedListNode current = previous.next;
    while (current != null)
    {
      LinkedListNode runner = head;
      while (runner != current)
      { 
        // Check for earlier dupes
        if (runner.data == current.data)
        {
          final LinkedListNode tmp = current.next; // remove current
          previous.next = tmp;
          current = tmp; // update current to next node
          break; // all other dups have already been removed
        }
        runner = runner.next;
      }
      if (runner == current)
      { 
        // current not updated - update now
        previous = current;
        current = current.next;
      }
    }
  }

}
