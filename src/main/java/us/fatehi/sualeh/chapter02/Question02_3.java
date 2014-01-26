package us.fatehi.sualeh.chapter02;


import us.fatehi.sualeh.util.LinkedListNode;

/**
 * 2.3 Implement an algorithm to delete a node in the middle of a single
 * linked list, given only access to that node. EXAMPLE Input: the node
 * ‘c’ from the linked list a->b->c->d->e Result: nothing is returned,
 * but the new linked list looks like a->b->d->e
 */
public class Question02_3
{

  /*
   * The solution to this is to simply copy the data from the next node
   * into this node and then delete the next node. NOTE: This problem
   * can not be solved if the node to be deleted is the last node in the
   * linked list. That’s ok - your interviewer wants to see you point
   * that out. You could consider marking it as dummy in that case. This
   * is an issue you should discuss with your interviewer.
   */
  public static boolean deleteNode(final LinkedListNode n)
  {
    if (n == null || n.next == null)
    {
      return false; // Failure
    }

    final LinkedListNode next = n.next;
    n.data = next.data;
    n.next = next.next;

    return true;
  }

}
