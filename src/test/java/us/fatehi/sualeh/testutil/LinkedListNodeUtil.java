package us.fatehi.sualeh.testutil;


import java.util.ArrayList;
import java.util.List;

import us.fatehi.sualeh.util.LinkedListNode;

public class LinkedListNodeUtil
{

  public static LinkedListNode linkedList(final int... items)
  {
    if (items == null || items.length == 0)
    {
      return null;
    }

    final LinkedListNode head = new LinkedListNode(items[0]);
    LinkedListNode prev = head;
    if (items.length > 1)
    {
      for (int i = 1; i < items.length; i++)
      {
        final LinkedListNode next = new LinkedListNode(items[i]);
        prev.next = next;
        prev = next;
      }
    }
    return head;
  }

  public static List<Integer> toList(final LinkedListNode head)
  {
    if (head == null)
    {
      return null;
    }

    final List<Integer> list = new ArrayList<>();
    LinkedListNode n = head;
    while (n.next != null)
    {
      list.add(n.data);
      n = n.next;
    }
    // Last one
    list.add(n.data);
    
    return list;
  }

}
